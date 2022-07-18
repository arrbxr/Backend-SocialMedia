package com.example.demo.Repository;

import java.util.ArrayList;
import java.util.UUID;

import com.example.demo.Entity.Post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, UUID> {

	ArrayList<Post> findAll();

	Post save(Post post);

	void deleteById(UUID postID);

}
