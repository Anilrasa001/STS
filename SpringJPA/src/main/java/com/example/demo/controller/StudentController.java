package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@PostMapping("/saveStudent")
	public Student saveOneStudent(@RequestBody Student student) {
		return studentService.saveOneStudent(student);
	}
	
	@GetMapping("getStudents")
	public List<Student> getAllstudents() {
		return studentService.getAllStudents();
	}
	
	@PutMapping("/updateStudentName/{id}/{name}")
	public Student updateStudentName(@PathVariable("id")  int id, @PathVariable("name") String name) {
        return studentService.updateStudentName(id,name);
	}
	
	@GetMapping("/getbyid/{id}")
    public Optional<Student> getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

	
	@DeleteMapping("/deleteStudent/{id}")
		public Student deleteStudent(@PathVariable("id") int id) {
			return studentService.deleteStudent(id);
		}
	@PostMapping("/addmany")
	public List<Student> addmany(@RequestBody  List<Student> list) {
		return studentService.addmany(list);
		
	}
	
	@GetMapping("/findbyfirstname/{name}")
	public List <Student> findbyfirstname(@PathVariable ("name") String name)
	{
		return studentService.findbyfirstname(name);
	}
	@GetMapping("findbylastname/{name}")
	public List <Student> findBylastname(@PathVariable ("name") String name)
	{
		return studentService.findbyfirstname( name);
	}
	@GetMapping("findbygurdiaNname/{name}")
	public Student findbygurdianName(@PathVariable ("name") String name)
	{
		return (Student) studentService.findbygurdianName(name);
	}
	@GetMapping("/getbynameandemail/{name}/{mail}")
	public List <Student> findbyFirstNameAndMail(@PathVariable String name, @PathVariable String mail){
		return  studentService.findbyFirstNameAndMail(name, mail);
		
	}
	@PutMapping("updateFirstNameOnEmail/{firstName}/{email}")
	public String updateFirstNameBasedOnEmail(@PathVariable("firstName") String firstName, @PathVariable("email") String email) {
		String message = "";
		if(studentService.updateFirstNameBasedOnEmail(firstName, email)>0) {
			message = "Data updated successfully!";
		} else {
			message = "No reords with the firstName "+firstName+" found!";
		}
		
		return message;
	}

}
	



