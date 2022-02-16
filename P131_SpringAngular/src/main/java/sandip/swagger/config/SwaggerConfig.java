package sandip.swagger.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Profile({"default","qa"})
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket createDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("sandip"))
				.paths(PathSelectors.ant("/rest/**"))
				.build()
				.apiInfo(apiInfo())
				;
	}

	private ApiInfo apiInfo() {
		return new ApiInfo(
				"EMPLOYEE APP BY AMRUTA", 
				"SAMPLE", 
				"3.2GA", 
				"http://simoninfotech.com", 
				new Contact("AMRUTA", "http://simoninfotech.com", "amruta.pawar@marlabs.com"), 
				"9008647076", "http://simoninfotech.com",
				Collections.emptyList());
	}
}
