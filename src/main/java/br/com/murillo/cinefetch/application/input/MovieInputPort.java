package br.com.murillo.cinefetch.application.input;

import br.com.murillo.cinefetch.domain.models.Movie;

public interface MovieInputPort {

  Movie findMovieByName(String movieName);
  
} 
