package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Comment;
import com.example.demo.Service.CommentService;

@CrossOrigin
@RestController
@RequestMapping("/api/commentService")
public class CommentController {

	@Autowired
	CommentService commentService;

	@PostMapping("/save")
	public Comment saveComment(@RequestBody Comment comment) {
		return commentService.saveComment(comment);
	}

	@GetMapping("/getAllComments/{postID}")
	public ArrayList<Comment> getAllComments(@PathVariable("postID") UUID postID) {
		return commentService.getAllComment(postID);

	}

}
