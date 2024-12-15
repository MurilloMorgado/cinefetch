package br.com.murillo.cinefetch.domain.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Movie {

  @JsonProperty("Title")
  private String title;

  @JsonProperty("Year")
  private String year;

  @JsonProperty("Released")
  private String released;

  @JsonProperty("Runtime")
  private String runTime;
  
  @JsonProperty("Genre")
  private String genre;
  
  @JsonProperty("Director")
  private String director;
  
  @JsonProperty("Writer")
  private String writer;
  
  @JsonProperty("Actors")
  private String actors;
  
  @JsonProperty("Plot")
  private String plot;
  
  @JsonProperty("Language")
  private String language;
  
  @JsonProperty("Country")
  private String country;
  
  @JsonProperty("Poster")
  private String poster;

  public Movie() {

  }

  public Movie(String title, String year, String released, String runTime, String genre, String director, String writer,
      String actors, String plot, String language, String country, String poster) {
    this.title = title;
    this.year = year;
    this.released = released;
    this.runTime = runTime;
    this.genre = genre;
    this.director = director;
    this.writer = writer;
    this.actors = actors;
    this.plot = plot;
    this.language = language;
    this.country = country;
    this.poster = poster;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }

  public String getReleased() {
    return released;
  }

  public void setReleased(String released) {
    this.released = released;
  }

  public String getRunTime() {
    return runTime;
  }

  public void setRunTime(String runTime) {
    this.runTime = runTime;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public String getDirector() {
    return director;
  }

  public void setDirector(String director) {
    this.director = director;
  }

  public String getWriter() {
    return writer;
  }

  public void setWriter(String writer) {
    this.writer = writer;
  }

  public String getActors() {
    return actors;
  }

  public void setActors(String actors) {
    this.actors = actors;
  }

  public String getPlot() {
    return plot;
  }

  public void setPlot(String plot) {
    this.plot = plot;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getPoster() {
    return poster;
  }

  public void setPoster(String poster) {
    this.poster = poster;
  }

}
