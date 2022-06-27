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

import com.rinfotek.iiserp.entity.Attendance;
import com.rinfotek.iiserp.service.AttendanceService;



@RestController
@RequestMapping("/attendance")
public class AttendanceController {

			@Autowired
			AttendanceService attendanceService;

			// Insert user record
			@PostMapping("/create")
			@ResponseStatus(HttpStatus.CREATED)
			public Attendance addAttendance(@RequestBody Attendance attendance) {
				return attendanceService.addAttendance(attendance);
			}

			// Fetch all user records
			@GetMapping
			public List<Attendance> getAllAttendances() {
				return attendanceService.getAllAttendances();
			}

		//Fetch single user
			@GetMapping("/{id}")
			public Attendance getAttendanceById(@PathVariable("id") int aId) {// pass variable userId
				return attendanceService.getAttendanceById(aId);
			}

			// Update user record
			@PutMapping("/updateattendance")
			public ResponseEntity<String> updateAttendance(@RequestBody Attendance attendance) {
				try {
					attendanceService.updateAttendance(attendance);
					return new ResponseEntity<String>(HttpStatus.OK);
				} catch (NoSuchElementException ex) {// NoSuchElementException
					// log the error message
					System.out.println(ex.getMessage());
					return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
				}
			}

			// Delete user record
			@DeleteMapping("/{id}")
			public ResponseEntity<String> deleteAttendance(@RequestBody int id) {// delete by id
				try {
					attendanceService.deleteAttendanceById(id);
					return new ResponseEntity<String>(HttpStatus.OK);
				} catch (RuntimeException ex) {// RuntimeException
					// log the error message
					System.out.println(ex.getMessage());
					return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
				}
			}

		}
