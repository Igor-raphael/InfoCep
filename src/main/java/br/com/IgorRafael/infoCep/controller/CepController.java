package br.com.IgorRafael.infoCep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.IgorRafael.infoCep.model.InformacoesCep;
import br.com.IgorRafael.infoCep.service.ConsumoApiWEBClient;
import reactor.core.publisher.Mono;

@Controller
public class CepController {
	
	@Autowired
	ConsumoApiWEBClient consumoApiWEBClient;
	
	
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	
	@PostMapping("/buscarCep")
	public String InfoCep(@RequestParam("cep") String cep, Model model)  {
		Mono<InformacoesCep> resultado = consumoApiWEBClient.dadosApi(cep);
		
		InformacoesCep informacoesCep = resultado.block();
		
		
		model.addAttribute("cep", cep);
		model.addAttribute("resultado", informacoesCep);
		
		return "resultadoCep";
		   
	}

	
}
