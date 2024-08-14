package com.leonardo.servicoDeSuporte;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.leonardo.servicoDeSuporte.domain.Chamado;
import com.leonardo.servicoDeSuporte.domain.Cliente;
import com.leonardo.servicoDeSuporte.domain.Tecnico;
import com.leonardo.servicoDeSuporte.domain.enums.Perfil;
import com.leonardo.servicoDeSuporte.domain.enums.Prioridade;
import com.leonardo.servicoDeSuporte.domain.enums.Status;
import com.leonardo.servicoDeSuporte.repositories.ChamadoRepository;
import com.leonardo.servicoDeSuporte.repositories.ClienteRepository;
import com.leonardo.servicoDeSuporte.repositories.TecnicoRepository;

@SpringBootApplication
public class ServicoDeSuporteApplication implements CommandLineRunner {

	@Autowired
	private TecnicoRepository tecnicoRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private ChamadoRepository chamadoRepository;

	public static void main(String[] args) {
		SpringApplication.run(ServicoDeSuporteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Tecnico tec1 = new Tecnico(null, "Leonardo Miranda", "63643230268", "leo@gmil.com", "123");
		tec1.addPerfil(Perfil.ADMIN);

		Cliente cli1 = new Cliente(null, "Linux Java", "044.281.070-99", "java@gmai.com", "123");

		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamdo", tec1, cli1);

		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));

	}

}
