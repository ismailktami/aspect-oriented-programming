package org.aop.implementation.aopimplementation;

import org.aop.implementation.aopimplementation.entities.Personne;
import org.aop.implementation.aopimplementation.entities.PersonneRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)

public class AopImplementationApplication {

	public static void main(String[] args) {

		SpringApplication.run(AopImplementationApplication.class, args);

	}

	@Bean
	CommandLineRunner start(PersonneRepository personneRepository){
		return  args -> personneRepository.save(new Personne("ktami","ismail",22));
	}



}
