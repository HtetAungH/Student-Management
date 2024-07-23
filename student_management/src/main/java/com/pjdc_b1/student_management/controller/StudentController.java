package com.pjdc_b1.student_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.pjdc_b1.student_management.model.StudentModel;
import com.pjdc_b1.student_management.serviceImpl.StudentServiceImpl;

@Controller
public class StudentController {
	@Autowired
	private StudentServiceImpl studentserviceImpl;
	
	@RequestMapping(value = "/studentDataAdd", method = RequestMethod.GET)
	public ModelAndView studentDataAdd (@ModelAttribute StudentModel stu) {
		List<StudentModel> stuList = studentserviceImpl.studentDataAdd(stu);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("stuList", stuList);
		modelAndView.setViewName("index");
		return modelAndView;
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView studentDataAdd (@RequestParam(name = "Stu_ID") String Stu_ID) {
		List<StudentModel> stuList= studentserviceImpl.studentDataDelete(Stu_ID);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("stuList", stuList);
		modelAndView.setViewName("index");
		return modelAndView;
	}
	
	@RequestMapping(value = "/update/{Stu_ID}", method = RequestMethod.GET)
	public ModelAndView selectById(@PathVariable(name = "Stu_ID") String Stu_ID) {
		StudentModel stuModel = studentserviceImpl.selectById(Stu_ID);
		ModelAndView modelAndView = new ModelAndView(Stu_ID);
		modelAndView.addObject("stuModel", stuModel);
		modelAndView.setViewName("update");
		return modelAndView;
	}
	
	@RequestMapping(value = "/updateProcess", method = RequestMethod.POST)
	public ModelAndView updateProcess (@ModelAttribute StudentModel stu) {
		List<StudentModel> stuList = studentserviceImpl.updateProcess(stu);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("stuList", stuList);
		modelAndView.setViewName("index");
		return modelAndView;
	}
}
