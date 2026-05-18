package alutsiv.second_java_project_spring.product.service;

import org.springframework.stereotype.Service;
import alutsiv.second_java_project_spring.product.api.request.ProductRequest;
import alutsiv.second_java_project_spring.product.api.response.ProductResponse;
import alutsiv.second_java_project_spring.product.domain.Product;
import alutsiv.second_java_project_spring.product.repository.ProductRepository;
import alutsiv.second_java_project_spring.product.support.ProductMapper;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductService(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    public ProductResponse create(ProductRequest productRequest) {
        Product product = productRepository.save(productMapper.toProduct(productRequest));
        return productMapper.toProductResponse(product);
    }
}
