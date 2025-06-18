package dev.caobaoqi.backend.config;

import dev.caobaoqi.backend.filter.HelloFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
class WebMvcConfiguration implements WebMvcConfigurer {


	@Bean
	FilterRegistrationBean<HelloFilter> helloFilter() {
		FilterRegistrationBean<HelloFilter> registration = new FilterRegistrationBean<>();
		registration.setFilter(new HelloFilter());
		registration.addUrlPatterns("/*");
		return registration;
	}

}
