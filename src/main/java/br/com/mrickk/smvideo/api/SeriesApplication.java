package br.com.mrickk.smvideo.api;

import br.com.mrickk.smvideo.api.principal.Principal;
import br.com.mrickk.smvideo.api.repository.SeriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SeriesApplication implements CommandLineRunner {


	@Autowired
	private SeriesRepository repository;

	public static void main(String[] args) {

		SpringApplication.run(SeriesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repository);
		principal.exibeMenu();
	}
}
