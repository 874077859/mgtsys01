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
	public List<EmployeeInfo> getEmployeeInfo(String sid, String usrId, String pwd) {
		return employeeDao.getEmployeeInfo(sid, usrId, pwd);
	}

	@Override
	public int getMaxSid(String sysDate) {
		return employeeDao.getMaxSid(sysDate);
	}

	@Override
	public int insertEmployee(EmployeeInfo employeeInfo) {
		return employeeDao.insertEmployee(employeeInfo.getSid(), employeeInfo.getEmployeeId(),
				employeeInfo.getEmployeePwd(), employeeInfo.getEmployeeMail(), employeeInfo.getEmployeeStatus(),
				employeeInfo.getEmployeeType());
	}

}
