package com.example.hellotwitter.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Encapsulates the data related to a tweet.
 * 
 * @author anirvan
 */
public class Tweet implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String id;

	private String header;
	
	private String body;
	
	private Date date;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
