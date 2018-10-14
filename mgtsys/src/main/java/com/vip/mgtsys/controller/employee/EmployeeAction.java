package com.vip.mgtsys.controller.employee;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.vip.mgtsys.constant.Constant;
import com.vip.mgtsys.model.EmployeeInfo;
import com.vip.mgtsys.model.EmployerInfo;
import com.vip.mgtsys.service.employee.EmployeeService;

@Controller
@SessionAttributes("employeeId")
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
	/********刘峻铭编辑star *********/
	
	@RequestMapping("/selectEmployeeCnt")
	@ResponseBody
	public int selectEmployeeCnt(@RequestParam String employeeId
			,HttpSession session) {
		String sid = ((EmployerInfo)session.getAttribute(Constant.SESSION_EMPLOYER_INFO)).getSid();
		int employeeCnt = employeeService.getEmployeeCnt(sid, employeeId);
		
		return employeeCnt;
	}
	@RequestMapping("/doEmployeeLogin")
	@ResponseBody
	public EmployeeInfo doEmployeeLogin(Model model, @RequestParam String employeePwd,
			HttpSession session) {
		String sid = ((EmployerInfo)session.getAttribute(Constant.SESSION_EMPLOYER_INFO)).getSid();
		String employeeId = (String)model.asMap().get("employeeId");
		EmployeeInfo employeeInfo = employeeService.getEmployeeInfo(sid, employeeId, employeePwd);
		if(null != employeeInfo &&
				(null != employeeInfo.getEmployeeId())) {
			session.setAttribute(Constant.SESSION_EMPLOYEE_INFO, employeeInfo);
		}
		
		// 用户信息取得
		return employeeInfo;
	}
	
	@RequestMapping("/detailEmployeeInfo")
	public String detailEmployeeInfo() {
		return "employee/detailEmployeeInfo";
	}
	
	@RequestMapping("/selectDetailEmployeeInfo")
	@ResponseBody
	public EmployeeInfo selectDetailEmployeeInfo(HttpSession session) {
		EmployeeInfo employeeInfo =((EmployeeInfo)session.getAttribute(Constant.SESSION_EMPLOYEE_INFO));
		
		// 用户信息取得
		return employeeInfo;
	}
		
	@RequestMapping("/goEmployeeLogin")
	@ResponseBody
	public void goEmployeeLogin(Model model,@RequestParam String employeeId) {
		model.addAttribute("employeeId", employeeId);
	}
	
	@RequestMapping("/employeeLogin")
	public String employeeLogin() {
		return "employee/employeeLogin";
	}
	
	@RequestMapping("/doUpdate")
	@ResponseBody
	public void doUpdate(@RequestBody EmployeeInfo employeeInfo, HttpSession session) {
		employeeInfo.setSid(((EmployerInfo)session.getAttribute(Constant.SESSION_EMPLOYER_INFO)).getSid());
		employeeService.updateEmployee(employeeInfo);
	}
	/********刘峻铭编辑 end*********/
	@RequestMapping("/doAdd")
	@ResponseBody
	public void doAdd(@RequestBody EmployeeInfo employeeInfo, HttpSession session) {
		employeeInfo.setSid(((EmployerInfo)session.getAttribute(Constant.SESSION_EMPLOYER_INFO)).getSid());
		employeeService.insertEmployee(employeeInfo);
	}
}
