package br.com.IgorRafael.infoCep.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.reactive.function.client.WebClientResponseException;

@RestControllerAdvice
public class GeneralExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	private ResponseEntity<Object> handleGeneralException(Exception ex){
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro interno do servidor!!");
	} 
	
	@ExceptionHandler(WebClientResponseException.class)
	private ResponseEntity<Object> handleWebClientResponse(WebClientResponseException e){
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Verifique as informações inseridas!!\nSó é aceito números com no máximo 8 dígitos podendo ter ou não o hífen [-].");
	}

}
