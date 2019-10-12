/**
 * 
 */
package com.hackthon.solatech.serviceimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hackthon.solatech.model.SolaTechResponseBO;
import com.hackthon.solatech.model.UserRequestBo;
import com.hackthon.solatech.service.UserService;

/**
 * @author User1
 *
 */
public class UserServiceImpl implements UserService {
	
	private static final Logger lOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

	@Override
	public SolaTechResponseBO getAllUsers() {
		lOGGER.info("UserServiceImpl.getAllUsers has been called");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SolaTechResponseBO addUser(UserRequestBo userRequestBo) {
		lOGGER.info("UserServiceImpl.addUser has been called");
		// TODO Auto-generated method stub
		return null;
	}

}
