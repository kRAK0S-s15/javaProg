package alutsiv.second_java_project_spring.product.api.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateProductRequest {

    private final Long id;
    private final String name;

    @JsonCreator
    public UpdateProductRequest(
            @JsonProperty("id") Long id,
            @JsonProperty("name") String name
    ) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}