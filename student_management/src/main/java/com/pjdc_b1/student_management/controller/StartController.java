package com.pjdc_b1.student_management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StartController {

	@RequestMapping(value = {"/","/index"}, method = RequestMethod.GET)
	public String index() {
		return "index";
	}
}

