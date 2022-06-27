package com.rinfotek.iiserp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.rinfotek.iiserp.entity.Exam;
import com.rinfotek.iiserp.repository.ExamRepository;

@Service
public class ExamServiceImpl implements ExamService {

	@Autowired
	private ExamRepository repository;

	public Exam addExam(Exam exam) {
		return repository.save(exam);
	}

	@Override
	public Exam getExamById(int eId) {
		return repository.findById(eId).get();
	}

	@Override
	public List<Exam> getAllExams() {
		return repository.findAll();
	}

	public void updateExam(Exam exam) {
		// check if the user with the passed id exists or not
		Exam examDB = repository.findById(exam.geteId()).orElseThrow();
		// If user exists then updated
		repository.save(exam);
	}

	public void deleteExamById(int id) {
		try {
			repository.deleteById(id);
		} catch (DataAccessException ex) {
			throw new RuntimeException(ex.getMessage());
		}
	}
	}


