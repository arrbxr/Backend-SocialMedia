package com.example.demo.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import com.example.demo.Entity.User;
import com.example.demo.Repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public User submitMetaDataOfUser(User user) {
		Date date = new Date();
		long time = date.getTime();
		Timestamp dateTime = new Timestamp(time);

		user.setUserID(UUID.randomUUID());
		user.setActive(true);
		user.setJoiningDate(dateTime);

		return userRepository.save(user);
	}

	public ArrayList<User> retrieveAllUserDetails() {
		return userRepository.findAll();
	}

	public User getUserData(UUID userID) {
		return userRepository.findAllByuserID(userID);
	}
}
