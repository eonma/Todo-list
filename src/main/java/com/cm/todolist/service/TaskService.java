/**
 * 
 * @author chenma
 * 9 Jul 2018
 */
package com.cm.todolist.service;

import java.util.List;

import com.cm.todolist.model.Task;

/**
 * @author chenma
 *
 */
public interface TaskService {
	
	List<Task> getAll();
	
	List<Task> getToday();
	
	List<Task> getWeek();
	
	List<Task> getCompleted();
	
	void edit (Task task);
	
	void complete (int id);
	
	void save (Task task);

}
