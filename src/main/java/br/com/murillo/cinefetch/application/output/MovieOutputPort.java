package br.com.murillo.cinefetch.application.output;

import java.util.List;

import br.com.murillo.cinefetch.domain.models.Movie;

public interface MovieOutputPort {

  List<Movie> findListMovieByName(String movieName, String apikey);

  Movie findMovieByName(String movieName, String apikey);
  
} 
