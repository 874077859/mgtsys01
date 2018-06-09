package com.vip.mgtsys.service.employee;

import java.util.List;

import com.vip.mgtsys.model.EmployeeInfo;

public interface EmployeeService {
	List<EmployeeInfo> getEmployeeInfo(String sid, String usrId, String pwd);

	int getMaxSid(String sysDate);

	int insertEmployee(EmployeeInfo employeeInfo);
}
