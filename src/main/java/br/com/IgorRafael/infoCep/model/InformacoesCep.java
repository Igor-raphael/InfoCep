package br.com.IgorRafael.infoCep.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class InformacoesCep {
	
	private String cep;
	private String logradouro;
	private String complemento; 
	private String unidade; 
	private String bairro;
	private String localidade; 
	private String uf;
	private String ibge;
	private String dia;
	private String ddd;
	private String siafi;
	

	public String getCep() {
		return cep;
	}


	public String getLogradouro() {
		return logradouro;
	}



	public String getComplemento() {
		return complemento;
	}


	public String getUnidade() {
		return unidade;
	}



	public String getBairro() {
		return bairro;
	}


	public String getLocalidade() {
		return localidade;
	}

	public String getUf() {
		return uf;
	}


	public String getIbge() {
		return ibge;
	}



	public String getDia() {
		return dia;
	}

	public String getDdd() {
		return ddd;
	}


	public String getSiafi() {
		return siafi;
	}

}
