package com.axialhk.maiid.dao;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service("memberTypeDao")
public class MemberTypeDaoImpl extends JdbcTemplate implements MemberTypeDao {
	
	private static String SQL_SELECT_ALL = "SELECT * FROM maiid_member_type";
	
	@Autowired
	public MemberTypeDaoImpl(DataSource dataSource){
		super(dataSource);
	}
	
	@Override
	public List<Map<String, Object>> getAllType(){
		return super.queryForList(SQL_SELECT_ALL);
	}
}
