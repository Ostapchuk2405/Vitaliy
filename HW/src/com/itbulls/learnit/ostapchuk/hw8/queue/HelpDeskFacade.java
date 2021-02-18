package com.itbulls.learnit.ostapchuk.hw8.queue;

public interface HelpDeskFacade {

	void addNewSupportTicket(SupportTicket supportTicket);

	SupportTicket getNextSupportTicket();

	int getNumberOfTickets();

}
