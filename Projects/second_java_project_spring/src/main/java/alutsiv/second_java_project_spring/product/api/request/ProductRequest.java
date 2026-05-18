package alutsiv.second_java_project_spring.product.api.request;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ProductRequest {

    private final String name;

    public ProductRequest(String name) {this.name = name;}
    public String getName() {return name;}
}
