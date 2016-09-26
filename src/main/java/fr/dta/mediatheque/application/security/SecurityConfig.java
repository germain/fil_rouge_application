package fr.dta.mediatheque.application.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true, proxyTargetClass = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	  @Autowired AuthenticationService authenticationService;
	 
	  @Override
	  protected void configure(HttpSecurity http) throws Exception {
		   http
	       .sessionManagement()
	       .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
	       .and()
	       .authorizeRequests()
	       .antMatchers("/api/public/**")
	       .permitAll()
	       .anyRequest()
	       .authenticated()
	       .and()
	       .httpBasic()
	       .and()
	       .csrf()
	       .disable();

	  }
	 
	  @Autowired
	  public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
	       auth.userDetailsService(authenticationService);
	  }
	}


