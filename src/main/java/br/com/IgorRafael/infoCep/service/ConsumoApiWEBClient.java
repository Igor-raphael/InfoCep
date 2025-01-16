package br.com.IgorRafael.infoCep.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import br.com.IgorRafael.infoCep.model.InformacoesCep;
import reactor.core.publisher.Mono;

@Service
public class ConsumoApiWEBClient {
	
	
	private final WebClient webClient;
	
	@Autowired
	public ConsumoApiWEBClient(WebClient.Builder webClientBuilder) {
		this.webClient = webClientBuilder.baseUrl("https://viacep.com.br/ws/{cep}/json/").build();
	}
	
	public Mono<InformacoesCep> dadosApi(String cep){
		Mono<InformacoesCep> response = webClient.get()
				                        .uri(UriBuilder -> UriBuilder.build(cep))
				                        .retrieve()
				                        .bodyToMono(InformacoesCep.class);
		return response;
	}
	
	

}
