package br.com.murillo.cinefetch.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.murillo.cinefetch.application.input.MovieInputPort;
import br.com.murillo.cinefetch.domain.models.Movie;
import br.com.murillo.cinefetch.domain.models.Search;
import br.com.murillo.cinefetch.framework.adapters.MovieServiceAdapter;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MovieService implements MovieInputPort {

  private final MovieServiceAdapter movieServiceAdapter;

  @Override
  public Movie findMovieByName(String movieName, String apikey) {
    Movie movie = movieServiceAdapter.findMovieByName(movieName, apikey);
    return movie;
  }

  @Override
  public List<Search> listaDeFilmes(String movieName, String apikey) {
    List<Search> listaDeFilmes = movieServiceAdapter.findListMovieByName(movieName, apikey);
    return listaDeFilmes;
  }

}
