package com.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.webapp.entity.Registration;
import com.webapp.service.Registrationservice;

@Controller
public class RgistrationController {
	@Autowired
	private Registrationservice service;

	@RequestMapping("/viewReg")
	public String ViewReg() {
		return "new_reg";
	}

	@RequestMapping("/savereg")
	public String SaveRegistration(@RequestParam("name") String name, @RequestParam("city") String city,
			@RequestParam("email") String email, @RequestParam("mobile") long mobile, ModelMap model) {
		Registration reg = new Registration();
		reg.setName(name);
		reg.setCity(city);
		reg.setEmail(email);
		reg.setMobile(mobile);
		service.SaveRegistration(reg);
		model.addAttribute("msg", "saved!!!");
		return "new_reg";
	}

	@RequestMapping("/AllReg")
	public String ListReg(ModelMap model) {
		List<Registration> reg = service.ListReg();
		model.addAttribute("registration", reg);
		return "list_reg";
	}

	@RequestMapping("/delete")
	public String DeleteReg(@RequestParam("id") long id, ModelMap model) {
		service.DeleteReg(id);
		List<Registration> reg = service.ListReg();
		model.addAttribute("registration", reg);
		return "list_reg";
	}

	@RequestMapping("/getRegistrationById")
	public String getRegistration(@RequestParam("id") long id, ModelMap model) {
		Registration reg = service.getRegistration(id);
		model.addAttribute("reg", reg);
		return "update_reg";
	}

	@RequestMapping("/update")
	public String updateReg(Registration reg,ModelMap model) {
		service.updateReg(reg);
		List<Registration> regi = service.ListReg();
		model.addAttribute("registration", regi);
		return "list_reg";
	}
}
