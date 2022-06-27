package com.rinfotek.iiserp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rinfotek.iiserp.entity.StudentMaster;
@Repository
public interface StudentMasterRepository extends JpaRepository<StudentMaster,Integer> {

}
