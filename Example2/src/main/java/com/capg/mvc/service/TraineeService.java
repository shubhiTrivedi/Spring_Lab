package com.capg.mvc.service;

import java.util.List;

import com.capg.mvc.entities.Trainee;

public interface TraineeService {
	
	
	public Trainee addTrainee(Trainee trainee);
	public void delete(int traineeId);
	Trainee find(int traineeId);
	 public void modify(Trainee t);
	 List<Trainee> getAll();
	
	

}
