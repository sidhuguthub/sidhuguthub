package com.form.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.form.entity.Form;
import com.form.service.FormService;

@Controller
public class FormController {
	
	@Autowired
	private FormService formService;
	

	//http://localhost:8080/create
	
	@RequestMapping("/create")
	public String createForm() {
	
		return"create_form";
	}
	
	@RequestMapping("/saveForm")
	public String saveForm(@ModelAttribute Form form) {
		
		formService.saveReg(form);
		
		return"create_form";
	}
	
	//http://localhost:8080/readAll
	
	@RequestMapping("/readAll")
	public String readAllForm(ModelMap model){
		List<Form> forms = formService.readAllRecord();
		model.addAttribute("forms",forms);
		return"all_results";
	}
	
	
	@RequestMapping("/delete")
	public String deleteForm(@RequestParam("id") long id, ModelMap model) {
		formService.deleteARecord(id);
		List<Form> forms = formService.readAllRecord();
		model.addAttribute("forms",forms);
		return"all_results";
	}

}
