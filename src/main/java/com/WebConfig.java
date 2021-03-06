package com;

import org.springframework.web.servlet.config.annotation.*;
import org.springframework.context.annotation.*;

@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**");
	}
}
