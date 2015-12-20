package br.com.cinq.greet.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import br.com.cinq.greet.Application;
import br.com.cinq.greet.message.Greeting;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=Application.class)
@WebIntegrationTest(randomPort = true)
public class EndpointTest {
	
	@Value("${local.server.port}")
	private int port;

	private RestTemplate restTemplate = new TestRestTemplate();
	
	
	
	@Test
	public void validarGet(){
		Greeting greeting = restTemplate.getForObject("http://localhost:8080/greeting", Greeting.class);
		System.out.println(port);
		
	}
	

}
