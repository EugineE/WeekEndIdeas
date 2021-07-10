//$Id$
package com.wi.beanimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.wi.bean.DataBean;
@Service
public class DataBeanImpl implements DataBean {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void insertTest() {
		jdbcTemplate.update("INSERT INTO test(name) VALUES (?)", "eugine");
	}
}
