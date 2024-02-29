package br.com.mrickk.smvideo.api;

import br.com.mrickk.smvideo.api.model.DadosEpisodio;
import br.com.mrickk.smvideo.api.model.DadosSerie;
import br.com.mrickk.smvideo.api.service.ConsumoApi;
import br.com.mrickk.smvideo.api.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SeriesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SeriesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("http://www.omdbapi.com/?t=Breaking+Bad&apikey=e703c90b");
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();

		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);

		json = consumoApi.obterDados("http://www.omdbapi.com/?t=Breaking+Bad&season=1&episode=2&apikey=e703c90b");

		DadosEpisodio dadosEpisodio = conversor.obterDados(json, DadosEpisodio.class);
		System.out.println(dadosEpisodio);
	}
}
