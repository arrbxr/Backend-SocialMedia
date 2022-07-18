package com.example.demo.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import com.example.demo.Entity.Post;
import com.example.demo.Repository.PostRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

	@Autowired
	PostRepository postRepo;

	public ArrayList<Post> submitPostToDB(Post postData) {

		Date date = new Date();
		long time = date.getTime();
		Timestamp dateTime = new Timestamp(time);

		postData.setPostID((long)(Math.random()*100));
		postData.setLikes(0);
		postData.setDateTime(dateTime);

		postRepo.save(postData);
		ArrayList<Post> result = retrivePostFromDB();
		return result;
	}

	public ArrayList<Post> retrivePostFromDB() {
		ArrayList<Post> result = postRepo.findAll();
		return result;
	}

	public ArrayList<Post> deletePostFromDB(Long postID) {
		postRepo.deleteById(postID);

		//ArrayList<Post> result = retrivePostFromDB();
		//return result;
		 return postRepo.findAll();
		
		
	}

}
