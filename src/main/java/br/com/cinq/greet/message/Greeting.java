package br.com.cinq.greet.message;

import org.springframework.stereotype.Service;

@Service
public class Greeting {
	private String message = "Hello World";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}