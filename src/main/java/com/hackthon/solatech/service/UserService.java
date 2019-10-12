/**
 * 
 */
package com.hackthon.solatech.service;

import com.hackthon.solatech.model.SolaTechResponseBO;
import com.hackthon.solatech.model.UserRequestBo;

/**
 * @author User1
 *
 */
public interface UserService {
	
	SolaTechResponseBO getAllUsers();
	
	SolaTechResponseBO addUser(UserRequestBo userRequestBo);

}
