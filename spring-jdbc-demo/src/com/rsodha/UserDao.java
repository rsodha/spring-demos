package com.rsodha;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveUser(User u) {
		String query = "insert into user values (" + u.getId() + ",'" + u.getEmail() + "', '" + u.getName() + "')";
		return jdbcTemplate.update(query);
	}
}
