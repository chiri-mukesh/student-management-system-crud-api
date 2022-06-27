package com.rinfotek.iiserp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.rinfotek.iiserp.entity.Attendance;
import com.rinfotek.iiserp.repository.AttendanceRepository;


@Service
public class AttendanceServiceImpl implements AttendanceService {
	@Autowired
	private AttendanceRepository repository;

	public Attendance addAttendance(Attendance attendance) {
		return repository.save(attendance);
	}

	@Override
	public Attendance getAttendanceById(int aId) {
		return repository.findById(aId).get();
	}

	@Override
	public List<Attendance> getAllAttendances() {
		return repository.findAll();
	}

	public void updateAttendance(Attendance attendance) {
		// check if the user with the passed id exists or not
		Attendance attendanceDB = repository.findById(attendance.getaId()).orElseThrow();
		// If user exists then updated
		repository.save(attendance);
	}

	public void deleteAttendanceById(int id) {
		try {
			repository.deleteById(id);
		} catch (DataAccessException ex) {
			throw new RuntimeException(ex.getMessage());
		}
	}
	}


