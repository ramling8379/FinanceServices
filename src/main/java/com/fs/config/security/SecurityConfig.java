package com.fs.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.fs.filter.JwtRequestFilter;
import com.fs.services.base.FSUserLoginDetailsService;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	FSUserLoginDetailsService userDetailService;

	@Autowired
	JwtRequestFilter jwtRequestFilter;

	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
		authProvider.setUserDetailsService(userDetailService);
		return authProvider;
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.userDetailsService(userDetailService);
		auth.authenticationProvider(authenticationProvider());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		/*
		 * http.csrf().disable().authorizeRequests()
		 * .antMatchers("/firm/**").hasAuthority("Master")
		 * .antMatchers("/user/**").hasAnyAuthority("Master", "Administrator")
		 * .antMatchers("/login/authenticate").permitAll() //
		 * .antMatchers("/appResetPassword/sendOTP/*").permitAll() //
		 * .antMatchers("/appResetPassword/resetPassword/").permitAll()
		 * .anyRequest().authenticated()
		 * .and().exceptionHandling().accessDeniedPage("/403")
		 * .and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.ALWAYS
		 * ); http.addFilterBefore(jwtRequestFilter,
		 * UsernamePasswordAuthenticationFilter.class);
		 */

		/* http.csrf().disable().authorizeRequests()
         .antMatchers("/login/authenticate").permitAll()
         .antMatchers("/user/**").hasAnyAuthority("Master", "Administrator")
		 .antMatchers("/firm/*").hasAuthority("Master")
         .anyRequest().authenticated()
         .and()
         .exceptionHandling().accessDeniedPage("/403")
         .and()
         .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.ALWAYS);
		 http.addFilterBefore(jwtRequestFilter,UsernamePasswordAuthenticationFilter.class);*/

		http
				.csrf().disable()
				.authorizeRequests()
				.antMatchers(HttpMethod.OPTIONS).permitAll()
				.antMatchers("/login/authenticate").permitAll()
				.antMatchers("/login/logout").permitAll()
				.anyRequest(). authenticated()
				.and()
				.sessionManagement()
				.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		http.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);
	}

	@Override
	@Bean
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}

	@Bean
	public PasswordEncoder getPasswordEncoder(){
		return NoOpPasswordEncoder.getInstance();
	}
}