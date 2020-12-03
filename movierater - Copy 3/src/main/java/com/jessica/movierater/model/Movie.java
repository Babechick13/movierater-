package com.jessica.movierater.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The type Movie.
 */
@Entity
@Table(name = "movie", schema = "demo")
public class Movie {
	@Id
	@Column(name = "id", length = 50)
	private String id;
	@Column(name = "title", length = 50)
	private String title;
	@Column(name = "thumbsup", length = 10)
	private int thumbsUp;
	@Column(name = "thumbsdown", length = 10)
	private int thumbsDown;

	/**
	 * Instantiates a new Movie.
	 *
	 * @param id         the id
	 * @param title      the title
	 * @param thumbsUp   the thumbs up
	 * @param thumbsDown the thumbs down
	 */
	public Movie(String id, String title, int thumbsUp, int thumbsDown) {
		this.id = id;
		this.title = title;
		this.thumbsUp = thumbsUp;
		this.thumbsDown = thumbsDown;
	}

	/**
	 * Instantiates a new Movie.
	 */
	public Movie() {
	}

	/**
	 * Gets id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets id.
	 *
	 * @param id the id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Gets title.
	 *
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets title.
	 *
	 * @param title the title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Gets thumbs up.
	 *
	 * @return the thumbs up
	 */
	public int getThumbsUp() {
		return thumbsUp;
	}

	/**
	 * Sets thumbs up.
	 *
	 * @param thumbsUp the thumbs up
	 */
	public void setThumbsUp(int thumbsUp) {
		this.thumbsUp = thumbsUp;
	}

	/**
	 * Gets thumbs down.
	 *
	 * @return the thumbs down
	 */
	public int getThumbsDown() {
		return thumbsDown;
	}

	/**
	 * Sets thumbs down.
	 *
	 * @param thumbsDown the thumbs down
	 */
	public void setThumbsDown(int thumbsDown) {
		this.thumbsDown = thumbsDown;
	}
}
