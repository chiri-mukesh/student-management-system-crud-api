package com.rinfotek.iiserp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.rinfotek.iiserp.entity.AnnualFees;

import com.rinfotek.iiserp.repository.AnnualFeesRepository;

@Service
public class AnnualFeesServiceImpl implements AnnualFeesService {
	@Autowired
	private AnnualFeesRepository repository;

	public AnnualFees addAnnualFees(AnnualFees annualfees) {
		return repository.save(annualfees);
	}

	@Override
	public AnnualFees getAnnualFeesById(int aId) {
		return repository.findById(aId).get();
	}

	@Override
	public List<AnnualFees> getAllAnnualFees() {
		return repository.findAll();
	}

	public void updateAnnualFees(AnnualFees annualfees) {
		// check if the user with the passed id exists or not
		AnnualFees annualfeesDB = repository.findById(annualfees.getaId()).orElseThrow();
		// If user exists then updated
		repository.save(annualfees);
	}

	public void deleteAnnualFeesById(int id) {
		try {
			repository.deleteById(id);
		} catch (DataAccessException ex) {
			throw new RuntimeException(ex.getMessage());
		}
	}
	}


