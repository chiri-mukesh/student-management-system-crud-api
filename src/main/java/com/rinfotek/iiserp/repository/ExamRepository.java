package com.rinfotek.iiserp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rinfotek.iiserp.entity.Exam;

@Repository
public interface ExamRepository extends JpaRepository<Exam,Integer> {

}
