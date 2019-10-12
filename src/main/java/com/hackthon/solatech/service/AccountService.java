package com.hackthon.solatech.service;

import com.hackthon.solatech.dto.AccountDetailDTO;

public interface AccountService {
	
	String creatAccount(String id, AccountDetailDTO accountDetailDTO);
	String getAccount();



}
