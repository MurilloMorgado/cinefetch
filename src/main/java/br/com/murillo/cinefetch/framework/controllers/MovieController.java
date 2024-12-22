package br.com.murillo.cinefetch.framework.controllers;

import java.util.List;

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
  public ResponseEntity<Movie> findMovieByName(@RequestParam String movieName, @RequestParam String apikey) {

    Movie movie = movieInputPort.findMovieByName(movieName, apikey);

    return ResponseEntity.ok().body(movie);
  }

  @GetMapping(value = "/listar")
  public ResponseEntity<List<Movie>> listarFilmes(@RequestParam String movieName, @RequestParam String apikey) {

    List<Movie> listaFilmes = movieInputPort.listaDeFilmes(movieName, apikey);

    return ResponseEntity.ok().body(listaFilmes);
  }

}
