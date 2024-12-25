package br.com.murillo.cinefetch.framework.adapters;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import br.com.murillo.cinefetch.application.output.MovieOutputPort;
import br.com.murillo.cinefetch.domain.models.Movie;
import br.com.murillo.cinefetch.domain.models.Search;
import br.com.murillo.cinefetch.domain.models.SearchResponse;

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

  @Override
  public List<Search> findListMovieByName(String movieName, String apikey) {

    WebClient webClient = webClientBuilder.baseUrl(URL_API).build();

    try {
      SearchResponse searchResponse = webClient.get()
          .uri(uriBuilder -> uriBuilder
              .queryParam("apikey", apikey)
              .queryParam("s", movieName)
              .build())
          .retrieve()
          .bodyToMono(SearchResponse.class)
          .block();

      System.out.println(searchResponse);

      List<Search> lista = searchResponse != null && searchResponse.getSearch() != null
          ? searchResponse.getSearch()
          : List.of();

      return lista;

    } catch (Exception e) {
      e.printStackTrace();
      throw new InternalError("Falha ao listar os filmes: " + e.getMessage());
    }
  }

  @Override
  public Movie findMovieById(String idMovie, String apikey) {

    WebClient webClient = webClientBuilder.baseUrl(URL_API).build();

    return webClient.get()
        .uri(uriBuilder -> uriBuilder
            .queryParam("apikey", apikey)
            .queryParam("i", idMovie)
            .build())
        .retrieve()
        .bodyToMono(Movie.class)
        .block();

  }

}
