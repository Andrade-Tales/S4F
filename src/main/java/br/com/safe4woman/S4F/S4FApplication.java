package br.com.safe4woman.S4F;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*
@SpringBootApplication é uma anotação de conveniência que contém as seguintes anotações do Spring:
@Configuration, @EnableAutoConfiguration e @ComponentScan. Essas duas últimas, basicamente, dizem ao
inicializador do Spring: Busque e instancie todo bean anotado deste pacote para frente.
*/

 

@SpringBootApplication
public class S4FApplication {

	public static void main(String[] args) {
		SpringApplication.run(S4FApplication.class, args);
	}

}
