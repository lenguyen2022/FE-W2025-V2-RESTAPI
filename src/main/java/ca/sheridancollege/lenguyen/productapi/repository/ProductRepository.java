package ca.sheridancollege.lenguyen.productapi.repository;

import ca.sheridancollege.lenguyen.productapi.beans.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    public Product findProductById(Long id);
}
