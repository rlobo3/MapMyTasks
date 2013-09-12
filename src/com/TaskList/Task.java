package com.TaskList;

import java.sql.Timestamp;

public class Task {
	private Location loc;
	private String title;
	private Timestamp createDate;
	private Timestamp dueDate;
	private boolean completed;
	
	public Task(Location loc, String title, Timestamp createDate,
			Timestamp dueDate, boolean completed) {
		this.loc = loc;
		this.title = title;
		this.createDate = createDate;
		this.dueDate = dueDate;
		this.completed = completed;
	}
	
	public Task(String title, Timestamp createDate, Timestamp dueDate, 
			boolean completed) {
		this(null, title, createDate, dueDate, completed);
	}

	public Location getLoc() {
		return loc;
	}

	public void setLoc(Location loc) {
		this.loc = loc;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public Timestamp getDueDate() {
		return dueDate;
	}

	public void setDueDate(Timestamp dueDate) {
		this.dueDate = dueDate;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}	
}
