package com.mutaz.gwtrpc.shared;

import com.google.gwt.user.client.rpc.IsSerializable;

// This is a DTO object that will be used to move data 
public class Book implements IsSerializable{
	
	private int id;
	private String title;
	private String authorName;
	
	public Book(){
	}
	
	public Book(int id, String title, String authorName) {
		super();
		this.id = id;
		this.title = title;
		this.authorName = authorName;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthorName() {
		return authorName;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", authorName=" + authorName + "]";
	}
}
