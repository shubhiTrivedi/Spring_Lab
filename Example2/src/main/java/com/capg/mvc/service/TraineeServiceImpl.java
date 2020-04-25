package com.capg.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.capg.mvc.dao.TraineeRepository;
import com.capg.mvc.entities.Trainee;
import com.capg.mvc.exception.ApplicationException;


@Service
@Transactional
public class TraineeServiceImpl implements TraineeService {
	@Autowired
	private TraineeRepository repository;
	
	
	
	@Override
	public Trainee addTrainee(Trainee trainee) {
		
		return repository.addTrainee(trainee);
	}
	
	@Override
	   public void delete(int traineeId) {
				
				Trainee t=repository.findById(traineeId);
				
				if(t!=null){
					repository.delete(traineeId);
				}
				else{
			           throw new ApplicationException("Trainee with "+traineeId+" doesn't exists!");
			    	}
				
			}
	   @Override
	   public Trainee find(int traineeId) {
	        Trainee t=repository.findById(traineeId);
	        if(t!=null)
	    		return repository.findById(traineeId);
	        else
	    		 throw new ApplicationException("Trainee with "+traineeId+" doesn't exists!");
			
		}
	   @Override
	   public void modify(Trainee t) {
			// TODO Auto-generated method stub
			Trainee t1=repository.findById(t.getTraineeId());
			
			if(t1!=null){
				repository.modify(t);
			}
			else
		           throw new ApplicationException("Trainee with "+t1.getTraineeId()+" doesn't exists!");
		    	
			 	
		}
	   
	   
	   @Transactional(readOnly=true)
	    
	    public List<Trainee> getAll() {
	        return  repository.findAll();
	    }
	   
	
	
	

}
