package com.rinfotek.iiserp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.rinfotek.iiserp.entity.DAndGActivity;
import com.rinfotek.iiserp.repository.DAndGActivityRepository;


@Service
public class DAndGActivityServiceImpl implements DAndGActivitySevice {

	@Autowired
	private DAndGActivityRepository repository;

	public DAndGActivity addDAndGActivity(DAndGActivity activity) {
		return repository.save(activity);
	}

	public DAndGActivity getDAndGById(int dId) {
		return repository.findById(dId).get();
	}

	public List<DAndGActivity> getAllDAndGActivitys() {
		return repository.findAll();
	}

	public void updateDAndGActivity(DAndGActivity activity) {
		// check if the user with the passed id exists or not
		DAndGActivity DAndGDB = repository.findById(activity.getdId()).orElseThrow();
		// If user exists then updated
		repository.save(activity);
	}

	public void deleteDAndGActivityById(int id) {
		try {
			repository.deleteById(id);
		} catch (DataAccessException ex) {
			throw new RuntimeException(ex.getMessage());
		}
	}
	}
