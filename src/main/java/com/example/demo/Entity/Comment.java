package com.example.demo.Entity;

import java.sql.Timestamp;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Comment")
public class Comment {

	@Id
	private UUID commentID;
	private UUID postID;
	private String userImage;
	private String userName;

	public UUID getCommentID() {
		return commentID;
	}

	public void setCommentID(UUID commentID) {
		this.commentID = commentID;
	}

	public UUID getPostID() {
		return postID;
	}

	public void setPostID(UUID postID) {
		this.postID = postID;
	}

	public String getUserImage() {
		return userImage;
	}

	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Comment(UUID commentID, UUID postID, String userImage, String userName) {
		super();
		this.commentID = commentID;
		this.postID = postID;
		this.userImage = userImage;
		this.userName = userName;
	}

	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setTimestamp(Timestamp dateTime) {
		// TODO Auto-generated method stub

	}

}
