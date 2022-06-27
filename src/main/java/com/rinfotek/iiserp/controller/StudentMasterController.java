package com.rinfotek.iiserp.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.rinfotek.iiserp.entity.StudentMaster;
import com.rinfotek.iiserp.service.StudentMasterService;

@RestController
@RequestMapping("/student")
public class StudentMasterController {



	@Autowired
	StudentMasterService studentService;

	
	//Insert user record
	@PostMapping("/create")
	@ResponseStatus(HttpStatus.CREATED)
	public StudentMaster addStudent(@RequestBody StudentMaster student) {
		return studentService.addStudent(student);
	
	}
	
	//Fetch all user records
	@GetMapping
	public List<StudentMaster> getAllStudents() {
		return studentService.getAllStudents();	
	}
	
	
//Fetch single user
	@GetMapping("/{id}")//int-->Integer
	public StudentMaster getStudentMasterById(@PathVariable("id") Integer sId) {//pass variable userId
	return studentService.getStudentMasterById(sId);
}
	//Update user record
	@PutMapping("/updatestudent")
	public ResponseEntity<String> updateStudentMaster(@RequestBody StudentMaster student){
		try {
			studentService.updateStudentMaster(student);
			return new ResponseEntity<String>(HttpStatus.OK);
		}
		catch(NoSuchElementException ex) {//NoSuchElementException
			//log the error message
			System.out.println(ex.getMessage());
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		}
	}
	//Delete user record
	@DeleteMapping("/{id}")//int-->Integer
	public ResponseEntity<String> deleteStudentMaster(@RequestBody Integer id){//delete by id
		try {
			studentService.deleteStudentMasterById(id);
			return new ResponseEntity<String>(HttpStatus.OK);
		}
		catch(RuntimeException ex) {//RuntimeException
			//log the error message
			System.out.println(ex.getMessage());
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		}
	}
	
}
