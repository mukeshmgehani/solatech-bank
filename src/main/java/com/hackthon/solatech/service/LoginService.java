/**
 * 
 */
package com.hackthon.solatech.service;

import com.hackthon.solatech.model.LoginRequestBo;
import com.hackthon.solatech.model.SolaTechResponseBO;

/**
 * @author User1
 *
 */
public interface LoginService {
	
	SolaTechResponseBO validateUser(LoginRequestBo loginRequestBo);

}
