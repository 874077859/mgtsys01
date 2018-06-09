package com.vip.mgtsys.controller.employee;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vip.mgtsys.constant.Constant;
import com.vip.mgtsys.model.EmployeeInfo;
import com.vip.mgtsys.model.EmployerInfo;
=======
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vip.mgtsys.model.EmployeeInfo;
>>>>>>> 3a68e7c6c88a87c2deef5a73d283d871230b7834
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
<<<<<<< HEAD
	
	@RequestMapping("/addEmployee")
	public String addEmployee() {
		return "employee/addEmployee";
	}
	
	@RequestMapping("/doCommit")
	@ResponseBody
	public void commit(@RequestBody EmployeeInfo employeeInfo, HttpSession session) {
		employeeInfo.setEmployerPermission(Constant.EMPLOYER_PERMISSION_01);
		employeeInfo.setEmployerStatus(Constant.EMPLOYEE_STATUS_02);
		employeeInfo.setSid(((EmployerInfo)session.getAttribute(Constant.SESSION_EMPLOYER_INFO)).getSid());
		employeeService.updateEmployer(employerInfo);
	}
=======
>>>>>>> 3a68e7c6c88a87c2deef5a73d283d871230b7834
}
