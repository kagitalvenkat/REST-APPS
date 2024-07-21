package in.sbms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sbms.entity.Student;
import in.sbms.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository sRepo;
	
	public String addStudent(Student student) {
		sRepo.save(student);
		return "Record inserted successfully";
	}
	
	public String addStudents(List<Student> student) {
		sRepo.saveAll(student);
		return "Records inserted successfully";
	}
	
	public Student getStudent(Integer studentId) {
		Optional<Student> optional = sRepo.findById(studentId);
		Student student = null;
		if(optional.isPresent()) {
			 student = optional.get();			
		}
		return student;
	}
	
	
	public List<Student> getAllStudents() {
		List<Student> students = sRepo.findAll();		
		return students;
	}
	
	public List<Student> getStudentsByAge(Integer studentAge){
		List<Student> studntRecordsByAge = sRepo.findByStudentAgeGreaterThanEqual(studentAge);		
		return studntRecordsByAge;		
	}
	
	
	public Student updateStudent(Integer studentId,Student student) {
		Optional<Student> optional = sRepo.findById(studentId);
		Student updatedStudentObj = null;
		if(optional.isPresent()) {
			Student sru = optional.get(); //sru -> studentRecordUpdated data
			sru.setStudentName(student.getStudentName());
			sru.setStudentEmail(student.getStudentEmail());
			sru.setStudentAge(student.getStudentAge());
			updatedStudentObj = sRepo.save(sru);
		}
		return updatedStudentObj;
	}
	
	public void deleteRecordById(Integer studentId) {
		sRepo.deleteById(studentId);
	}

}
