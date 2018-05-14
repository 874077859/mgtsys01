package com.vip.mgtsys.controller.employer;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vip.mgtsys.model.EmployerInfo;

@Controller
@RequestMapping("/employer")
public class EmployerAction {

	@RequestMapping("/employee")
	public String employee() {
		return "employer/employee";
	}
	
	@RequestMapping("/employer")
	public String employer() {
		return "employer/employer";
	}
	
	@RequestMapping("/main")
	public String main(Model model) {
		model.addAttribute("url", "employer/employee.jsp");
		return "common/main";
	}
	
	@RequestMapping("/getEmployeeInfo")
	@ResponseBody
	public EmployerInfo getUserInfo(HttpSession session) {
		return (EmployerInfo)session.getAttribute("employerInfo");
	}
}
