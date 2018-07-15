/**
 * 
 * @author chenma
 * 10 Jul 2018
 */
package com.cm.todolist.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.cm.todolist.service.Constants;
import com.mysql.jdbc.Driver;

/**
 * @author chenma
 *
 */
public class DBConfig {
	
	/*
	public static Connection getConnection() throws SQLException, ClassNotFoundException{
		Connection conn;
		
		String dbUrl = "jdbc:postgresql://localhost:5432/mylocaldb";
	    Class.forName("org.postgresql.Driver");
        conn = DriverManager.getConnection(dbUrl);
	    return conn;
	}
	*/
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection conn;
		
		Class.forName(Driver.class.getName());
        conn = DriverManager.getConnection(Constants.DB_URL, Constants.DB_USER, Constants.DB_PASSWORD);
	    return conn;
	}

}
