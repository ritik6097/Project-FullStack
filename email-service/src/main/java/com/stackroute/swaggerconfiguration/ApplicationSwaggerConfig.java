package com.stackroute.swaggerconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class ApplicationSwaggerConfig {
	
	@Bean
	public Docket api() {
	
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.stackroute"))
                .paths(regex("/login.*"))
                .build()
				.apiInfo(metaInfo());
	

}

	private ApiInfo metaInfo() {
		
		return new ApiInfo("WALLETBOOSTER_EMAILSERVICE API",
				"Spring Boot API FOR WalletBooster",
				"Walletbooster 1.0v","Terms of service",
				new Contact("PUSHPENDRA-DEV","www.walletbooster.com",
				"PUSHPENDRAKADWA2018@GMAIL.COM"), "Apache2.0", "https://apache.org/");
		
	}
}

           