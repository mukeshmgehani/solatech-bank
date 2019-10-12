/**
 * 
 */
package com.hackthon.solatech.serviceimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackthon.solatech.entity.User;
import com.hackthon.solatech.model.LoginRequestBo;
import com.hackthon.solatech.model.SolaTechResponseBO;
import com.hackthon.solatech.repository.UserRepository;
import com.hackthon.solatech.service.LoginService;

/**
 * @author User1
 *
 */
@Service
public class LoginServiceImpl implements LoginService {
	
	private static final Logger lOGGER = LoggerFactory.getLogger(LoginServiceImpl.class);
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public SolaTechResponseBO validateUser(LoginRequestBo loginRequestBo) {
		lOGGER.info("LoginServiceImpl.validateUser has been called");
		User user=userRepository.findByUserNameAndPassword(loginRequestBo.getUsername(), loginRequestBo.getPassword());
		SolaTechResponseBO solaTechResponseBO=new SolaTechResponseBO();
		if(user!=null)
		 solaTechResponseBO.setMessage("User Login successfully");
		else
			 solaTechResponseBO.setMessage("User Login failed");
		 return solaTechResponseBO;
	}

}
