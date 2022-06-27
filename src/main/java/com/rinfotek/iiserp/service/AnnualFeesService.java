package com.rinfotek.iiserp.service;

import java.util.List;

import com.rinfotek.iiserp.entity.AnnualFees;


public interface AnnualFeesService {

	AnnualFees addAnnualFees(AnnualFees annualfees);

	AnnualFees getAnnualFeesById(int aId);

	void updateAnnualFees(AnnualFees annualfees);

	void deleteAnnualFeesById(int id);

	List<AnnualFees> getAllAnnualFees();
}