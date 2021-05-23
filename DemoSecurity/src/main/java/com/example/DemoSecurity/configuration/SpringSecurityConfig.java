package com.example.DemoSecurity.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		// super.configure(auth);

		auth.inMemoryAuthentication().withUser("tripti").password("tripti").roles("ADMIN");
		auth.inMemoryAuthentication().withUser("mridul").password("mridul").roles("USER");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		// super.configure(http);

		http.csrf().disable();
		http.authorizeRequests().anyRequest().fullyAuthenticated().and().httpBasic();

	}

	/*
	 * @Override protected void configure(HttpSecurity http) throws Exception { //
	 * TODO Auto-generated method stub //super.configure(http);
	 * 
	 * http.csrf().disable();
	 * http.authorizeRequests().antMatchers("/basicAuth/**").fullyAuthenticated().
	 * and().httpBasic();
	 * 
	 * 
	 * }
	 */

	/*
	 * @Override protected void configure(HttpSecurity http) throws Exception { //
	 * TODO Auto-generated method stub //super.configure(http);
	 * 
	 * http.csrf().disable();
	 * http.authorizeRequests().antMatchers("/basicAuth/**").hasAnyRole("ADMIN").
	 * anyRequest().fullyAuthenticated().and().httpBasic();
	 * 
	 * 
	 * }
	 */

	@Bean
	public static NoOpPasswordEncoder passwordEncoder() {

		return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
	}
}
