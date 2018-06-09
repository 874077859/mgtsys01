package com.vip.mgtsys.controller.employer;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestBody;
=======
import org.springframework.ui.Model;
>>>>>>> 3a68e7c6c88a87c2deef5a73d283d871230b7834
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vip.mgtsys.constant.Constant;
import com.vip.mgtsys.model.EmployerInfo;
import com.vip.mgtsys.service.employer.EmployerService;

@Controller
@RequestMapping("/employer")
public class EmployerAction {
	
	@Autowired
	private EmployerService employerService;

	@RequestMapping("/employer")
	public String employer() {
		return "employer/employer";
	}
	
<<<<<<< HEAD
	@RequestMapping("/doCommit")
=======
	@RequestMapping("/main")
	public String main(Model model) {
		model.addAttribute("url", "employer/employee.jsp");
		return "common/main";
	}
	
	@RequestMapping("/getEmployeeInfo")
>>>>>>> 3a68e7c6c88a87c2deef5a73d283d871230b7834
	@ResponseBody
	public void commit(@RequestBody EmployerInfo employerInfo, HttpSession session) {
		employerInfo.setEmployerPermission(Constant.EMPLOYER_PERMISSION_01);
		employerInfo.setEmployerStatus(Constant.EMPLOYEE_STATUS_02);
		employerInfo.setSid(((EmployerInfo)session.getAttribute(Constant.SESSION_EMPLOYER_INFO)).getSid());
		employerService.updateEmployer(employerInfo);
	}
}
