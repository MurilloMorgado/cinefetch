package br.com.murillo.cinefetch.framework.webClientConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {
  
  @Bean
  public WebClient.Builder webClintBuilder(){
    return WebClient.builder();
  }


}