package com.axialhk.maiid.controller;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.axialhk.maiid.service.MemberTypeService;

@Controller
public class MemberTypeController {
	
	Logger log = Logger.getLogger(MemberTypeController.class);
	// Inject Service
	@Autowired
	private MemberTypeService memberTypeService;
	
	@RequestMapping(value="/getAllMemberType.do", method=RequestMethod.GET)
	public @ResponseBody List<Map<String, Object>> getAllMemberType(){
		log.info("getAllMemberType Start!");
		return this.memberTypeService.getAllType();
	}

}
