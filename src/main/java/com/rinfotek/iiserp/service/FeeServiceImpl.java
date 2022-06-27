package com.rinfotek.iiserp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.rinfotek.iiserp.entity.Fee;
import com.rinfotek.iiserp.repository.FeeRepository;


@Service
public class FeeServiceImpl implements FeeService {

	@Autowired
	private FeeRepository repository;

	@Override
	public Fee addFee(Fee fee) {
		return repository.save(fee);
	}

	@Override
	public Fee getFeeById(int fId) {
		return repository.findById(fId).get();
	}

	@Override
	public List<Fee> getAllFees() {
		return repository.findAll();
	}

	@Override
	public void updateFee(Fee fee) {
		// check if the user with the passed id exists or not
		Fee feeDB = repository.findById(fee.getfId()).orElseThrow();
		// If user exists then updated
		repository.save(fee);
	}

	@Override
	public void deleteFeeById(int id) {
		try {
			repository.deleteById(id);
		} catch (DataAccessException ex) {
			throw new RuntimeException(ex.getMessage());
		}
	}
	}
