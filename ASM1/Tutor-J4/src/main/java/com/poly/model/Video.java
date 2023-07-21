package com.poly.model;

public class Video {
	String title;
	String href;
	String poster;
	int like;
	String description;
	public Video() {
		super();
	}
	public Video(String title, String href, String poster, int like, String description) {
		super();
		this.title = title;
		this.href = href;
		this.poster = poster;
		this.like = like;
		this.description = description;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public int getLike() {
		return like;
	}
	public void setLike(int like) {
		this.like = like;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
