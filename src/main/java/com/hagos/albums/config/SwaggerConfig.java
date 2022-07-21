package com.hagos.albums.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI xmlOpenApi() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Rate That Album!")
                                .version("1.0.0"))
                .externalDocs(
                        new ExternalDocumentation()
                                .description("Github Repository")
                                .url("https://github.com/dawhagos/album-demo")
                );
    }
}
