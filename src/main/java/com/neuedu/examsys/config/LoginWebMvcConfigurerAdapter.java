package com.neuedu.examsys.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 拦截器配置类
 * @author jjd
 * @since 2019/7/29
 */
@Configuration
public class LoginWebMvcConfigurerAdapter implements WebMvcConfigurer {

	//无法排除login页
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
//		registry.addInterceptor(new LoginInterceptor())
//		.excludePathPatterns("/exsys/login_test.html", "/exsys/img/**", "/exsys/css/**")
//		.addPathPatterns("/**");
//		//.excludePathPatterns("**/login")	
		WebMvcConfigurer.super.addInterceptors(registry);
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//		registry.addResourceHandler("/js/**").addResourceLocations("classpath:/js/");
//		registry.addResourceHandler("/css/**").addResourceLocations("classpath:/css/");
		WebMvcConfigurer.super.addResourceHandlers(registry);
	}
	
}
