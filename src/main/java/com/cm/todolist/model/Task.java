/**
 * 
 * @author chenma
 * 9 Jul 2018
 */
package com.cm.todolist.model;

import java.util.Date;

import com.cm.todolist.service.JSONFormatter;

/**
 * @author chenma
 *
 */
public class Task {
	
	private int id;
	private String title;
	private String note;
	private String status;
	private Date createDate;
	private Date dueDate;
	private int userId;
	private boolean overDue;
	private boolean today;
	
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * Constructor 
	 */
	public Task(){
		
	}
	
	/**
	 * Constructor
	 * 
	 * @param id
	 * @param title
	 * @param note
	 * @param status
	 * @param dueDate
	 */
	public Task(int id, String title, String note, String status, Date createDate, Date dueDate){
		this.id = id;
		this.title = title;
		this.note = note;
		this.status = status;
		this.createDate = createDate;
		this.dueDate = dueDate;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the note
	 */
	public String getNote() {
		return note;
	}
	/**
	 * @param note the note to set
	 */
	public void setNote(String note) {
		this.note = note;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * @return the dueDate
	 */
	public Date getDueDate() {
		return dueDate;
	}
	/**
	 * @param dueDate the dueDate to set
	 */
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	/**
	 * @return the isOverDue
	 */
	public boolean isOverDue() {
		return overDue;
	}

	/**
	 * @param isOverDue the isOverDue to set
	 */
	public void setOverDue(boolean isOverDue) {
		this.overDue = isOverDue;
	}

	/**
	 * @return the today
	 */
	public boolean isToday() {
		return today;
	}

	/**
	 * @param today the today to set
	 */
	public void setToday(boolean today) {
		this.today = today;
	}
	/**
	 * Returns a JSON string corresponding to object state
	 *
	 * @return JSON representation
	 */
	public String toJSON() {
		return JSONFormatter.toJSON(this);
	}

	@Override
	public String toString() {
		return toJSON();
	}
}
