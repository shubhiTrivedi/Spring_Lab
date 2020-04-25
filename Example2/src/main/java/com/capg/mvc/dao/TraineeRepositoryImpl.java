package com.capg.mvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import com.capg.mvc.entities.Trainee;

@Repository
public class TraineeRepositoryImpl implements TraineeRepository {
	//private JdbcTemplate template;
	@PersistenceContext
	public EntityManager manager;
	
	

@Override
	public Trainee addTrainee(Trainee trainee) {
	
		manager.persist(trainee);
		return trainee;
	}
@Override
public void delete(Integer traineeId) {
	
	Trainee tr=  manager.find(Trainee.class, traineeId);
	 manager.remove(tr);
	
	
}
@Override
public Trainee findById(Integer traineeId) {
    return  manager.find(Trainee.class, traineeId);
}

@Override
public void modify(Trainee t) {
	 manager.merge(t);
}
@Override
public List<Trainee> findAll() {
    Query q =  manager.createQuery("from Trainee t");
    return q.getResultList();
}



}
