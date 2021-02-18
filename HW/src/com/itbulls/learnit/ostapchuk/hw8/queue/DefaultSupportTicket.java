package com.itbulls.learnit.ostapchuk.hw8.queue;

import com.itbulls.learnit.ostapchuk.hw8.queue.Priority;
import com.itbulls.learnit.ostapchuk.hw8.queue.RequestType;
import com.itbulls.learnit.ostapchuk.hw8.queue.SupportTicket;

public class DefaultSupportTicket implements SupportTicket {

	private static int counter;
	private RequestType requestType;
	private int sequentialNumber;
	{
		sequentialNumber = ++counter;
	}
	public DefaultSupportTicket() {
		
	}
	public DefaultSupportTicket(RequestType requestType) {
		this.requestType = requestType;
	}
	@Override
	public Priority getPriority() {
		if(requestType == null) {
		return null;
		}
		return this.requestType.getPriority();
	}
	
	@Override
	public int getSeqquentialNumber() {
		return this.sequentialNumber;
	}
	@Override
	public RequestType getRequestType() {
		return this.requestType;
	}
	
	
}
