package br.com.murillo.cinefetch.framework.adapters;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import br.com.murillo.cinefetch.application.output.MovieOutputPort;
import br.com.murillo.cinefetch.domain.models.Movie;

@Service
public class MovieServiceAdapter implements MovieOutputPort {

  private static final String URL_API = "www.omdbapi.com";
  private final WebClient.Builder webClientBuilder;

  public MovieServiceAdapter(WebClient.Builder webClientBuilder) {
    this.webClientBuilder = webClientBuilder;
  }

  @Override
  public Movie findMovieByName(String movieName, String apikey) {
    WebClient webClient = webClientBuilder.baseUrl(URL_API).build();

    return webClient.get()
        .uri(uriBuilder -> uriBuilder
            .queryParam("apikey", apikey)
            .queryParam("t", movieName)
            .build())
        .retrieve()
        .bodyToMono(Movie.class)
        .block();
  }

}
