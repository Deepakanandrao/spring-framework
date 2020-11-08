package com.jrp.pma.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jrp.pma.dao.iUserRepository;
import com.jrp.pma.entities.User;

import java.util.List;

@Controller
@RequestMapping("/dashboard")
public class AdminDashboard {
	
	@Autowired
	iUserRepository usersRepo;
	
	public AdminDashboard() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping("/get-users")
	public String displayRecords(Model model) {
		List<User> users = usersRepo.findAll();
		model.addAttribute("usersList", users);
		return "admin/admin-dashboard";
	}
}



/*
 * package com.jrp.pma.controllers;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.ui.Model; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.RequestMapping;
 * 
 * import com.jrp.pma.dao.iUserRepository; import com.jrp.pma.entities.User;
 * 
 * @Controller
 * 
 * @RequestMapping("/users") public class UserController {
 * 
 * @Autowired iUserRepository userRepo;
 * 
 * public UserController() { // TODO Auto-generated constructor stub }
 * 
 * @RequestMapping("/new") public String displayForm (Model model) {
 * 
 * //Create the Form object instance User newUserModel = new User();
 * model.addAttribute("newUserModel", newUserModel); return "admin-dashboard"; }
 * 
 * @PostMapping("/save") public String createUser(User user, Model model) {
 * userRepo.save(user); return "redirect:/users/new"; } }
 */