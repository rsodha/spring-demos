package com.rsodha;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<User> findAll() {
		return jdbcTemplate.query("select * from user", new BeanPropertyRowMapper<User>(User.class));
	}

	public User findById(int id) {
		return jdbcTemplate.queryForObject("select * from user where id = ?", new Object[] { id },
				new BeanPropertyRowMapper<User>(User.class));
	}
}
