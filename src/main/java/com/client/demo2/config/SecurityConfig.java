package com.client.demo2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class SecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChaintest(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(authz -> authz.anyRequest().authenticated())
				.oauth2Login(oauth2 -> oauth2.defaultSuccessUrl("/healthcheck", false) // Redirect to home on successful login
				).csrf(csrf-> csrf.disable());
		return http.build();
	}
	

}
