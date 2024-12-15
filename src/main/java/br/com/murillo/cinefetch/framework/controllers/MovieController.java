package br.com.murillo.cinefetch.framework.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.murillo.cinefetch.application.input.MovieInputPort;
import br.com.murillo.cinefetch.domain.models.Movie;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "movie")
public class MovieController {

  private final MovieInputPort movieInputPort;

  @GetMapping
  public ResponseEntity<Movie> findMovieByName(@RequestParam String movieName){
    
    Movie movie = movieInputPort.findMovieByName(movieName);

    return ResponseEntity.ok().body(movie); 
  }

}
