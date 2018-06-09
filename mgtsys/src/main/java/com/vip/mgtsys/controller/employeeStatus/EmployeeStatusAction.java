package com.vip.mgtsys.controller.employeeStatus;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vip.mgtsys.constant.Constant;
import com.vip.mgtsys.model.EmployeeStatus;
import com.vip.mgtsys.model.EmployerInfo;
import com.vip.mgtsys.service.employeeStatus.EmployeeStatusService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("/employeeStatus")
public class EmployeeStatusAction {
	@Autowired
	private EmployeeStatusService employeeStatusService;

	@RequestMapping("/getEmployeeStatus")
	@ResponseBody
	public JSONArray getEmployeeStatus(HttpSession session) {
		
		String sid = ((EmployerInfo)session.getAttribute(Constant.SESSION_EMPLOYER_INFO)).getSid();
		List<EmployeeStatus> lst = employeeStatusService.getEmployeeStatus(sid);

		JSONArray ja = new JSONArray();
		for(EmployeeStatus et : lst) {
			JSONObject jo = new JSONObject();
			jo.put("key", et.getStatusKey());
			jo.put("value", et.getStatusValue());
			ja.add(jo);
		}
		
		return ja;
	}
}
