package com.rinfotek.iiserp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.rinfotek.iiserp.entity.StudentMaster;
import com.rinfotek.iiserp.repository.StudentMasterRepository;

@Service
public  class StudentMasterServiceImpl implements StudentMasterService {


@Autowired
private StudentMasterRepository repository;

@Override
public StudentMaster addStudent(StudentMaster student) {
	return repository.save(student);
}

@Override
public StudentMaster getStudentMasterById(Integer sId) {
	return repository.findById(sId).get();
}

@Override
public List<StudentMaster> getAllStudents() {
	return repository.findAll();
}

@Override
public void updateStudentMaster(StudentMaster student) {
	// check if the user with the passed id exists or not
	StudentMaster studentMasterDB = repository.findById(student.getsId()).orElseThrow();
	// If user exists then updated
	repository.save(student);
}

@Override
public void deleteStudentMasterById(Integer sId) {
	try {
		repository.deleteById(sId);
	} catch (DataAccessException ex) {
		throw new RuntimeException(ex.getMessage());
	}
}

}
