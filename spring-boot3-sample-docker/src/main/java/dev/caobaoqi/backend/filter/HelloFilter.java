package dev.caobaoqi.backend.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;


@Slf4j
public class HelloFilter extends HttpFilter {
	@Override
	protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
		log.info("---------------------------> HelloFilter [doFilter] <---------------------------");
		log.info("the request is [{}] | status [{}] ", request.getRequestURI(), response.getStatus());
		super.doFilter(request, response, chain);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		log.info("---------------------------> HelloFilter [init] <---------------------------");
		super.init(filterConfig);
	}

	@Override
	public void destroy() {
		log.info("---------------------------> HelloFilter [destroy] <---------------------------");
		super.destroy();
	}
}
