package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;

import jakarta.transaction.Transactional;
@Repository
public interface StudentRepo extends JpaRepository<Student,Long> {
	public List<Student> findByfirstName(String name);
	public List<Student> findBylastname(String name);
	public List<Student> findByEmailId(String name);
	@Query
	("select u from Student u where u.firstName=?1 and emailId=?2")
		List <Student> findByFirstNameAndEmailId(String name, String emailId);
	
	@Modifying
	 @Transactional
	  @Query(
			value="update Student set firstName=?1 where emailId=?2",nativeQuery=true)
	public int updateFirstNameBasedOnEmail(String name,String emailId);
}


