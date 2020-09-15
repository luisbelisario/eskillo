package com.eskillo.eskillo;

import java.util.Calendar;

import com.eskillo.eskillo.model.Experiencia;
import com.eskillo.eskillo.model.Perfil;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EskilloApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EskilloApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Perfil perfilLuis = new Perfil();
		perfilLuis.setId(1l);
		perfilLuis.setNome("Luis");
		perfilLuis.setCargoAtual("Estudante");
		perfilLuis.setEmail("luis@gmail.com");

		Experiencia experiencia1 = new Experiencia();
		experiencia1.setId(1l);
		experiencia1.setCargo("Auxiliar");
		experiencia1.setNomeEmpresa("iCev");
		experiencia1.setDataInicio(Calendar.getInstance().getTime());
		experiencia1.setDataFim(null);
		experiencia1.setOcupacaoAtual(true);

		perfilLuis.getExperiencias().add(experiencia1);

		System.out.println(perfilLuis.toString());
	}
}
