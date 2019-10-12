/**
 * 
 */
package com.hackthon.solatech.serviceimpl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.hackthon.solatech.entity.User;
import com.hackthon.solatech.model.SolaTechResponseBO;
import com.hackthon.solatech.model.UserBo;
import com.hackthon.solatech.model.UserRequestBo;
import com.hackthon.solatech.model.UserResponseBO;
import com.hackthon.solatech.repository.UserRepository;
import com.hackthon.solatech.service.UserService;

/**
 * @author User1
 *
 */
@Service
public class UserServiceImpl implements UserService {
	
	private static final Logger lOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
	
	private static final String DATE_FORMATTER= "yyyy-MM-dd";
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public SolaTechResponseBO getAllUsers() {
		lOGGER.info("UserServiceImpl.getAllUsers has been called");
		List<User> users=userRepository.findAll();
		UserResponseBO userResponseBO=new UserResponseBO();
		if(CollectionUtils.isEmpty(users)) {
			userResponseBO.setMessage("Users are not available");
		}
		
		List<UserBo> userBos=new ArrayList<>();
		users.forEach(user->{
			UserBo userBo=new UserBo();
			userBo.setId(user.getUserId());
			userBo.setMobileNo(user.getMobileNo());
			userBo.setName(user.getUserName());
			userBo.setUserEmail(user.getUserEmail());

	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMATTER);
	        String formatDateTime = user.getDateOfBirth().format(formatter);
			userBo.setDateOfJoining(formatDateTime);
			userBos.add(userBo);
		});
		userResponseBO.setUserBos(userBos);
		return userResponseBO;
	}

	@Override
	public SolaTechResponseBO addUser(UserRequestBo userRequestBo) {
		lOGGER.info("UserServiceImpl.addUser has been called");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMATTER);
        LocalDate formatDateTime = LocalDate.parse(userRequestBo.getDateOfBirth(), formatter);
		User user=new User(userRequestBo.getName(),userRequestBo.getPassword(),userRequestBo.getEmail(),userRequestBo.getPhone(),formatDateTime.atStartOfDay());
		user=userRepository.save(user);
		SolaTechResponseBO solaTechResponseBO=new SolaTechResponseBO();
		if(user.getUserId()!=null)
		 solaTechResponseBO.setMessage("User has been created");
		else
			solaTechResponseBO.setMessage("User creation has been failed");
		 return solaTechResponseBO;
	}

}
