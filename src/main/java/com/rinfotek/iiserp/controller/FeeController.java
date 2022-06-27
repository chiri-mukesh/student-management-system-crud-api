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

import com.rinfotek.iiserp.entity.Fee;

import com.rinfotek.iiserp.service.FeeService;

@RestController
@RequestMapping("/fee")
public class FeeController {
	@Autowired
	FeeService feeService;

	// Insert user record
	@PostMapping("/create")
	@ResponseStatus(HttpStatus.CREATED)
	public Fee addFee(@RequestBody Fee fee) {
		return feeService.addFee(fee);
	}

	// Fetch all user records
	@GetMapping
	public List<Fee> getAllFees() {
		return feeService.getAllFees();
	}

//Fetch single user
	@GetMapping("/{id}")
	public Fee getFeeById(@PathVariable("id") int fId) {// pass variable userId
		return feeService.getFeeById(fId);
	}

	// Update user record
	@PutMapping("/updatefee")
	public ResponseEntity<String> updateFee(@RequestBody Fee fee) {
		try {
			feeService.updateFee(fee);
			return new ResponseEntity<String>(HttpStatus.OK);
		} catch (NoSuchElementException ex) {// NoSuchElementException
			// log the error message
			System.out.println(ex.getMessage());
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		}
	}

	// Delete user record
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteFee(@RequestBody int id) {// delete by id
		try {
			feeService.deleteFeeById(id);
			return new ResponseEntity<String>(HttpStatus.OK);
		} catch (RuntimeException ex) {// RuntimeException
			// log the error message
			System.out.println(ex.getMessage());
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		}
	}

}
