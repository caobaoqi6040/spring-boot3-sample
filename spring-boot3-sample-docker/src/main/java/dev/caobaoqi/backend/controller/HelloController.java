package dev.caobaoqi.backend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/hellos")
public class HelloController {


	/**
	 * GET <a href="http://localhost:8080/api/v1/hellos/say-hello?name=Miss+Rogelio+Wilderman">...</a>
	 *
	 * @param name username
	 * @return hello username
	 */
	@GetMapping("/say-hello")
	public ResponseEntity<String> sayHello(@RequestParam(defaultValue = "mcdd") String name) {
		return ResponseEntity.ok(String.format("Hello, %s!", name));
	}

}
