package alutsiv.second_java_project_spring;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Products API for Alutsiv", version = "1.0",
        description = "Products Information"))
public class SecondJavaProjectSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecondJavaProjectSpringApplication.class, args);
        System.out.println("http://localhost:8080/swagger-ui/index.html");
        System.out.println("http://localhost:8080/console");
    }

}