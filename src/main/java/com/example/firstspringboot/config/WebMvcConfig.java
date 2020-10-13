package com.example.firstspringboot.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.firstspringboot.Interceptor.LoginInterceptor;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// check user has login
		String[] listPath = {"/login","/doLogin","/register","/asset/**","/usersApiCheck/**","/doRegist"};
		List<String> excludeLoginPath = Arrays.asList(listPath);
		registry.addInterceptor(new LoginInterceptor()).excludePathPatterns(excludeLoginPath);
	}
	
}
