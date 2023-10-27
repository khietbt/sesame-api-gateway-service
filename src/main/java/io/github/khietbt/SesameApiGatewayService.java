package io.github.khietbt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;

@SpringBootApplication
@EnableWebFluxSecurity
public class SesameApiGatewayService {

    public static void main(String[] args) {
        SpringApplication.run(SesameApiGatewayService.class, args);
    }
}