/**
 * 
 * @author chenma
 * 9 Jul 2018
 */
package com.cm.todolist.dao;

import java.util.List;

import com.cm.todolist.model.Task;

/**
 * Task data access object
 * @author chenma
 *
 */
public interface TaskDao {
	
	/**
	 * Find the task by Id.
	 * @param id
	 * @return
	 */
	Task findById (int id);
	
	/**
	 * Find all tasks by status
	 * @param status
	 * @return
	 */
	List<Task> findByStatus(String status);
	
	/**
	 * Find all tasks.
	 * @return
	 */
	List<Task> findAll();
	
	/**
	 * Find tasks due today.
	 * @return
	 */
	List<Task> findToday();
	
	/**
	 * Find tasks due this week.
	 * @return
	 */
	List<Task> findWeek();
	
	/**
	 * Save a new task.
	 * @param task
	 */
	void save (Task task);
	
	/**
	 * Update an existing task.
	 * @param task
	 */
	void update (Task task);
	
	/**
	 * Complete current task.
	 * @param id
	 */
	void complete (int id);
}
