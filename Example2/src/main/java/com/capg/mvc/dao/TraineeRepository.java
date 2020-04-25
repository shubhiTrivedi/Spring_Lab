package com.capg.mvc.dao;

import java.util.List;

import com.capg.mvc.entities.Trainee;

public interface TraineeRepository {
	
	
      public Trainee addTrainee(Trainee trainee);
      public void delete(Integer traineeId);
      public Trainee findById(Integer traineeId);
      
      public void modify(Trainee t);
      public List<Trainee> findAll();
      
      
}


