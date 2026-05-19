package alutsiv.second_java_project_spring.product.support;

import alutsiv.second_java_project_spring.product.api.request.UpdateProductRequest;
import org.springframework.stereotype.Component;
import alutsiv.second_java_project_spring.product.api.request.ProductRequest;
import alutsiv.second_java_project_spring.product.api.response.ProductResponse;
import alutsiv.second_java_project_spring.product.domain.Product;

@Component
public class ProductMapper {

    public Product toProduct(ProductRequest productRequest) {
        return new Product(productRequest.getName());
    }

    public Product toProduct(Product product, UpdateProductRequest updateProductRequest) {
        product.setName(updateProductRequest.getName());
        return product;
    }

    public ProductResponse toProductResponse(Product product) {
        return new ProductResponse(product.getId(),  product.getName());
    }
}
