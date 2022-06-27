package com.rinfotek.iiserp.service;

import java.util.List;

import com.rinfotek.iiserp.entity.Exam;


public interface ExamService {
	Exam addExam(Exam exam);

	Exam getExamById(int eId);

	void updateExam(Exam exam);

	void deleteExamById(int id);

	List<Exam> getAllExams();

}
