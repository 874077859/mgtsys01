package com.vip.mgtsys.service.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vip.mgtsys.dao.EmployeeDao;
import com.vip.mgtsys.model.EmployeeInfo;

@Service("EmployeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public List<EmployeeInfo> getEmployeeList(String sid, String employeeStatus) {
		return employeeDao.getEmployeeList(sid, employeeStatus);
	}

	@Override
	public int count(String sid, String employeeStatus) {
		return employeeDao.count(sid, employeeStatus);
	}

	@Override
	public int insertEmployee(EmployeeInfo employeeInfo) {
		return employeeDao.insertEmployee(employeeInfo.getSid(),
				                          employeeInfo.getEmployeeId(),
				                          employeeInfo.getEmployeePwd(),
				                          employeeInfo.getEmployeeName(),
				                          employeeInfo.getEmployeeTel(),
				                          employeeInfo.getEmployeeStatus(),
				                          employeeInfo.getEmployeeType());
	}

}
