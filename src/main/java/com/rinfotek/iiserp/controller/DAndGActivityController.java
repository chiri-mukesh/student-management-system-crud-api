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

import com.rinfotek.iiserp.entity.DAndGActivity;

import com.rinfotek.iiserp.service.DAndGActivitySevice;

@RestController
@RequestMapping("/d&gActivity")
public class DAndGActivityController {

	
	

		
		
			@Autowired
			DAndGActivitySevice DAndGService;

			// Insert user record
			@PostMapping("/create")
			@ResponseStatus(HttpStatus.CREATED)
			public DAndGActivity addDAndGActivity(@RequestBody DAndGActivity activity) {
				return DAndGService.addDAndGActivity(activity);
			}

			// Fetch all user records
			@GetMapping
			public List<DAndGActivity> getAllDAndGActivitys() {
				return DAndGService.getAllDAndGActivitys();
			}

		//Fetch single user
			@GetMapping("/{id}")
			public DAndGActivity getDAndGById(@PathVariable("id") int dId) {// pass variable userId
				return DAndGService.getDAndGById(dId);
			}

			// Update user record
			@PutMapping("/updatedandgactivity")
			public ResponseEntity<String> updateDAndGActivity(@RequestBody DAndGActivity activity) {
				try {
					DAndGService.updateDAndGActivity(activity);
					return new ResponseEntity<String>(HttpStatus.OK);
				} catch (NoSuchElementException ex) {// NoSuchElementException
					// log the error message
					System.out.println(ex.getMessage());
					return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
				}
			}

			// Delete user record
			@DeleteMapping("/{id}")
			public ResponseEntity<String> deleteDAndGActivity(@RequestBody int id) {// delete by id
				try {
					DAndGService.deleteDAndGActivityById(id);
					return new ResponseEntity<String>(HttpStatus.OK);
				} catch (RuntimeException ex) {// RuntimeException
					// log the error message
					System.out.println(ex.getMessage());
					return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
				}
			}

		}
