/**
 * 
 */
package com.hackthon.solatech.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hackthon.solatech.model.LoginRequestBo;
import com.hackthon.solatech.model.SolaTechResponseBO;
import com.hackthon.solatech.service.LoginService;

/**
 * @author User1
 *
 */

@RestController
public class LoginController {

	
	
	private static final Logger lOGGER = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private LoginService loginService;
	
	
	@PostMapping("/login")
	private SolaTechResponseBO validateUser(@RequestBody LoginRequestBo loginRequestBo) {
		lOGGER.info("LoginController.validateUser has been called");
		return loginService.validateUser(loginRequestBo);
	}
	
	
}
