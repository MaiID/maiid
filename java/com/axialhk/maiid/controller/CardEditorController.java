package com.axialhk.maiid.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.axialhk.maiid.json.GetTemplateJson;

@Controller
public class CardEditorController {
	
	@RequestMapping(value="/getTemplateXml.do", method=RequestMethod.GET)
	public @ResponseBody GetTemplateJson getTemplateXml(@RequestParam String templateId){
		GetTemplateJson json = new GetTemplateJson();
		json.setErrorCode("0");
		json.setErrorMessage("");
		json.setTemplateId(templateId);
		return json;
	}
}
