package com.example.demo.Entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Status")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Status {

	@Id
	private Long statusID;
	private Long userID;
	private String statusImageURL;
	private Timestamp uploadTIme;

}
