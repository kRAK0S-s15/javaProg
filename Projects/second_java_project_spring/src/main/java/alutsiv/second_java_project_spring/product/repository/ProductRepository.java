package alutsiv.second_java_project_spring.product.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import alutsiv.second_java_project_spring.product.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {}
