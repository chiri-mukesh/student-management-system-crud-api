package com.rinfotek.iiserp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rinfotek.iiserp.entity.AnnualFees;
@Repository
public interface AnnualFeesRepository extends JpaRepository<AnnualFees,Integer> {

}
