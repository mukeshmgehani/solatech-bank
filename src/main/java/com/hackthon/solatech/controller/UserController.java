/**
 * 
 */
package com.hackthon.solatech.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hackthon.solatech.model.SolaTechResponseBO;
import com.hackthon.solatech.model.UserRequestBo;
import com.hackthon.solatech.model.UserResponseBO;

/**
 * @author User1
 *
 */

@RestController
public class UserController {

	
	
	private static final Logger lOGGER = LoggerFactory.getLogger(UserController.class);

	
	@GetMapping("/users")
	private SolaTechResponseBO getAllUsers() {
		lOGGER.info("UserController.getAllUsers has been called");
		SolaTechResponseBO userResponseBO=new UserResponseBO();
		return userResponseBO;
	}
	
	@PostMapping("/users")
	private SolaTechResponseBO addUser(@RequestBody UserRequestBo userRequestBo) {
		lOGGER.info("UserController.addUser has been called");
		SolaTechResponseBO solaTechResponseBO=new SolaTechResponseBO();
		 solaTechResponseBO.setMessage("User has been created");
		 return solaTechResponseBO;
	}
	
	
}
