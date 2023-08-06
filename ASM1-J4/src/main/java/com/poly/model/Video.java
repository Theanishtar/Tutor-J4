package com.poly.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="video")
public class Video {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long videoid;
	String title;
	String href;
	int like;
	String poster;

	public Video(String title, String href, int like, String poster) {
		super();
		this.title = title;
		this.href = href;
		this.like = like;
		this.poster = poster;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Video() {
		super();
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}
}
