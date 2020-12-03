package com.jessica.movierater.controller;

import com.jessica.movierater.model.MovieDetail;
import com.jessica.movierater.model.SearchElement;
import com.jessica.movierater.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The type Movie controller.
 */
@Controller
@CrossOrigin("*")
public class MovieController {

	private final MovieService movieService;

	/**
	 * Instantiates a new Movie controller.
	 *
	 * @param movieService the movie service
	 */
	@Autowired
	public MovieController(MovieService movieService) {
		this.movieService = movieService;
	}

	/**
	 * Gets movies.
	 *
	 * @param model the model
	 * @return the movies
	 */
	@GetMapping(path = "/")
	public String getMovies(Model model) {
		model.addAttribute("searchObject", new SearchElement());
		return "home";
	}

	/**
	 * Find all string.
	 *
	 * @param searchElement the search element
	 * @param model         the model
	 * @return the string
	 */
	@RequestMapping(path = "/search", method = RequestMethod.POST)
	public String findAll(@ModelAttribute("searchObject") SearchElement searchElement, Model model) {
		List<MovieDetail> allMovies = movieService.getAllMovies(searchElement.getFilterType(),
				searchElement.getQuery());
		model.addAttribute("movies", allMovies);
		return "moviedetails";
	}

	/**
	 * Like report.
	 *
	 * @param movieid_title the movieid title
	 * @param model         the model
	 */
	@RequestMapping(path = "/like/{movieid_title}", method = RequestMethod.POST)
	public String likeReport(@PathVariable("movieid_title") String movieid_title, Model model) {
		movieService.updateMovie(movieid_title, true);
		return "report";
	}

	/**
	 * Dislike report.
	 *
	 * @param movieid_title the movieid title
	 * @param model         the model
	 */
	@RequestMapping(path = "/dislike/{movieid_title}", method = RequestMethod.POST)
	public String dislikeReport(@PathVariable("movieid_title") String movieid_title, Model model) {
		movieService.updateMovie(movieid_title, false);
		return "report";
	}
}
