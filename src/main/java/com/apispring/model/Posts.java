package com.apispring.model;

public class Posts {
 private Long id;
 private Long user_id;
 private String title;
 private String body;
@Override
public String toString() {
	return "Model [id=" + id + ", user_id=" + user_id + ", title=" + title + ", body=" + body + "]";
}
public Posts(Long id, Long user_id, String title, String body) {
	super();
	this.id = id;
	this.user_id = user_id;
	this.title = title;
	this.body = body;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Long getUser_id() {
	return user_id;
}
public void setUser_id(Long user_id) {
	this.user_id = user_id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getBody() {
	return body;
}
public void setBody(String body) {
	this.body = body;
}
 
}
