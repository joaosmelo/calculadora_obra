package com.obra.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.*;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI api() {
        return new OpenAPI().info(
            new Info().title("API Obra")
                      .description("API padrão obra com DTO e resposta estruturada")
                      .version("1.0")
        );
    }
}
