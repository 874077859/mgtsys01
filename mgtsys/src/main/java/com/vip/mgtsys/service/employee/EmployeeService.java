package com.vip.mgtsys.service.employee;

import java.util.List;

import com.vip.mgtsys.model.EmployeeInfo;

public interface EmployeeService {
	List<EmployeeInfo> getEmployeeList(String sid, String employeeStatus);

	int count(String sid, String employeeStatus);

	int insertEmployee(EmployeeInfo employeeInfo);
	/********刘峻铭编辑star *********/
	int getEmployeeCnt(String sid, String employeeId);
	
	EmployeeInfo getEmployeeInfo(String sid, String employeeId, String employeePwd);
	
	int updateEmployee(EmployeeInfo employeeInfo);
	/********刘峻铭编辑 end*********/

	
}

