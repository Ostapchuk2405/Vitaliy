package com.itbulls.learnit.ostapchuk.hw5;

public enum MessageType {

	A(Priority.HIGH), B(Priority.MEDIUM), C(Priority.LOW), D(Priority.LOW);

	private MessageType(Priority priority) {
		
		this.priority = priority;
	}
	

	private Priority priority;
	
	

	public Priority getPriority() {
		return this.priority;
	}

}
