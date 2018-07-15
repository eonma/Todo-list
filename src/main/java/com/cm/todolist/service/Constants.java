/**
 * 
 * @author chenma
 * 9 Jul 2018
 */
package com.cm.todolist.service;

/**
 * @author chenma
 *
 */
public class Constants {
	
	// View constants
	public static final String SHOW_ALL_LIST = "/todolist/all";
	public static final String SHOW_TODAY = "/todolist/today";
	public static final String SHOW_COMPLETED = "/todolist/completed";
	
	// Task status
	public static final String TASK_STATUS_PENDING = "P";
	public static final String TASK_STATUS_COMPLETED = "C";
	
	// DB config
	public static final String DB_URL = "jdbc:mysql://zpj83vpaccjer3ah.chr7pe7iynqr.eu-west-1.rds.amazonaws.com:3306/g02uljxkq1rme8fu";
	public static final String DB_USER = "lg6w9m09v39yh719";
	public static final String DB_PASSWORD = "z5i27lo4s7p0ni1h";
			
	// DB table constants
	public static final String TABLE_TASK_ID = "id";
	public static final String TABLE_TASK_TITLE = "title";
	public static final String TABLE_TASK_NOTE = "note";
	public static final String TABLE_TASK_STATUS = "status";
	public static final String TABLE_TASK_CREATE_DATE = "create_date";
	public static final String TABLE_TASK_DUE_DATE = "due_date";
	
	// SQL constants
	public static final String SQL_SELECT_ALL_TASKS = "SELECT * FROM TASK";
	public static final String SQL_SELECT_ALL_TASKS_BY_STATUS = "SELECT * FROM TASK WHERE STATUS IN ( ? ) ORDER BY DUE_DATE ASC";
	public static final String SQL_SELECT_ALL_TASKS_TODAY = "SELECT * FROM TASK WHERE STATUS = \'P\' AND DUE_DATE in ( ? )";
	public static final String SQL_SELECT_ALL_TASKS_WEEK = "SELECT * FROM TASK WHERE DUE_DATE BETWEEN ? and ?";
	public static final String SQL_INSERT_INTO_TASK = "INSERT INTO TASK (\'title\', \'note\', \'status\',\'due_date\') VALUES (?, ?, ?, ?)";
	public static final String SQL_SAVE_NEW_TASK_TITLE_AND_DUE_DATE = "INSERT INTO TASK (\'title\',\'due_date\', \'status\') VALUES (?, ?, ?)";
	public static final String SQL_SAVE_NEW_TASK_TITLE = "INSERT INTO TASK (TITLE, STATUS, CREATE_DATE) VALUES (?, ?, ?)";
	public static final String SQL_UPDATE_TASKS_BY_ID = "UPDATE TASK SET TITLE = ?, NOTE = ?, CREATE_DATE = ?, DUE_DATE = ? WHERE ID = ?";
	public static final String SQL_COMPLETE_TASKS_BY_ID = "UPDATE TASK SET STATUS = ? WHERE ID = ?";
	

}
