package com.rinfotek.iiserp.service;

import java.util.List;

import com.rinfotek.iiserp.entity.StudentMaster;

public interface StudentMasterService {
	StudentMaster addStudent(StudentMaster student);

	StudentMaster getStudentMasterById(Integer sId);

	void updateStudentMaster(StudentMaster student);

	void deleteStudentMasterById(Integer sId);

	List<StudentMaster> getAllStudents();
}
