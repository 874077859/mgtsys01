package com.vip.mgtsys.controller.employee;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vip.mgtsys.model.EmployeeInfo;
import com.vip.mgtsys.service.employee.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeAction {
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/getEmployeeInfo")
	@ResponseBody
	public List<EmployeeInfo> getEmployeeInfo(Model model,HttpSession session) {
		String sid = (String) session.getAttribute("sid");
		String employerId = (String) session.getAttribute("employerId");
		List<EmployeeInfo> employeeInfo = employeeService.getEmployeeInfo(sid, employerId, null);
		model.addAttribute("employeeInfo", employeeInfo);
		return employeeInfo;
	}
}
