package com.jessica.movierater.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * The type Imdb response.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ImdbResponse {
	private String searchType;
	private String expression;
	private List<MovieDetail> results;
	private String errorMessage;

	/**
	 * Instantiates a new Imdb response.
	 *
	 * @param searchType   the search type
	 * @param expression   the expression
	 * @param results      the results
	 * @param errorMessage the error message
	 */
	public ImdbResponse(
		String searchType, String expression,
		List<MovieDetail> results, String errorMessage) {
		this.searchType = searchType;
		this.expression = expression;
		this.results = results;
		this.errorMessage = errorMessage;
	}

	/**
	 * Instantiates a new Imdb response.
	 */
	public ImdbResponse() {
	}

	/**
	 * Gets search type.
	 *
	 * @return the search type
	 */
	public String getSearchType() {
		return searchType;
	}

	/**
	 * Sets search type.
	 *
	 * @param searchType the search type
	 */
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	/**
	 * Gets expression.
	 *
	 * @return the expression
	 */
	public String getExpression() {
		return expression;
	}

	/**
	 * Sets expression.
	 *
	 * @param expression the expression
	 */
	public void setExpression(String expression) {
		this.expression = expression;
	}

	/**
	 * Gets results.
	 *
	 * @return the results
	 */
	public List<MovieDetail> getResults() {
		return results;
	}

	/**
	 * Sets results.
	 *
	 * @param results the results
	 */
	public void setResults(List<MovieDetail> results) {
		this.results = results;
	}

	/**
	 * Gets error message.
	 *
	 * @return the error message
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * Sets error message.
	 *
	 * @param errorMessage the error message
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
