package br.com.murillo.cinefetch.domain.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchResponse {
  
  @JsonProperty("Search")
  private List<Search> search;

  @JsonProperty("totalResults")
  private String totalResults;

  @JsonProperty("Response")
  private String response;

  public SearchResponse() {
  }

  public SearchResponse(List<Search> search, String totalResults, String response) {
    this.search = search;
    this.totalResults = totalResults;
    this.response = response;
  }

  public List<Search> getSearch() {
    return search;
  }

  public void setSearch(List<Search> search) {
    this.search = search;
  }

  public String getTotalResults() {
    return totalResults;
  }

  public void setTotalResults(String totalResults) {
    this.totalResults = totalResults;
  }

  public String getResponse() {
    return response;
  }

  public void setResponse(String response) {
    this.response = response;
  }
  
  
}
