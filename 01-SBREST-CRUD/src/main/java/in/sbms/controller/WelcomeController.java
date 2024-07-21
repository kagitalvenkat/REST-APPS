package in.sbms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.sbms.entity.Student;
import in.sbms.service.StudentService;

@RestController
public class WelcomeController {
	
	@Autowired
	private StudentService service;
	
	@Value("${msg.welcomemsg}")
	private String welcomeMsg;
	
	@GetMapping("/welcome")
	public String welcomeMsg(){
		return  welcomeMsg;
	}

	@PostMapping(value = "/addStudent",
			consumes = {"application/json","application/xml"})
	public ResponseEntity<String> addStudent(@RequestBody Student student) {
		String msg  = service.addStudent(student);
		return new ResponseEntity<>(msg,HttpStatus.CREATED);
	}
	
	@PostMapping(value = "/addStudents")
	public ResponseEntity<String> addStudents(@RequestBody List<Student> student) {
		String msg  = service.addStudents(student);
		return new ResponseEntity<>(msg,HttpStatus.CREATED);
	}
	
	
	@GetMapping(value = "/getStudent/{studentId}")
	public ResponseEntity<Student> getStudent(@PathVariable Integer studentId){
		Student student = service.getStudent(studentId);
		System.out.println(student);
		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}
	
	
	@GetMapping("/getStudents")
	public ResponseEntity<List<Student>> getAllStudents(){
		List<Student> students = service.getAllStudents();
		return new ResponseEntity<>(students,HttpStatus.OK);
	}
	
	
	@GetMapping(value="/getStudentsByAge")
	public ResponseEntity<List<Student>> getStudentsByAge(@RequestParam Integer studentAge){
		List<Student> studentsByAge = service.getStudentsByAge(studentAge);
		return new ResponseEntity<>(studentsByAge, HttpStatus.OK);
	}
	
	@PutMapping(value="/updateStudent/{studentId}")
	public ResponseEntity<Student> updateStudent(@PathVariable Integer studentId ,@RequestBody Student student){
		Student updateStudent = service.updateStudent(studentId,student);
		return new ResponseEntity<>(updateStudent, HttpStatus.OK);
	}
	
	
	@DeleteMapping(value = "/deleteId/{studentId}")
	public ResponseEntity<Student> deleteRecordById(@PathVariable Integer studentId) {
		service.deleteRecordById(studentId);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
