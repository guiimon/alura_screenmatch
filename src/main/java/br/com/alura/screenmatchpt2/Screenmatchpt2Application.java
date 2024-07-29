package br.com.alura.screenmatchpt2;

import br.com.alura.screenmatchpt2.model.DadosSerie;
import br.com.alura.screenmatchpt2.services.ConsumoApi;
import br.com.alura.screenmatchpt2.services.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Screenmatchpt2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Screenmatchpt2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoApi();
		var json  = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&Season=1&apikey=4bd49ead");
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);
	}
}
