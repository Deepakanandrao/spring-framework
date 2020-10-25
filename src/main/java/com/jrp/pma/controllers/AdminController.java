package com.jrp.pma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jrp.pma.dao.iAdminRepository;
import com.jrp.pma.entities.Admin;

@Controller
@RequestMapping("/admins")
public class AdminController {

	@Autowired
	iAdminRepository adminRepo;
	
	public AdminController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping("/new")
	public String displayForm(Model model) {
		
		Admin adminModel = new Admin();
		model.addAttribute("newAdminModel", adminModel);
		return "new-admin";
	}
	
	@PostMapping("/save")
	public String createAdmin(Admin admin, Model model) {
		adminRepo.save(admin);
		return "redirect:/admins/new";
	}

}
