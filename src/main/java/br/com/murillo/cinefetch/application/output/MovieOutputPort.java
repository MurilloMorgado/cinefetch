package br.com.murillo.cinefetch.application.output;

import java.util.List;

import br.com.murillo.cinefetch.domain.models.Movie;
import br.com.murillo.cinefetch.domain.models.Search;

public interface MovieOutputPort {

  List<Search> findListMovieByName(String movieName, String apikey);

  Movie findMovieByName(String movieName, String apikey);
  
} 
