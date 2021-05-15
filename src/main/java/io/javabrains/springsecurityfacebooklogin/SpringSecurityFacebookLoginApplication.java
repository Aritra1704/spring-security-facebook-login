package io.javabrains.springsecurityfacebooklogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableOAuth2Sso
@EnableAuthorizationServer
//@EnableAutoConfiguration
public class SpringSecurityFacebookLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityFacebookLoginApplication.class, args);
	}

}
