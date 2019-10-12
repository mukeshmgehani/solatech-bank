/**
 * 
 */
package com.hackthon.solatech.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.hackthon.solatech.model.SolaTechResponseBO;
import com.hackthon.solatech.model.UserBo;
import com.hackthon.solatech.model.UserRequestBo;
import com.hackthon.solatech.model.UserResponseBO;
import com.hackthon.solatech.service.UserService;

/**
 * @author User1
 *
 */
@Service
public class UserServiceImpl implements UserService {
	
	private static final Logger lOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

	@Override
	public SolaTechResponseBO getAllUsers() {
		lOGGER.info("UserServiceImpl.getAllUsers has been called");

		UserResponseBO userResponseBO=new UserResponseBO();
		List<UserBo> userBos=new ArrayList<>();
		UserBo userBo=new UserBo();
		userBo.setId(1);
		userBo.setName("Mukesh");
		userBos.add(userBo);
		
		userResponseBO.setUserBos(userBos);
		return userResponseBO;
	}

	@Override
	public SolaTechResponseBO addUser(UserRequestBo userRequestBo) {
		lOGGER.info("UserServiceImpl.addUser has been called");
		SolaTechResponseBO solaTechResponseBO=new SolaTechResponseBO();
		 solaTechResponseBO.setMessage("User has been created");
		 return solaTechResponseBO;
	}

}
