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

import com.rinfotek.iiserp.entity.Exam;
import com.rinfotek.iiserp.service.ExamService;

@RestController
@RequestMapping("/exam")
public class ExamController {

	
	
		@Autowired
		ExamService examService;

		// Insert user record
		@PostMapping("/create")
		@ResponseStatus(HttpStatus.CREATED)
		public Exam addExam(@RequestBody Exam exam) {
			return examService.addExam(exam);
		}

		// Fetch all user records
		@GetMapping
		public List<Exam> getAllExams() {
			return examService.getAllExams();
		}

	//Fetch single user
		@GetMapping("/{id}")
		public Exam getExamById(@PathVariable("id") int eId) {// pass variable userId
			return examService.getExamById(eId);
		}

		// Update user record
		@PutMapping("/updateexam")
		public ResponseEntity<String> updateExam(@RequestBody Exam exam) {
			try {
				examService.updateExam(exam);
				return new ResponseEntity<String>(HttpStatus.OK);
			} catch (NoSuchElementException ex) {// NoSuchElementException
				// log the error message
				System.out.println(ex.getMessage());
				return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
			}
		}

		// Delete user record
		@DeleteMapping("/{id}")
		public ResponseEntity<String> deleteExam(@RequestBody int id) {// delete by id
			try {
				examService.deleteExamById(id);
				return new ResponseEntity<String>(HttpStatus.OK);
			} catch (RuntimeException ex) {// RuntimeException
				// log the error message
				System.out.println(ex.getMessage());
				return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
			}
		}

	}
