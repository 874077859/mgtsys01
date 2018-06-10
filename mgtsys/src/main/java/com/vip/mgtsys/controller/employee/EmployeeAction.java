package com.vip.mgtsys.controller.employee;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vip.mgtsys.constant.Constant;
import com.vip.mgtsys.model.EmployeeInfo;
import com.vip.mgtsys.model.EmployerInfo;
import com.vip.mgtsys.service.employee.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeAction {
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/employee")
	public String employee(HttpSession session) {
		String sid = ((EmployerInfo)session.getAttribute(Constant.SESSION_EMPLOYER_INFO)).getSid();
		String employeeStatus = Constant.EMPLOYEE_STATUS_02;
		int cnt = employeeService.count(sid, employeeStatus);
		
		if(cnt == 0) {
			return "employee/addEmployee";
		}
		
		return "employee/employee";
	}
	
	@RequestMapping("/getEmployeeList")
	@ResponseBody
	public List<EmployeeInfo> getEmployeeList(HttpSession session) {
		String sid = ((EmployerInfo)session.getAttribute(Constant.SESSION_EMPLOYER_INFO)).getSid();
		String employeeStatus = Constant.EMPLOYEE_STATUS_02;
		List<EmployeeInfo> employeeList = employeeService.getEmployeeList(sid, employeeStatus);
		return employeeList;
	}
	
	@RequestMapping("/addEmployee")
	public String addEmployee() {
		return "employee/addEmployee";
	}
	
	@RequestMapping("/doAdd")
	@ResponseBody
	public void doAdd(@RequestBody EmployeeInfo employeeInfo, HttpSession session) {
		employeeInfo.setSid(((EmployerInfo)session.getAttribute(Constant.SESSION_EMPLOYER_INFO)).getSid());
		employeeService.insertEmployee(employeeInfo);
	}
}
