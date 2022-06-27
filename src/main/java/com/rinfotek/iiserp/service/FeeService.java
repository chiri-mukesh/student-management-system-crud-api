package com.rinfotek.iiserp.service;

import java.util.List;

import com.rinfotek.iiserp.entity.Fee;

public interface FeeService {
	
	Fee addFee(Fee fee);

	Fee getFeeById(int fId);

	void updateFee(Fee fee);

	void deleteFeeById(int id);

	List<Fee> getAllFees();

}
