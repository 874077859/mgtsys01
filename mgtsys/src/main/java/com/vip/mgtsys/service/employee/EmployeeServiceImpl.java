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
	/********刘峻铭编辑star *********/
	@Override
	public int getEmployeeCnt(String sid, String employeeId) {
		// TODO 1-generated method stub
		return employeeDao.selectEmployeeCnt(sid, employeeId);
	}
	
	@Override
	public EmployeeInfo getEmployeeInfo(String sid,String employeeId, String employeePwd) {
		return employeeDao.getEmployeeInfo(sid, employeeId, employeePwd);
	}
	
	@Override
	public int updateEmployee(EmployeeInfo employeeInfo) {
		return employeeDao.updateEmployee(employeeInfo.getSid(),
                                          employeeInfo.getEmployeeId(),
                                          employeeInfo.getEmployeeName(),
                                          employeeInfo.getEmployeeTel(),
                                          employeeInfo.getEmployeeStatus(),
                                          employeeInfo.getEmployeeType());
	}
	/********刘峻铭编辑 end*********/
}
