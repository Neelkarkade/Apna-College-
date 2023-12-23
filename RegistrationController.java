package com.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.webapp.dto.RegistrationDto;
import com.webapp.entity.Registration;
import com.webapp.service.RegistrationService;

@Controller
public class RegistrationController {
	@Autowired
	private RegistrationService registrationService;
//http://localhost:8080/view-registration-page
	//Handler Method
	@RequestMapping("/view-registration-page")
	public String viewsRegistrationPage() {
	
		return "new_registration";
	}
	//@RequestMapping("/saveReg")
	//public String saveRegistration(@ModelAttribute Registration  registration) {
		//System.out.println(registration.getFirstName());
		//System.out.println(registration.getLastName());
	//	System.out.println(registration.getEmail());
	//	System.out.println(registration.getMobile());
		//registrationService.saveRegistration(registration);
	//	return"new_registration";
	//}
//	@RequestMapping("/saveReg")
//	public String saveRegistration(
//			@RequestParam("firstName")String fName,
//			@RequestParam("lastName")String lName,
//			@RequestParam("email")String email,
//			@RequestParam("mobile")long mobile,
//			ModelMap model

			
//			) {
		
 //        Registration registration = new Registration();
 //        registration.setFirstName(fName);
  //       registration.setLastName(lName);
//         registration.setEmail(email);
//         registration.setMobile(mobile);

//		registrationService.saveRegistration(registration);
//		model.addAttribute("msg","Record is saved!!");
//		return"new_registration";
//	}
	@RequestMapping("/saveReg")
	public String saveRegistration(
			
			RegistrationDto dto,
			ModelMap model

			
			) {
		
         Registration registration = new Registration();
         registration.setFirstName(dto.getFirstName());
         registration.setLastName(dto.getLastName());
         registration.setEmail(dto.getEmail());
         registration.setMobile(dto.getMobile());

		registrationService.saveRegistration(registration);
		model.addAttribute("msg","Record is saved!!");
		return"new_registration";
	}
	
	@RequestMapping("/getAllReg")
	public String getAllRegistrations(ModelMap model) {
		List<Registration> reg = registrationService.getAllRegistrations();
		model.addAttribute("registrations", reg);
		return"list_registrations";
	}
	@RequestMapping("/delete")
  public String deleteRegById(@RequestParam("id") long id, ModelMap model ) {
		registrationService.deleteRegById(id);
		List<Registration> reg = registrationService.getAllRegistrations();
		model.addAttribute("registrations", reg);
		return"list_registrations";
	}
	@RequestMapping("/getRegistrationById")
	public String getRegistrationById(@RequestParam("id")long id, ModelMap model) {
		Registration registration = registrationService.getRegistrationById(id);
		model.addAttribute("reg", registration);
		return"update_registration";
		
	}
	
	@RequestMapping("/updateReg")
	public String updateRegistration(
			
			RegistrationDto dto,
			ModelMap model

			
			) {
		
         Registration registration = new Registration();
         registration.setId(dto.getId());
         registration.setFirstName(dto.getFirstName());
         registration.setLastName(dto.getLastName());
         registration.setEmail(dto.getEmail());
         registration.setMobile(dto.getMobile());
         registrationService.saveRegistration(registration);
         List<Registration> reg = registrationService.getAllRegistrations();
 		model.addAttribute("registrations", reg);
 		return"list_registrations";
		
	}
}
