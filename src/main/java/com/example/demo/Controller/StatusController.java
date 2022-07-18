package com.example.demo.Controller;

import java.util.ArrayList;

import com.example.demo.Entity.Status;
import com.example.demo.Service.StatusService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api/statusService")
public class StatusController {

	@Autowired
	StatusService statusService;

	static Logger logger = LogManager.getLogger(StatusController.class);

	@PostMapping("/save")
	public Status saveStatus(@RequestBody Status status) {
		logger.info("status service save hit ................");
		return statusService.saveStatus(status);
	}

	@GetMapping("/getAllStatus")
	public ArrayList<Status> getAllStatus() {
		logger.info("status service getAllStatus hit ..................");
		return statusService.getAllStatus();
	}

}
