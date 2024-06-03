package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.entity.Admin;
import com.demo.service.AdminService;

import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;


@Controller
public class AdminController {
   @Autowired
   AdminService adminservice;
	
   @GetMapping("/welcome")
	public String welcome() {
		return "Welcome";
   }
   
   @GetMapping("/home")
	public String home() {
		return "home";
	}
   
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@PostMapping("/login")
	public String adminlogin(@RequestParam("adminId") String adminId, @RequestParam ("password") String password,Model model,HttpSession session) {
		Admin admin=adminservice.getAdminbyAdminId(adminId);
		if(admin!=null && admin.getPassword().equals(password)) {
			session.setAttribute("admin", admin);
			return "Welcome";
		}
		model.addAttribute("error", "Invalid Credentials");
		return "login";
		}

	@GetMapping("/logout")
	 public String logout() {
		return "redirect:/login";
	}
	
	@GetMapping("/changepassword")
	public String changePassPage() {
		return "changepassword";
	}
	
	@PostMapping("/changepassword")
	public String changePassword(@RequestParam String password, @RequestParam String newpassword, @RequestParam String confirmpassword,Model model ,HttpSession session) {
		if(!newpassword.equals(confirmpassword)) {
			model.addAttribute("change", "new password and confirm password not same");
			return "changepassword";
		}
		boolean b=adminservice.changePassword(password, newpassword, session);
		System.out.println(b);
		if(b) {
			session.invalidate();
			return "redirect:/login";
		}
		else {
			return "changepassword";
		}
	}
	
}
