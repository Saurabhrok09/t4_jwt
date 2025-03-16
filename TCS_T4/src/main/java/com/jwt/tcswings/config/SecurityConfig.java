package com.jwt.tcswings.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

//@Configuration
//@EnableWebSecurity
public class SecurityConfig {
	 @Bean
	    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

//	        http.csrf(csrf -> csrf.disable())
//	                .authorizeRequests().
//	                requestMatchers("/test").authenticated().requestMatchers("/auth/login").permitAll()
//	                .anyRequest()
//	                .authenticated()
//	                .and().exceptionHandling(ex -> ex.authenticationEntryPoint(point))
//	                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
//	        http.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);
//	        return http.build();
		 return null;
	    }

}
