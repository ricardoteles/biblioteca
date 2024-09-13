package com.ricardo.biblioteca.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public GroupedOpenApi bibliotecaApi(){
        return GroupedOpenApi.builder()
                .group("public")
                .packagesToScan("com.ricardo.biblioteca")
                .build();
    }

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Biblioteca API")
                        .description("Esse projeto foi desenvolvido afim de estudar boas práticas de construção de API.")
                        .version("v1.0"));
    }
}
