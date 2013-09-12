package com.TaskList;

import java.util.ArrayList;

public class TaskList {
	private ArrayList<Task> tasks = new ArrayList<Task>();
	
	public TaskList(Task[] taskArr) {
		for(int i=0; i<taskArr.length; i++) {
			tasks.add(taskArr[i]);
		}
	}
	
	public TaskList(Task t) {
		tasks.add(t);
	}
	
	public TaskList() {
		
	}

	public ArrayList<Task> getTasks() {
		return tasks;
	}

	public void setTasks(ArrayList<Task> tasks) {
		this.tasks = tasks;
	}
}
