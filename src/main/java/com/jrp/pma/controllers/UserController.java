package com.jrp.pma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jrp.pma.dao.iUserRepository;
import com.jrp.pma.entities.User;

@Controller
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	iUserRepository userRepo;
	
	public UserController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping("/new")
	public String displayForm (Model model) {
		
		//Create the Form object instance
		User newUserModel = new User();
		model.addAttribute("newUserModel", newUserModel);
		return "new-user";
	}
	
	@PostMapping("/save")
	public String createUser(User user, Model model) {
		userRepo.save(user);
		return "redirect:/users/new";
	}
}
 