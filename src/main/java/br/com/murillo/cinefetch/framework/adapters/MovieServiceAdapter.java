package br.com.murillo.cinefetch.framework.adapters;

import org.springframework.stereotype.Component;

import br.com.murillo.cinefetch.application.output.MovieOutputPort;
import br.com.murillo.cinefetch.domain.models.Movie;

@Component
public class MovieServiceAdapter implements MovieOutputPort {

  @Override
  public Movie findMovieByName(String movieName) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'findMovieByName'");
  }
  
}
