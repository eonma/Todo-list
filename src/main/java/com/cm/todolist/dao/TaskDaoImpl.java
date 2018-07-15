/**
 * 
 * @author chenma
 * 9 Jul 2018
 */
package com.cm.todolist.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cm.todolist.config.DBConfig;
import com.cm.todolist.controller.ToDoListController;
import com.cm.todolist.model.Task;
import com.cm.todolist.service.Constants;

/**
 * @author chenma
 *
 */
public class TaskDaoImpl implements TaskDao {
	
	private final Logger logger = LoggerFactory.getLogger(ToDoListController.class);
	private Connection conn;

	
	/* (non-Javadoc)
	 * @see com.cm.todolist.dao.TaskDao#findById(int)
	 */
	public Task findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.cm.todolist.dao.TaskDao#findAll()
	 */
	public List<Task> findAll() {
		PreparedStatement prepStatement = null;
		List<Task> tasks = new ArrayList<Task> ();
		try {
			if (conn == null){
				conn = DBConfig.getConnection();
			}
			prepStatement = (PreparedStatement) conn.prepareStatement(Constants.SQL_SELECT_ALL_TASKS);
			ResultSet rs = prepStatement.executeQuery();
			while(rs.next()){
				int id = rs.getInt(Constants.TABLE_TASK_ID);
				String title = rs.getString(Constants.TABLE_TASK_TITLE);
				String note = rs.getString(Constants.TABLE_TASK_NOTE);
				String status = rs.getString(Constants.TABLE_TASK_STATUS);
				Date createDate = rs.getDate(Constants.TABLE_TASK_CREATE_DATE);
				Date dueDate = rs.getDate(Constants.TABLE_TASK_DUE_DATE);
				
				logger.debug(id + ", " + title + ", " + note + ", " + status + ", " + createDate + ", " + dueDate);
				
				Task task = new Task(id, title, note, status, createDate, dueDate);
				tasks.add(task);
			};
			
		} catch (SQLException e) {
			logger.error("Query can not be executed due to a SQL error!", e);
		} catch (ClassNotFoundException e) {
			logger.error("Can not find database connection class", e);
		} finally{
			if (prepStatement != null) {
				try {
					prepStatement.close();
				} catch (SQLException e) {
					logger.error("PreparedStatement can not be closed!", e);
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					logger.error("Connection can not be closed!", e);
				}
			}
		}
		return tasks;
	}

	/* (non-Javadoc)
	 * @see com.cm.todolist.dao.TaskDao#findToday()
	 */
	public List<Task> findToday() {
		PreparedStatement prepStatement = null;
		Date today = new Date(new java.util.Date().getTime());
		List<Task> tasks = new ArrayList<Task> ();
		try {
			if (conn == null){
				conn = DBConfig.getConnection();
			}
			prepStatement = conn.prepareStatement(Constants.SQL_SELECT_ALL_TASKS_TODAY);
			prepStatement.setDate(1, today);
			ResultSet rs = prepStatement.executeQuery();
			while(rs.next()){
				int id = rs.getInt(Constants.TABLE_TASK_ID);
				String title = rs.getString(Constants.TABLE_TASK_TITLE);
				String note = rs.getString(Constants.TABLE_TASK_NOTE);
				String status = rs.getString(Constants.TABLE_TASK_STATUS);
				Date createDate = rs.getDate(Constants.TABLE_TASK_CREATE_DATE);
				Date dueDate = rs.getDate(Constants.TABLE_TASK_DUE_DATE);
				
				logger.debug(id + ", " + title + ", " + note + ", " + status + ", " + createDate + ", " + dueDate);
				
				Task task = new Task(id, title, note, status, createDate, dueDate);
				tasks.add(task);
			};
			
		} catch (SQLException e) {
			logger.error("Query can not be executed due to a SQL error!", e);
		} catch (ClassNotFoundException e) {
			logger.error("Can not find database connection class", e);
		} finally{
			if (prepStatement != null) {
				try {
					prepStatement.close();
				} catch (SQLException e) {
					logger.error("PreparedStatement can not be closed!", e);
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					logger.error("Connection can not be closed!", e);
				}
			}
		}
		return tasks;
	}

