package com.rinfotek.iiserp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rinfotek.iiserp.entity.DAndGActivity;
@Repository
public interface DAndGActivityRepository extends JpaRepository<DAndGActivity,Integer> {

}
