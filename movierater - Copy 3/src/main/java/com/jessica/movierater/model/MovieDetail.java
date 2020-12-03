package com.jessica.movierater.model;

/**
 * The type Movie detail.
 */
public class MovieDetail {
	private String id;
	private String resultType;
	private String image;
	private String title;
	private String description;

	/**
	 * Instantiates a new Movie detail.
	 *
	 * @param id          the id
	 * @param resultType  the result type
	 * @param image       the image
	 * @param title       the title
	 * @param description the description
	 */
	public MovieDetail(String id, String resultType, String image, String title, String description) {
		this.id = id;
		this.resultType = resultType;
		this.image = image;
		this.title = title;
		this.description = description;
	}

	/**
	 * Instantiates a new Movie detail.
	 */
	public MovieDetail() {
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
	 * Gets result type.
	 *
	 * @return the result type
	 */
	public String getResultType() {
		return resultType;
	}

	/**
	 * Sets result type.
	 *
	 * @param resultType the result type
	 */
	public void setResultType(String resultType) {
		this.resultType = resultType;
	}

	/**
	 * Gets image.
	 *
	 * @return the image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * Sets image.
	 *
	 * @param image the image
	 */
	public void setImage(String image) {
		this.image = image;
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
	 * Gets description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets description.
	 *
	 * @param description the description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
}
