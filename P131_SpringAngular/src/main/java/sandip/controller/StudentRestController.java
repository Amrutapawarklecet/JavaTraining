package sandip.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sandip.model.Student;
import sandip.service.IStudentService;
import sandip.util.StudentUtil;

@RestController
@RequestMapping("/rest/student")
@CrossOrigin(origins = "http://localhost:4200")
public class StudentRestController {

	private Logger log = LoggerFactory.getLogger(StudentRestController.class);

	@Autowired
	private IStudentService service;
	@Autowired
	private StudentUtil util;

	/**
	 * 1. Read JSON(Student) and convert to Object Format
	 *    Store data in Database. Return one Message.
	 */
	@PostMapping("/save")
	public ResponseEntity<String> saveStudent(
			@RequestBody Student student)
	{
		log.info("Entered into method with Student data to save");

		ResponseEntity<String> resp = null;
		try {

			log.info("About to call save Operation");

			Integer id = service.saveStudent(student);
			log.debug("Student saved with id "+id);

			String body = "Student '"+id+"' created";

			resp =  new ResponseEntity<String>(
					body,HttpStatus.CREATED); //201

			log.info("Sucess response constructed");
		} catch (Exception e) {
			log.error("Unable to save student : problem is :"+e.getMessage());
			resp =  new ResponseEntity<String>(
					"Unable to Create Student", 
					HttpStatus.INTERNAL_SERVER_ERROR); //500
			e.printStackTrace();
		}

		log.info("About to Exist save method with Response");
		return resp;
	}

	/**
	 * 2. Fetch all rows from database using Service
	 *    Sort data using name, return as JSON, 
	 *    else String message no data found.
	 *    
	 */
	@GetMapping("/all")
	public ResponseEntity<?> getAllStudents() {
		log.info("Entered into method to fetch Students data");
		ResponseEntity<?> resp = null ;
		try {

			log.info("About to call fetch student service");
			List<Student> list = service.getAllStudents();
			if(list!=null && !list.isEmpty()) {
				log.info("Data is not empty=>"+list.size());
				list.sort((s1,s2)->s1.getName().compareTo(s2.getName()));
				/* JDK 1.8
				list = list.stream()
						.sorted((s1,s2)->s1.getName().compareTo(s2.getName()))
						.collect(Collectors.toList());
				 */
				resp = new ResponseEntity<List<Student>>(list, HttpStatus.OK);
			} else {
				log.info("No Student exist: size "+list.size());

				//resp = new ResponseEntity<>(HttpStatus.NO_CONTENT);
				resp = new ResponseEntity<String>(
						"No Students Found",
						HttpStatus.OK);
			}
		} catch (Exception e) {
			log.error("Unable to fetch students : problem is :"+e.getMessage());

			resp =  new ResponseEntity<String>(
					"Unable to Fetch Students", 
					HttpStatus.INTERNAL_SERVER_ERROR); //500
			e.printStackTrace();
		}
		log.info("About to Exist fetch all method with Response");
		return resp;
	}


	/***
	 * 3. Get one student object based on ID (PathVariable). 
	 *   If Object exist then return Student object 
	 *   else provide message(String).
	 */
	@GetMapping("/one/{id}")
	public ResponseEntity<?> getOneStudent(
			@PathVariable Integer id
			) 
	{
		log.info("Entered into Get one Student method");
		ResponseEntity<?> resp = null;
		try {
			log.info("About to make service call to fetch one record");
			Optional<Student> opt =  service.getOneStudent(id);
			if(opt.isPresent()) {
				log.info("Student exist=>"+id);
				resp = new ResponseEntity<Student>(opt.get(), HttpStatus.OK);
				//resp = ResponseEntity.ok(opt.get());
			} else {
				log.warn("Given Student id not exist=>"+id);
				resp = new ResponseEntity<String>(
						"Student '"+id+"' not exist", 
						HttpStatus.BAD_REQUEST);
			}
		} catch (Exception e) {
			log.error("Unable to process request fetch " + e.getMessage());
			resp = new ResponseEntity<String>(
					"Unable to process student fetch", 
					HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}

		return resp;
	}


	/**
	 * 4. delete one row based on id (PathVariable)
	 *    First check given row exist or not?
	 *    if exist then call delete operation
	 *    else return  NO RECORD MESSAGE
	 *    
	 */

	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> removeStudent(
			@PathVariable Integer id
			)
	{

		log.info("Entered into delete method");
		ResponseEntity<String> resp = null;

		try {

			log.info("About to make service call for data check");
			boolean exist = service.isStudentExist(id);
			if(exist) {
				service.deleteStudent(id);
				log.info("Student exist with given id and deleted=>"+id);
				resp = new ResponseEntity<String>(
						"Student '"+id+"' deleted",
						HttpStatus.OK);
			} else {
				log.warn("Given Student id not exist =>"+id);
				resp = new ResponseEntity<String>(
						"Student '"+id+"' not exist",
						HttpStatus.BAD_REQUEST);
			}
		} catch (Exception e) {
			log.error("Unable to perform Delete Operation =>" + e.getMessage());
			resp = new ResponseEntity<String>(
					"Unable to delete", 
					HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}

		return resp;
	}

	/**
	 * 5. Update
	 */
	@PutMapping("/modify/{id}")
	public ResponseEntity<String> updateStudent(
			@PathVariable Integer id,
			@RequestBody Student student
			)
	{
		log.info("Entered into Update method");

		ResponseEntity<String> resp =null;

		try {
			log.info("About to check given id exist or not db");
			Optional<Student> opt =  service.getOneStudent(id);
			if(opt.isPresent()) {
				log.info("Student present in database");
				Student actual = opt.get();
				util.mapToActualObject(actual,student);
				service.updateStudent(actual);
				resp = new ResponseEntity<String>(
						"Student '"+id+"' Updated", 
						//HttpStatus.RESET_CONTENT
						HttpStatus.OK
						);
				log.info("Student update done successfully");
			} else {
				log.info("Student not exist=>"+id);
				resp = new ResponseEntity<String>(
						"Student '"+id+"' not found", 
						//HttpStatus.RESET_CONTENT
						HttpStatus.BAD_REQUEST
						);
			}

		} catch (Exception e) {
			log.error("Unable to perform Update Operation=>" + e.getMessage() );
			resp = new ResponseEntity<String>(
					"Unable to process Update",
					HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}

		return resp;
	}


}
