/**
 * 
 * @author chenma
 * 9 Jul 2018
 */
package com.cm.todolist.service;

import java.util.List;

import com.cm.todolist.model.Task;

/**
 * This interface provides task services
 * @author chenma
 *
 */
public interface TaskService {
	
	/**
	 * Get all pending tasks
	 * @return
	 */
	List<Task> getAll();
	
	/**
	 * Get all tasks due today
	 * @return
	 */
	List<Task> getToday();
	
	/**
	 * Get all tasks due this week
	 * @return
	 */
	List<Task> getWeek();
	
	/**
	 * Get all completed tasks
	 * @return
	 */
	List<Task> getCompleted();
	
	/**
	 * Edit a task
	 * @param task
	 */
	void edit (Task task);
	
	/**
	 * Mark the task as completed
	 * @param id
	 */
	void complete (int id);
	
	/**
	 * Save a new task
	 * @param task
	 */
	void save (Task task);

}
