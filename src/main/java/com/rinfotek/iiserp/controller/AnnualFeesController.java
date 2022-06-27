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

import com.rinfotek.iiserp.entity.AnnualFees;
import com.rinfotek.iiserp.service.AnnualFeesService;

@RestController
@RequestMapping("/annualfees")
public class AnnualFeesController {
	
			@Autowired
			AnnualFeesService annualfeesService;

			// Insert user record
			@PostMapping("/create")
			@ResponseStatus(HttpStatus.CREATED)
			public AnnualFees addAnnualFees(@RequestBody AnnualFees annualfees) {
				return annualfeesService.addAnnualFees(annualfees);
			}

			// Fetch all user records
			@GetMapping
			public List<AnnualFees> getAllAnnualFees() {
				return annualfeesService.getAllAnnualFees();
			}

		//Fetch single user
			@GetMapping("/{id}")
			public AnnualFees getAnnualFeesById(@PathVariable("id") int aId) {// pass variable userId
				return annualfeesService.getAnnualFeesById(aId);
			}

			// Update user record
			@PutMapping("/updateannualfees")
			public ResponseEntity<String> updateAnnualFees(@RequestBody AnnualFees annualfees) {
				try {
					annualfeesService.updateAnnualFees(annualfees);
					return new ResponseEntity<String>(HttpStatus.OK);
				} catch (NoSuchElementException ex) {// NoSuchElementException
					// log the error message
					System.out.println(ex.getMessage());
					return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
				}
			}

			// Delete user record
			@DeleteMapping("/{id}")
			public ResponseEntity<String> deleteAnnualFees(@RequestBody int id) {// delete by id
				try {
					annualfeesService.deleteAnnualFeesById(id);
					return new ResponseEntity<String>(HttpStatus.OK);
				} catch (RuntimeException ex) {// RuntimeException
					// log the error message
					System.out.println(ex.getMessage());
					return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
				}
			}

		}
