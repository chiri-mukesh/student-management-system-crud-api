package com.rinfotek.iiserp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rinfotek.iiserp.entity.Attendance;
@Repository
public interface AttendanceRepository extends JpaRepository<Attendance,Integer> {

}
