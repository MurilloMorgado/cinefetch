package br.com.murillo.cinefetch.framework.adapters;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import br.com.murillo.cinefetch.application.output.MovieOutputPort;
import br.com.murillo.cinefetch.domain.models.Movie;

@Service
public class MovieServiceAdapter implements MovieOutputPort {

  private static final String API_KEY = "d8c1a254";
  private static final String URL_API = "www.omdbapi.com";
  private final WebClient.Builder webClientBuilder;

  public MovieServiceAdapter(WebClient.Builder webClientBuilder) {
    this.webClientBuilder = webClientBuilder;
  }

  @Override
  public Movie findMovieByName(String movieName) {
    WebClient webClient = webClientBuilder.baseUrl(URL_API).build();

    return webClient.get()
        .uri(uriBuilder -> uriBuilder
            .queryParam("t", movieName)
            .queryParam("apikey", API_KEY)
            .build())
        .retrieve()
        .bodyToMono(Movie.class)
        .block();
  }

}
