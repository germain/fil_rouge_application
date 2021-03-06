package fr.dta.mediatheque;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan
@PropertySource("classpath:application.properties")
public class App {
	
	public App() {
		System.out.println("-------------Bonjour------------");
	}
	
//	@Override
//	public void configureViewResolvers(ViewResolverRegistry registry) {
//
//		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//		viewResolver.setViewClass(JstlView.class);
//		viewResolver.setPrefix("/");
//		viewResolver.setSuffix("");
//		viewResolver.setExposeContextBeansAsAttributes(true);
//		registry.viewResolver(viewResolver);
//	}
//	
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/assets/**").addResourceLocations("/assets/");
//    }
}