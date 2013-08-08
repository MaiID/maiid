package com.axialhk.maiid.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axialhk.maiid.dao.MemberTypeDao;

@Service("memberTypeService")
public class MemberTypeServiceImpl implements MemberTypeService {
	
	@Autowired
	private MemberTypeDao memberTypeDao;
	
	public List<Map<String, Object>> getAllType(){
		return memberTypeDao.getAllType();
	}
}
