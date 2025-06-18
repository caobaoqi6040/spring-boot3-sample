package dev.caobaoqi.backend;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@Slf4j
@SpringBootApplication
public class SpringBoot3SampleDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot3SampleDockerApplication.class, args);
	}


	@EventListener
	public void handleApplicationReadyEvent(ApplicationReadyEvent event) {
		log.info("handleApplicationReadyEvent | context = {}", event.getApplicationContext());
	}

}
