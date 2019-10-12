/**
 * 
 */
package com.hackthon.solatech.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hackthon.solatech.model.LoginRequestBo;
import com.hackthon.solatech.model.SolaTechResponseBO;

/**
 * @author User1
 *
 */

@RestController
public class LoginController {

	
	
	private static final Logger lOGGER = LoggerFactory.getLogger(LoginController.class);

	
	
	
	@PostMapping("/login")
	private SolaTechResponseBO validateUser(@RequestBody LoginRequestBo loginRequestBo) {
		lOGGER.info("LoginController.validateUser has been called");
		SolaTechResponseBO solaTechResponseBO=new SolaTechResponseBO();
		 solaTechResponseBO.setMessage("User Login successfully");
		 return solaTechResponseBO;
	}
	
	
}
