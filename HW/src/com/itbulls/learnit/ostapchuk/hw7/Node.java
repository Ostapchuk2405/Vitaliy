package com.itbulls.learnit.ostapchuk.hw7;

private static class Node {
	
	private Object data;
	private Node next;
	private Node previous;
	
	public Node(Object data, Node next, Node previous) {
		super();
		this.data = data;
		this.next = next;
		this.previous = previous;
	}

	@Override
	public String toString() {
		return data.toString();
	}
	
	

}
