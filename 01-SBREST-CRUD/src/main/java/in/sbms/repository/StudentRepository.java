package in.sbms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.sbms.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	List<Student> findByStudentAgeGreaterThanEqual(Integer age);

}
