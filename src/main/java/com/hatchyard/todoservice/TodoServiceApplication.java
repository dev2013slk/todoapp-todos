package com.hatchyard.todoservice;

import com.hatchyard.todoservice.common.config.YAMLConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class TodoServiceApplication {


    @Autowired
    private YAMLConfig myConfig;

    public static void main(String[] args) {
        SpringApplication.run(TodoServiceApplication.class, args);
    }

   /* @Bean
    public Docket swaggerPersonApi10() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("person-api-1.0")
                .select()
                .apis(RequestHandlerSelectors.basePackage("pl.piomin.services.versioning.controller"))
                .paths(regex("/api/v1.0.*"))
                .build()
                .apiInfo(new ApiInfoBuilder().version("1.0").title("TODO API").description("Documentation TODO API v1.0").build());
    }*/

    public void run(String... args) throws Exception {
        System.out.println("name: " + myConfig.getVersion());
        System.out.println("servers: " + myConfig.getDescription());
    }
}
