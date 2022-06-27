package com.rinfotek.iiserp.service;

import java.util.List;

import com.rinfotek.iiserp.entity.Attendance;


public interface AttendanceService {
	Attendance addAttendance(Attendance attendance);

	Attendance getAttendanceById(int aId);

	void updateAttendance(Attendance attendance);

	void deleteAttendanceById(int id);

	List<Attendance> getAllAttendances();
}
