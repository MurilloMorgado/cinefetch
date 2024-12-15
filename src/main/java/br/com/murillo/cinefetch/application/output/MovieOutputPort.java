package br.com.murillo.cinefetch.application.output;

import br.com.murillo.cinefetch.domain.models.Movie;

public interface MovieOutputPort {

  Movie findMovieByName(String movieName);
  
} 
