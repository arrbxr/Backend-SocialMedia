package com.example.demo.Controller;

import java.util.ArrayList;

import com.example.demo.Entity.User;
import com.example.demo.Service.UserService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api/userService")
public class UserController {

	static Logger logger = LogManager.getLogger(UserController.class);

	@Autowired
	UserService userService;

	@PostMapping("/save")
	public User saveUserMetaData(@RequestBody User user) {
		logger.info("User service save hit ..........");
		return userService.submitMetaDataOfUser(user);
	}

	@GetMapping("/getUserDetails")
	public ArrayList<User> getAllUserDetails() {
		logger.info("User service getUserDetails hit ..........");
		return userService.retrieveAllUserDetails();
	}

	@GetMapping("/apiAllUsers/{userID}")
	public User getUserDetail(@PathVariable("userID") Long userID) {
		logger.info("User service apiAllUsers hit ..........");
		return userService.getUserData(userID);
	}
}
