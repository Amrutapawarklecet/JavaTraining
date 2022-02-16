package sandip.util;

import org.springframework.stereotype.Component;

import sandip.model.Student;

@Component
public class StudentUtil {

	public void mapToActualObject(Student actual, Student student) {
		if(student.getName()!=null)
			actual.setName(student.getName());
		actual.setFee(student.getFee());
		actual.setCourse(student.getCourse());
		if(student.getEmail()!=null)
			actual.setEmail(student.getEmail());
		actual.setAddr(student.getAddr());
		actual.setCollegename(student.getCollegename());
		if(student.getPhoneno()!=null)
			actual.setPhoneno(student.getPhoneno());

	}

}
