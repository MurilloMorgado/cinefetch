package br.com.murillo.cinefetch.application.service;

import org.springframework.stereotype.Service;

import br.com.murillo.cinefetch.application.input.MovieInputPort;
import br.com.murillo.cinefetch.domain.models.Movie;

@Service
public class MovieService implements MovieInputPort {

  @Override
  public Movie findMovieByName(String movieName) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'findMovieByName'");
  }
  
}
