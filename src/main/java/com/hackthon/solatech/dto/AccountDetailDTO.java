package com.hackthon.solatech.dto;

import java.util.List;

public class AccountDetailDTO {
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public BalanceDTO getBalance() {
		return balance;
	}
	public void setBalance(BalanceDTO balance) {
		this.balance = balance;
	}
	public String getBranch_id() {
		return branch_id;
	}
	public void setBranch_id(String branch_id) {
		this.branch_id = branch_id;
	}
	public AccountAouting getAccount_routing() {
		return account_routing;
	}
	public void setAccount_routing(AccountAouting account_routing) {
		this.account_routing = account_routing;
	}
	private String user_id;
	private String label;
	private String type;
	private BalanceDTO balance;
	private String branch_id;
	private AccountAouting account_routing;
	
	
	
//	
//	{  "user_id":"",  "label":"Label2",  "type":"CURRENT",  "balance":{    "currency":"EUR",    "amount":"0"  }, 
//		
//		"branch_id":"1234",  "account_routing":{    "scheme":"OBP",    "address":"UK123456"  }}
//
//}
	
}
