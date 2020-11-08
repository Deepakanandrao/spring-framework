package com.jrp.pma.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jrp.pma.dao.iAdminRepository;
import com.jrp.pma.dao.iUserRepository;
import com.jrp.pma.entities.Admin;
import com.jrp.pma.entities.User;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	iAdminRepository adminRepo;
	
	@Autowired
	iUserRepository userRepo;
	
	public AdminController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping("/new")
	public String displayForm(Model model) {
		Admin adminModel = new Admin();
		List<User> users = userRepo.findAll();
		
		model.addAttribute("newAdminModel", adminModel);
		model.addAttribute("all_users", users);
		
		return "admin/new-admin";
	}
	
	@PostMapping("/save")
	public String createAdmin(Admin admin, Model model) {
		adminRepo.save(admin);
		return "redirect:new";
	}

}
