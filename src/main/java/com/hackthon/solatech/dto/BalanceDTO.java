package com.hackthon.solatech.dto;

public class BalanceDTO {

	
	private String currency;
	
	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	private String amount;
}
