package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentService {

	private static final Student True = null;
	private static final int Student = 0;
	@Autowired
	StudentRepo studentRepository;
	
	public Student saveOneStudent(Student student) {
		return studentRepository.save(student);
	}
	
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}
	
	public Student updateStudentName(int id, String name) {
		
		Student obj=null;
		
		List<Student> list = studentRepository.findAll();
		
		for(Student student : list) {
			if(id==student.getStudentId()) {
				student.setFirstName(name);
				obj = student;
			}
			
		}
		studentRepository.save(obj);
		
		return obj;
		
	}
	
	public Optional<Student> getStudentById(int id){
		return studentRepository.findById((long) id);
	}

	public Student deleteStudent(long id) {
		// TODO Auto-generated method stub
		if (studentRepository.existsById(id)) {
			studentRepository.deleteById(id);
		return True;
		}
		return null;
	}

	public List<Student> addmany(List<Student> list) {
		studentRepository.saveAll(list);
		return studentRepository.findAll();
	}

	public List<Student> findbyfirstname(String name) {
		// TODO Auto-generated method stub
		return  studentRepository.findByfirstName(name);
	}
	public List <Student> findBylastname(String name) {
		// TODO Auto-generated method stub
		return  studentRepository.findBylastname(name);
	}
	public List <Student> findbygurdianName(String name) {
		// TODO Auto-generated method stub
		return  studentRepository.findByfirstName(name);
	}
	public List <Student> findbyemail(String name) {
		// TODO Auto-generated method stub
		return  studentRepository.findByfirstName(name);
	}
	public List<Student> findbyFirstNameAndMail(String name, String mail) {
		// TODO Auto-generated method stub
		return  studentRepository.findByFirstNameAndEmailId(name,mail);
	}
	
	public int updateFirstNameBasedOnEmail(String firstName, String email) {
		return studentRepository.updateFirstNameBasedOnEmail(firstName, email);
	}
	
	
	
	
	
	
}
