package com.jessica.movierater.service;

import com.jessica.movierater.dao.MovieDao;
import com.jessica.movierater.model.ImdbResponse;
import com.jessica.movierater.model.Movie;
import com.jessica.movierater.model.MovieDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

/**
 * The type Movie service.
 */
@Service
public class MovieService {

	private static final String SEPARATOR = "/";
	@Value("${imdb.api.key}")
	private String apiKey;

	@Value("${imdb.base.url}")
	private String baseUrl;

	private final RestTemplate restTemplate;
	private final MovieDao movieDao;

	/**
	 * Instantiates a new Movie service.
	 *
	 * @param movieDao     the movie dao
	 * @param restTemplate the rest template
	 */
	@Autowired
	public MovieService(MovieDao movieDao, RestTemplate restTemplate) {
		this.movieDao = movieDao;
		this.restTemplate = restTemplate;
	}

	/**
	 * Gets all movies.
	 *
	 * @param filter the filter
	 * @param query  the query
	 * @return the all movies
	 */
	public List<MovieDetail> getAllMovies(String filter, String query) {
		String urlBuilder = baseUrl +
				SEPARATOR +
				filter +
				SEPARATOR +
				apiKey +
				SEPARATOR +
				query;
		ImdbResponse imdbResponse = restTemplate.getForObject(urlBuilder, ImdbResponse.class);
		return imdbResponse.getResults();
	}

	/**
	 * Update movie.
	 *
	 * @param id_title the id title
	 * @param isLiked  the is liked
	 */
	public void updateMovie(String id_title, boolean isLiked) {
		String id = id_title.substring(0, id_title.indexOf("_"));
		String title = id_title.substring(id_title.indexOf("_") + 1);
		final Optional<Movie> byId = movieDao.findById(id);
		int thumbsUp = 0;
		int thumbsDown = 0;
		if (byId.isPresent()) {
			final Movie movie = byId.get();
			thumbsUp = movie.getThumbsUp();
			thumbsDown = movie.getThumbsDown();
			if (isLiked) {
				thumbsUp += 1;
			} else {
				thumbsDown += 1;
			}
			movie.setThumbsUp(thumbsUp);
			movie.setThumbsDown(thumbsDown);
			movie.setId(id);
			movieDao.save(movie);
		} else {
			final Movie movie = new Movie();
			movie.setTitle(title);
			if (isLiked) {
				thumbsUp += 1;
			} else {
				thumbsDown += 1;
			}
			movie.setThumbsUp(thumbsUp);
			movie.setThumbsDown(thumbsDown);
			movie.setId(id);
			movieDao.save(movie);
		}
	}
}
