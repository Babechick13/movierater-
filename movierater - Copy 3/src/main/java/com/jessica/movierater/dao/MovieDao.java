package com.jessica.movierater.dao;

import com.jessica.movierater.model.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieDao extends CrudRepository<Movie, String> {
}
