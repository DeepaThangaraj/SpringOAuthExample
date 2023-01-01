package com.apispring.websecurity;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;



public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity https) throws Exception
	{
		https.authorizeRequests()
        .anyRequest().authenticated()
        .and().oauth2Login();
	}
}
