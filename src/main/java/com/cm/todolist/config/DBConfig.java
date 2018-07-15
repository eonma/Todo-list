/**
 * 
 * @author chenma
 * 10 Jul 2018
 */
package com.cm.todolist.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
		
		String dbUrl = "jdbc:mysql://zpj83vpaccjer3ah.chr7pe7iynqr.eu-west-1.rds.amazonaws.com:3306/g02uljxkq1rme8fu";
	    Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(dbUrl, "lg6w9m09v39yh719", "z5i27lo4s7p0ni1h");
	    return conn;
	}

}
