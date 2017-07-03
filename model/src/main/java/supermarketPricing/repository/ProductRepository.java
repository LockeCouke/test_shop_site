package supermarketPricing.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import supermarketPricing.data.products.Product;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> getProductById(Long id);
}