	/* (non-Javadoc)
	 * @see com.cm.todolist.dao.TaskDao#findWeek()
	 */
	public List<Task> findWeek() {
		PreparedStatement prepStatement = null;
		//Date today = new Date(new java.util.Date().getTime());
		
		LocalDate today = LocalDate.now();
		// Go backward to get Monday
	    LocalDate monday = today;
	    while (monday.getDayOfWeek() != DayOfWeek.MONDAY) {
	      monday = monday.minusDays(1);
	    }
	    
	    // Go forward to get Sunday
	    LocalDate sunday = today;
	    while (sunday.getDayOfWeek() != DayOfWeek.SUNDAY) {
	      sunday = sunday.plusDays(1);
	    }
		
		List<Task> tasks = new ArrayList<Task> ();
		try {
			if (conn == null){
				conn = DBConfig.getConnection();
			}
			prepStatement = conn.prepareStatement(Constants.SQL_SELECT_ALL_TASKS_WEEK);
			prepStatement.setDate(1, Date.valueOf(monday));
			prepStatement.setDate(2, Date.valueOf(sunday));
			ResultSet rs = prepStatement.executeQuery();
			while(rs.next()){
				int id = rs.getInt(Constants.TABLE_TASK_ID);
				String title = rs.getString(Constants.TABLE_TASK_TITLE);
				String note = rs.getString(Constants.TABLE_TASK_NOTE);
				String status = rs.getString(Constants.TABLE_TASK_STATUS);
				Date createDate = rs.getDate(Constants.TABLE_TASK_CREATE_DATE);
				Date dueDate = rs.getDate(Constants.TABLE_TASK_DUE_DATE);
				
				logger.debug(id + ", " + title + ", " + note + ", " + status + ", " + createDate + ", " + dueDate);
				
				Task task = new Task(id, title, note, status, createDate, dueDate);
				tasks.add(task);
			};
			
		} catch (SQLException e) {
			logger.error("Query can not be executed due to a SQL error!", e);
		} catch (ClassNotFoundException e) {
			logger.error("Can not find database connection class", e);
		} finally{
			if (prepStatement != null) {
				try {
					prepStatement.close();
				} catch (SQLException e) {
					logger.error("PreparedStatement can not be closed!", e);
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					logger.error("Connection can not be closed!", e);
				}
			}
		}
		return tasks;
	}

	/* (non-Javadoc)
	 * @see com.cm.todolist.dao.TaskDao#save(com.cm.todolist.model.Task)
	 */
	public void save(Task task) {
		PreparedStatement prepStatement = null;
		Date today = new Date(new java.util.Date().getTime());
		try {
			if (conn == null){
				conn = DBConfig.getConnection();
			}
			prepStatement = (PreparedStatement) conn.prepareStatement(Constants.SQL_SAVE_NEW_TASK_TITLE);
			prepStatement.setString(1, task.getTitle());
			prepStatement.setString(2, Constants.TASK_STATUS_PENDING);
			prepStatement.setDate(3, today);
			
			prepStatement.executeUpdate();

			
		} catch (SQLException e) {
			logger.error("Query can not be executed due to a SQL error!", e);
		} catch (ClassNotFoundException e) {
			logger.error("Can not find database connection class", e);
		} finally{
			if (prepStatement != null) {
				try {
					prepStatement.close();
				} catch (SQLException e) {
					logger.error("PreparedStatement can not be closed!", e);
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					logger.error("Connection can not be closed!", e);
				}
			}
		}

	}

