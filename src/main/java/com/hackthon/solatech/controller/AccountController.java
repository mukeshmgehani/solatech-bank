package com.hackthon.solatech.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hackthon.solatech.dto.AccountDetailDTO;
import com.hackthon.solatech.model.SolaTechResponseBO;
import com.hackthon.solatech.model.UserRequestBo;
import com.hackthon.solatech.service.AccountService;
import com.hackthon.solatech.service.UserService;


@RestController
public class AccountController {

	
	
	@Autowired
	private AccountService accountService;
	
	private static final Logger lOGGER = LoggerFactory.getLogger(UserController.class);

	
	@PostMapping("/createAccount")
	private String createUserAccount(@RequestParam String id, @RequestBody AccountDetailDTO accountDetailDTO) {
		
		
		lOGGER.info("AccountController.createUserAccount has been called");
		
		return accountService.creatAccount(id,accountDetailDTO);
	}
	
	@GetMapping("/getAccount")
	private String getUserAccount() {
		
		
		lOGGER.info("AccountController.getUserAccount has been called");
		
		return accountService.getAccount();
	}
	
	
	
	
}
