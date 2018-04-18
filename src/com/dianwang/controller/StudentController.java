package com.dianwang.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dianwang.gof.Student;
import com.dianwang.service.StudentService;
@SuppressWarnings("all")
@Controller
@RequestMapping("student")
public class StudentController {
	
	@Resource
	private StudentService studentService;
	
	@RequestMapping("login")
	public @ResponseBody String login(HttpServletRequest request,Student stu)throws Exception{
		Student student=studentService.login(stu);
		System.out.println("u1 : "+stu);
		System.out.println("user : ========================"+student);
		ModelAndView model=new ModelAndView();
		if(null == student){
			return student.getName();
		}
		//登录后将其放入session中
		request.getSession().setAttribute("student", student);
		return "0";
	}
	
}
