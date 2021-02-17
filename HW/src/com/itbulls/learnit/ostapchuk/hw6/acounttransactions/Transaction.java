package com.itbulls.learnit.ostapchuk.hw6.acounttransactions;

public class Transaction {
	
	private Account accountFrom;
	private Account accountTo;
	private double moneyAmount;
	private StandardAccountOperations operation;
	public Account getAccountFrom() {
		return accountFrom;
	}
	public void setAccountFrom(Account accountFrom) {
		this.accountFrom = accountFrom;
	}
	public Account getAccountTo() {
		return accountTo;
	}
	public void setAccountTo(Account accountTo) {
		this.accountTo = accountTo;
	}
	public double getMoneyAmount() {
		return moneyAmount;
	}
	public void setMoneyAmount(double moneyAmount) {
		this.moneyAmount = moneyAmount;
	}
	public StandardAccountOperations getOperation() {
		return operation;
	}
	public void setOperation(StandardAccountOperations operation) {
		this.operation = operation;
	}
	@Override
	public String toString() {
		return "Transaction [accountFrom=" + accountFrom + ", accountTo=" + accountTo + ", moneyAmount=" + moneyAmount
				+ ", operation=" + operation + "]";
	}
	
	

}
