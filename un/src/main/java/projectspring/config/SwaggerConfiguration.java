package projectspring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
    
    @Bean
    public Docket maDocumentationDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
            .apiInfo(new ApiInfoBuilder()
                .title("Premiere app Spring")
                .description("C'est la premiere appli")
                .license("CC 2.0")
                .version("0.0.1")
                .build())
            .groupName("REST API v0.0.1")
            .select()
            .apis(RequestHandlerSelectors.basePackage("projectspring"))
            .paths(PathSelectors.any())
            .build();
    }


}
