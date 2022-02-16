package sandip.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import sandip.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>
{

}
