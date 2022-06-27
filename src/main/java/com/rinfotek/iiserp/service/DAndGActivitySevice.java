package com.rinfotek.iiserp.service;

import java.util.List;

import com.rinfotek.iiserp.entity.DAndGActivity;

public interface DAndGActivitySevice {
	DAndGActivity addDAndGActivity(DAndGActivity activity);

	DAndGActivity getDAndGById(int dId);

	void updateDAndGActivity(DAndGActivity activity);

	void deleteDAndGActivityById(int id);

	List<DAndGActivity> getAllDAndGActivitys();

}
