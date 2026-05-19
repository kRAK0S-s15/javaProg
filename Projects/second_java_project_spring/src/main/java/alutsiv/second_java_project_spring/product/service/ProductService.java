package alutsiv.second_java_project_spring.product.service;

import alutsiv.second_java_project_spring.product.api.request.UpdateProductRequest;
import alutsiv.second_java_project_spring.product.support.ProductExceptionSupplier;
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

    public ProductResponse find(Long id) {
        Product product = productRepository.findById(id).orElseThrow(ProductExceptionSupplier.productNotFound(id));
        return productMapper.toProductResponse(product);
        }

    public ProductResponse update(Long id, UpdateProductRequest updateProductRequest) {
        Product product = productRepository.findById(id).orElseThrow(
                ProductExceptionSupplier.productNotFound(id));
        productRepository.save(productMapper.toProduct(product, updateProductRequest));
        return productMapper.toProductResponse(product);
    }
}