	/* (non-Javadoc)
	 * @see com.cm.todolist.dao.TaskDao#update(com.cm.todolist.model.Task)
	 */
	public void update(Task task) {
		PreparedStatement prepStatement = null;
		try {
			if (conn == null){
				conn = DBConfig.getConnection();
			}
			prepStatement = (PreparedStatement) conn.prepareStatement(Constants.SQL_UPDATE_TASKS_BY_ID);
			prepStatement.setString(1, task.getTitle());
			prepStatement.setString(2, task.getNote());
			if (task.getCreateDate() != null){
				prepStatement.setDate(3, new Date(task.getCreateDate().getTime()));
			} else {
				prepStatement.setDate(3, null);
			}
			if (task.getDueDate() != null){
				prepStatement.setDate(4, new Date(task.getDueDate().getTime()));
			} else {
				prepStatement.setDate(4, null);
			}
			
			prepStatement.setInt(5, task.getId());
			
			prepStatement.executeUpdate();
			
		} catch (SQLException e) {
			logger.error("Query can not be executed due to a SQL error!", e);
		} catch (ClassNotFoundException e) {
			logger.error("Can not find database connection class", e);
		} finally{
			if (prepStatement != null) {
				try {
					prepStatement.close();
				} catch (SQLException e) {
					logger.error("PreparedStatement can not be closed!", e);
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					logger.error("Connection can not be closed!", e);
				}
			}
		}

	}

	/* (non-Javadoc)
	 * @see com.cm.todolist.dao.TaskDao#delete(int)
	 */
	public void complete(int id) {
		PreparedStatement prepStatement = null;
		try {
			if (conn == null){
				conn = DBConfig.getConnection();
			}
			prepStatement = (PreparedStatement) conn.prepareStatement(Constants.SQL_COMPLETE_TASKS_BY_ID);
			prepStatement.setString(1, Constants.TASK_STATUS_COMPLETED);
			prepStatement.setInt(2, id);
			prepStatement.executeUpdate();
			
		} catch (SQLException e) {
			logger.error("Query can not be executed due to a SQL error!", e);
		} catch (ClassNotFoundException e) {
			logger.error("Can not find database connection class", e);
		} finally{
			if (prepStatement != null) {
				try {
					prepStatement.close();
				} catch (SQLException e) {
					logger.error("PreparedStatement can not be closed!", e);
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					logger.error("Connection can not be closed!", e);
				}
			}
		}

	}

	/* (non-Javadoc)
	 * @see com.cm.todolist.dao.TaskDao#findByStatus(java.lang.String)
	 */
	public List<Task> findByStatus(String queryStatus) {
		PreparedStatement prepStatement = null;
		List<Task> tasks = new ArrayList<Task> ();
		try {
			if (conn == null){
				conn = DBConfig.getConnection();
			}
			prepStatement = (PreparedStatement) conn.prepareStatement(Constants.SQL_SELECT_ALL_TASKS_BY_STATUS);
			prepStatement.setString(1, queryStatus);
			ResultSet rs = prepStatement.executeQuery();
			while(rs.next()){
				int id = rs.getInt(Constants.TABLE_TASK_ID);
				String title = rs.getString(Constants.TABLE_TASK_TITLE);
				String note = rs.getString(Constants.TABLE_TASK_NOTE);
				String status = rs.getString(Constants.TABLE_TASK_STATUS);
				Date createDate = rs.getDate(Constants.TABLE_TASK_CREATE_DATE);
				Date dueDate = rs.getDate(Constants.TABLE_TASK_DUE_DATE);
				
				logger.debug(id + ", " + title + ", " + note + ", " + status + ", " + createDate + ", " + dueDate);
				
				Task task = new Task(id, title, note, status, createDate, dueDate);
				tasks.add(task);
			};
			
		} catch (SQLException e) {
			logger.error("Query can not be executed due to a SQL error!", e);
		} catch (ClassNotFoundException e) {
			logger.error("Can not find database connection class", e);
		} finally{
			if (prepStatement != null) {
				try {
					prepStatement.close();
				} catch (SQLException e) {
					logger.error("PreparedStatement can not be closed!", e);
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					logger.error("Connection can not be closed!", e);
				}
			}
		}
		return tasks;
	}
	

	
}
