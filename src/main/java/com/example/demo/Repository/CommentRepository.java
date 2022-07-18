package com.example.demo.Repository;

import java.util.ArrayList;
import java.util.UUID;

import com.example.demo.Entity.Comment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

	Comment save(Comment comment);


	ArrayList<Comment> findAllByPostID(Long postID);

}
