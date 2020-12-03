package com.jessica.movierater.model;

/**
 * The type Search element.
 */
public class SearchElement {

	private String filterType;
	private String query;

	/**
	 * Instantiates a new Search element.
	 *
	 * @param filterType the filter type
	 * @param query      the query
	 */
	public SearchElement(String filterType, String query) {
		this.filterType = filterType;
		this.query = query;
	}

	/**
	 * Instantiates a new Search element.
	 */
	public SearchElement() {
	}

	/**
	 * Gets filter type.
	 *
	 * @return the filter type
	 */
	public String getFilterType() {
		return filterType;
	}

	/**
	 * Sets filter type.
	 *
	 * @param filterType the filter type
	 */
	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}

	/**
	 * Gets query.
	 *
	 * @return the query
	 */
	public String getQuery() {
		return query;
	}

	/**
	 * Sets query.
	 *
	 * @param query the query
	 */
	public void setQuery(String query) {
		this.query = query;
	}
}
