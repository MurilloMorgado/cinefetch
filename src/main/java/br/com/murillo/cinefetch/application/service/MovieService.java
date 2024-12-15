package br.com.murillo.cinefetch.application.service;

import org.springframework.stereotype.Service;

import br.com.murillo.cinefetch.application.input.MovieInputPort;
import br.com.murillo.cinefetch.domain.models.Movie;
import br.com.murillo.cinefetch.framework.adapters.MovieServiceAdapter;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MovieService implements MovieInputPort {

  private final MovieServiceAdapter movieServiceAdapter;

  @Override
  public Movie findMovieByName(String movieName) {
    Movie movie = movieServiceAdapter.findMovieByName(movieName);
    return movie;
  }

}
