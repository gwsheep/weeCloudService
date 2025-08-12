package com.jproject.weeCloudService.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableMethodSecurity
public class SecurityConfig {

    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http.
            authorizeHttpRequests(auth ->
                    auth.requestMatchers("/admin/**").hasRole("ADMIN")
                        .requestMatchers("/cloud/**").hasAnyRole("ADIMN","USERS")
                            .anyRequest().authenticated()
            );

        return http.build();

    }


}
