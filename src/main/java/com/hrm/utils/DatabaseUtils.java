package com.hrm.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseUtils {

	void databaseTest() {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr_mysql", "root", "root");
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM `hs_hr_employee");

			while (resultSet.next()) {

				System.out.println(resultSet.getString(1));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void local() {
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr_mysql", "root", "root");
			// here hr_mysql is database name, root is username and password
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM `hs_hr_employee");
			while (rs.next()) 
				System.out.println(rs.getString("emp_firstname"));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		DatabaseUtils databaseUtils = new DatabaseUtils();

		//databaseUtils.databaseTest();
		databaseUtils.local();
	}

}
