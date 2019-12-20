package io.musicStreaming.Configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class Security extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private DataSource dataSource;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/admin").hasRole(Role.admin)
			.antMatchers("/user").hasAnyRole(Role.admin, Role.user)
			.antMatchers("/").permitAll()
			.and().formLogin();
	}
	
	@Override
	public void configure(AuthenticationManagerBuilder authentication) {
		try {authentication.jdbcAuthentication()
			.dataSource(dataSource)
			.withUser(
				User.withUsername("uesr")
					.password("password")
					.roles(Role.user)
			)
			.withUser(
				User.withUsername("admin")
					.password("admin")
					.roles(Role.admin)
			);
		}
		catch (Exception e) {/*TODO: log it*/ e.printStackTrace();}
	}

	@Bean
	public PasswordEncoder getPasswordEncoder() {return NoOpPasswordEncoder.getInstance();}
}
