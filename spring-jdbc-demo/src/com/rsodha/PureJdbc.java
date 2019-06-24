package com.rsodha;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PureJdbc {
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		String url = "jdbc:mysql://localhost:3306/db_example";
		Connection connection = DriverManager.getConnection(url, "db_mstr_usr_1", "8xNnsak8jDGKXCF");
		String query = "SELECT * FROM user";

		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery(query);
		while (rs.next()) {
			int id = rs.getInt("ID");
			String email = rs.getString("EMAIL");
			String name = rs.getString("NAME");
			System.out.println(id + " - " + email + " - " + name);
		}

		connection.close();
	}
}
