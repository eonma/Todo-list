/**
 * 
 * @author chenma
 * 9 Jul 2018
 */
package com.cm.todolist.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

import com.cm.todolist.dao.TaskDao;
import com.cm.todolist.dao.TaskDaoImpl;
import com.cm.todolist.model.Task;

/**
 * @author chenma
 *
 */
public class TaskServiceImpl implements TaskService {
	
	private TaskDao taskDao = new TaskDaoImpl();
	
	public void setTaskDao(TaskDao taskDao) {
		this.taskDao = taskDao;
	}

	/* (non-Javadoc)
	 * @see com.cm.todolist.service.TaskService#getAll()
	 */
	public List<Task> getAll() {

		List<Task> taskList = new ArrayList<Task>();
		
		List<Task> tasks = taskDao.findByStatus(Constants.TASK_STATUS_PENDING);
		Iterator<Task> it = tasks.iterator();
		while (it.hasNext()){
			Task task = it.next();
			Date dueDate = task.getDueDate();
			
			if (dueDate != null){
				Calendar taskCal = new GregorianCalendar(); 
				taskCal.setTime(dueDate);     
				int yearTask = taskCal.get(Calendar.YEAR);
				int monthTask = taskCal.get(Calendar.MONTH);
				int dayTask = taskCal.get(Calendar.DATE);
				
				Calendar todayCal = new GregorianCalendar(); 
				todayCal.setTime(new Date());
				Date today = new Date();
				int yearToday = todayCal.get(Calendar.YEAR);
				int monthToday = todayCal.get(Calendar.MONTH);
				int dayToday = todayCal.get(Calendar.DATE);
				
				// Set due today flag
				if (yearTask == yearToday && monthTask == monthToday && dayTask == dayToday){
					task.setToday(true);
				} else { 
					// Set over due flag
					if (dueDate.after(today)){
						task.setOverDue(false);
					} else {
						task.setOverDue(true);
					}
				}
			}
			taskList.add(task);
		}
		return taskList;
	}

	/* (non-Javadoc)
	 * @see com.cm.todolist.service.TaskService#getToday()
	 */
	public List<Task> getToday() {
		return taskDao.findToday();
	}

	/* (non-Javadoc)
	 * @see com.cm.todolist.service.TaskService#getWeek()
	 */
	public List<Task> getWeek() {
		return taskDao.findWeek();
	}

	/* (non-Javadoc)
	 * @see com.cm.todolist.service.TaskService#getCompleted()
	 */
	public List<Task> getCompleted() {
		return taskDao.findByStatus("C");
	}

	/* (non-Javadoc)
	 * @see com.cm.todolist.service.TaskService#edit(com.cm.todolist.model.Task)
	 */
	public void edit(Task task) {
		taskDao.update(task);

	}

	/* (non-Javadoc)
	 * @see com.cm.todolist.service.TaskService#delete(int)
	 */
	public void complete(int id) {
		taskDao.complete(id);

	}

	/* (non-Javadoc)
	 * @see com.cm.todolist.service.TaskService#save(com.cm.todolist.model.Task)
	 */
	public void save(Task task) {
		taskDao.save(task);
		
	}
}
