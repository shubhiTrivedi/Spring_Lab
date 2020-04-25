package com.capg.mvc.controller;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.capg.mvc.entities.Trainee;
import com.capg.mvc.service.TraineeService;

@Controller
public class TraineeController {
	
	@Autowired
	private TraineeService service;
	
	
	//Login
	@RequestMapping(value="/login",method= {RequestMethod.POST})
	public String loggedIn(Model model,@RequestParam("uname")String uname,@RequestParam("upass")String upass){
		if(uname.equals("admin")&&upass.equals("admin123"))				
		return "operations";
		else
			return "login";
	}
	
	
	//Adding
	@RequestMapping(value="/addTrainee",method=RequestMethod.GET)
	public String add(){

			return "addTrainee";
	}
	
	
	@Transactional
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String addTrainee(@ModelAttribute("trainee")Trainee trainee,ModelMap map) {
		 Trainee savedTrainee = service.addTrainee(trainee);
		 if(savedTrainee!=null)
		 map.addAttribute("msg", "trainee saved in DB with Id:"+savedTrainee.getTraineeId());
		 else
		 map.addAttribute("msg", "trainee not saved in DB ");
				 
		 return "result";
	}
	
	//Delete Trainee
			@RequestMapping(value="/deletetrainee",method=RequestMethod.GET)
			public String delete(Model model) {
				model.addAttribute("msg"," Delete Trainee");
				return "deletetrainee";
			}
			
			@RequestMapping(value="/delete",method=RequestMethod.POST)
			public String deleteById(Model model,@RequestParam("traineeId") int traineeId) {
				model.addAttribute("list",this.service.find(traineeId));
				return "deletetrainee";
			}
			
			@RequestMapping(value="/deletetrainee/{traineeId}",method=RequestMethod.POST)
			public String delete(Model model,@PathVariable("traineeId") int traineeId) {
				service.delete(traineeId);
				return "deletetrainee";
			}
			
			
			//modify trainee
			@RequestMapping(value="/modifytrainee",method=RequestMethod.GET)
			public String modify(Model model) {
			model.addAttribute("msg"," modify Trainee");
				return "modifytrainee";
			}
			
			@RequestMapping(value="/modify",method=RequestMethod.POST)
			public String modifyById(Model model,@RequestParam("traineeId") int traineeId) {
				model.addAttribute("list",this.service.find(traineeId));
				return "modifytrainee";
			}
			
			@RequestMapping(value="/modifytrainee",method=RequestMethod.POST)
			public String modify(Model model,@ModelAttribute("trainee") Trainee trainee) {
				service.modify(trainee);
				model.addAttribute("msg","Trainee "+trainee.getTraineeId()+" modified");
				return "modifytrainee";
			}
			
			
			//retrieve trainee by id
			@RequestMapping(value="/retrievetrainee",method=RequestMethod.GET)
			public String retrieve(Model model) {
				model.addAttribute("msg","Retrieve Trainee");
				return "retrievetrainee";
			}
			
			@RequestMapping(value="/retrieve",method=RequestMethod.POST)
			public String retrievebyid(Model model,@RequestParam("traineeId") int traineeId ) {
				
				model.addAttribute("list",this.service.find(traineeId));
				
				return "retrievetrainee";
			}
			
			//for retrieving all trainee
			@RequestMapping(value="/retrievealltrainee",method=RequestMethod.GET)
			public String retrieveall(Model model) {
				
				model.addAttribute("list", this.service.getAll());
				
				return "retrievealltrainee";
			}
		

	
}
