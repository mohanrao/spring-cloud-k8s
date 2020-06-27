package dev.mohanrao.address.svc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
public class AddressServiceApplication {

	@PostConstruct
	public void init(){
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));   // It will set UTC timezone
	}

	public static void main(String[] args) {
		SpringApplication.run(dev.mohanrao.address.svc.AddressServiceApplication.class, args);
	}

}
