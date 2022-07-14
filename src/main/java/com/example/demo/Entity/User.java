package com.example.demo.Entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "User")
public class User {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID userID;
	private String userName;
	private String userImage;
	private boolean active;
	private Timestamp joiningDate;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "us_stts", referencedColumnName = "userID")
	List<Status> status = new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "us_po", referencedColumnName = "userID")
	List<Post> posts = new ArrayList<>();

	public UUID getUserID() {
		return userID;
	}

	public void setUserID(UUID userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserImage() {
		return userImage;
	}

	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Timestamp getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Timestamp joiningDate) {
		this.joiningDate = joiningDate;
	}

	public List<Status> getStatus() {
		return status;
	}

	public void setStatus(List<Status> status) {
		this.status = status;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	public User(String userID, String userName, String userImage, boolean active, Timestamp joiningDate,
			List<Status> status, List<Post> posts) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.userImage = userImage;
		this.active = active;
		this.joiningDate = joiningDate;
		this.status = status;
		this.posts = posts;
	}

	public User() {
		super();
		//TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
