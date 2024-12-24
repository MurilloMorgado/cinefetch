package br.com.murillo.cinefetch.application.input;

import java.util.List;

import br.com.murillo.cinefetch.domain.models.Movie;
import br.com.murillo.cinefetch.domain.models.Search;

public interface MovieInputPort {

  List<Search> listaDeFilmes(String movieName, String apikey);

  Movie findMovieByName(String movieName, String apikey);
  
} 
