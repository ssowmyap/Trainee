package com.cg.dao;

import java.util.ArrayList;

import com.cg.bean.Trainee;

public interface TraineeDao {

	int addTrainee(Trainee trainee);
	int modifyTrainee(Trainee trainee);
	int deleteTrainee(int id);
	Trainee getById(int id);
	ArrayList<Trainee> getAll();

	
}
