package com.security.webSecurity;

import com.security.webSecurity.auth.AuthenticationService;
import com.security.webSecurity.auth.RegisterRequest;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static com.security.webSecurity.user.Role.ADMIN;
import static com.security.webSecurity.user.Role.MANAGER;

@SpringBootApplication
public class WebSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebSecurityApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AuthenticationService authenticationService){
		return args -> {
			var admin = RegisterRequest.builder()
					.firstname("admin")
					.lastname("admin")
					.email("admin@gmail.com")
					.password("admin")
					.role(ADMIN)
					.build();
			System.out.println("ADMIN TOKEN : " + authenticationService.register(admin).getToken());

			var manager = RegisterRequest.builder()
					.firstname("manager")
					.lastname("manager")
					.email("manager@gmail.com")
					.password("manager")
					.role(MANAGER)
					.build();
			System.out.println("MANAGER TOKEN : " + authenticationService.register(manager).getToken());
		};
	}

}
