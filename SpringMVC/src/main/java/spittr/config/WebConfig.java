package spittr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan({ "spittr.web" })
public class WebConfig extends WebMvcConfigurerAdapter {
/*	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**")
                        .addResourceLocations("/resources/");
	}*/
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		System.out.println("================================================");
		InternalResourceViewResolver viewResolver 
                         = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/view/");
		//viewResolver.setPrefix("/templates/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	
	/*
	 By calling enable() on the given DefaultServletHandlerConfigurer,
	  you’re asking DispatcherServlet to forward requests for static resources to the servlet container’s default servlet and not to try to handle them itself. 
	 */
 @Override
 public void configureDefaultServletHandling(DefaultServletHandlerConfigurer config)
 {
	 config.enable();
 }
}
