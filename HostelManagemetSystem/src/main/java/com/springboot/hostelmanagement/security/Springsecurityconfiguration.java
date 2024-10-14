package com.springboot.hostelmanagement.security;

import java.util.function.Function;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class Springsecurityconfiguration {

	@Bean
	public InMemoryUserDetailsManager createuserdetailsmanager() {
		
		UserDetails userdetails1 = createnewuser("tusharmall", "dummy1");
		UserDetails userdetails2 = createnewuser("Tusharrr", "tushar");
		UserDetails userdetails3 = createnewuser("tushar", "tushar");
		return new InMemoryUserDetailsManager(userdetails1,userdetails3,userdetails2 );
	}
	
	private UserDetails createnewuser(String username, String password) {
		Function<String, String> PasswordEncoder
		=input -> passwordEncoder().encode(input);
		
		UserDetails userdetails=User.builder()
				.passwordEncoder(PasswordEncoder)
				.username(username)
				.password(password)
				.roles("USER","ADMIN")
				.build();
		return userdetails;
	}
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public SecurityFilterChain filterchain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(
				auth->auth.anyRequest().authenticated()
				);
		http.formLogin(withDefaults());
		http.csrf().disable();
		http.headers().frameOptions().disable();
		return http.build();
	}
}
