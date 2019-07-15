package com.test.LearningBoot;

import java.net.URI;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableSwagger2
public class LearningBootApplication   {
	/*
	 * private final static String ACCOUNT_SID =
	 * "ACa7339931cfbc91f2f467ebda622150f3"; private final static String AUTH_ID =
	 * "b1e8585e1ad3e0ac2499267818a632d1";
	 * 
	 * static { Twilio.init(ACCOUNT_SID, AUTH_ID); }
	 */
	public static void main(String[] args) {
		SpringApplication.run(LearningBootApplication.class, args);
	}
	

//	@Override
//	public void run(ApplicationArguments args) throws Exception {
//		// TODO Auto-generated method stub
//		 Message.creator(new PhoneNumber("+918410533693"), new PhoneNumber("+19382009846"),
//		         "Message from Spring Boot Application Create by Shubham").create();
//	}
//	 @Override
//	   public void run(ApplicationArguments arg0) throws Exception {
//	      Call.creator(new PhoneNumber("+918410533693"), new PhoneNumber("+19382009846"),
//	         new URI("http://demo.twilio.com/docs/voice.xml")).create();
//	   }
//	
//	 @Bean
//	   public Docket productApi() {
//	      return new Docket(DocumentationType.SWAGGER_2).select()
//	         .apis(RequestHandlerSelectors.basePackage("com.test.LearningBoot.swaggerdemo")).build();
//	   }
	/*
	 * @Bean public RestTemplate getResttemp() { return new RestTemplate(); }
	 */
	/*
	 * @SuppressWarnings("deprecation")
	 * 
	 * @Bean public WebMvcConfigurer corsConfigurer() { return new
	 * WebMvcConfigurerAdapter() {
	 * 
	 * @Override public void addCorsMappings(CorsRegistry registry) {
	 * registry.addMapping("/products").allowedOrigins("http://localhost:8080"); }
	 * }; }
	 */
	
}
