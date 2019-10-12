/**
 * 
 */
package com.hackthon.solatech.serviceimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackthon.solatech.apicall.APICall;
import com.hackthon.solatech.dto.AccountDetailDTO;
import com.hackthon.solatech.service.AccountService;

/**
 * @author User1
 *
 */
@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private APICall apiCall;
	private static final Logger lOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);
	
	@Override
	public String getAccount() {
		  String authHeader = "DirectLogin token=eyJhbGciOiJIUzI1NiJ9.eyIiOiIifQ.MeSIt1RbODVTlVSzQWeJ2E8uBW0B_0rtCT5ruQQhNWU";
		  String url="https://apisandbox.openbankproject.com/obp/v4.0.0/banks/test-bank/balances";
		  return apiCall.getResponseFromAPI(url, authHeader, "GET");
		
	}
	
	@Override
	public String creatAccount(String id, AccountDetailDTO accountDetailDTO) {
		  System.out.println("Id : : "+id);
		  String authHeader = "DirectLogin token=eyJhbGciOiJIUzI1NiJ9.eyIiOiIifQ.MeSIt1RbODVTlVSzQWeJ2E8uBW0B_0rtCT5ruQQhNWU";
		  //String url="https://apisandbox.openbankproject.com/obp/v4.0.0/banks/test-bank/accounts/?id";
		  String url="https://apisandbox.openbankproject.com/obp/v4.0.0/banks/test-bank/balances";
		  return apiCall.getResponseFromAPI(url, authHeader, "GET");
		  
		  
		/*
		 * lOGGER.info("UserServiceImpl.getAllUsers has been called");
		 * 
		 * UserResponseBO userResponseBO=new UserResponseBO(); List<UserBo> userBos=new
		 * ArrayList<>(); UserBo userBo=new UserBo(); userBo.setId(1);
		 * userBo.setName("Mukesh"); userBos.add(userBo);
		 * 
		 * userResponseBO.setUserBos(userBos);
		 */
		//return null;
	}



}
