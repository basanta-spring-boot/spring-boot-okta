package com.javatechie.springsecurityoauthsso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
@EnableOAuth2Sso
public class SpringSecurityOauthSsoApplication extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .antMatcher("/**")
                .authorizeRequests()
                .antMatchers("/", "/login**", "/callback/", "/webjars/**", "/error**")
                .permitAll()
                .anyRequest()
                .authenticated();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityOauthSsoApplication.class, args);
    }

}
