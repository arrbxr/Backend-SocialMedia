package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.UUID;

import com.example.demo.Entity.Comment;
import com.example.demo.Service.CommentService;

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
@RequestMapping("/api/commentService")
public class CommentController {

	@Autowired
	CommentService commentService;

	static Logger logger = LogManager.getLogger(CommentController.class);

	@PostMapping("/save")
	public Comment saveComment(@RequestBody Comment comment) {
		logger.info("comment service save hit ................");
		return commentService.saveComment(comment);
	}

	@GetMapping("/getAllComments/{postID}")
	public ArrayList<Comment> getAllComments(@PathVariable("postID") Long postID) {
		logger.info("comment service getAllComments hit ................");
		return commentService.getAllComment(postID);

	}

}
