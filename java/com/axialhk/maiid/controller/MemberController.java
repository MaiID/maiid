package com.axialhk.maiid.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.axialhk.maiid.json.MemberLoginJson;

@Controller
public class MemberController {

	@RequestMapping(value="/userLogin.do", method=RequestMethod.GET)
	public @ResponseBody MemberLoginJson userLogin(@RequestParam String username, @RequestParam String password ){
		MemberLoginJson json = new MemberLoginJson();
		json.setErrorCode("0");
		json.setErrorMessage("");
		json.setPassword(password);
		json.setUsername(username);
		json.setValid(true);
		return json;
	}
	
	
	
}
