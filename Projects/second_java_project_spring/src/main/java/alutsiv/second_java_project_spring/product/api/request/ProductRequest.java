package alutsiv.second_java_project_spring.product.api.request;

import com.fasterxml.jackson.annotation.JsonCreator;

public class ProductRequest {

    private final String name;

    @JsonCreator
    public ProductRequest(String name) {this.name = name;}
    public String getName() {return name;}
}
