package ca.sheridancollege.lenguyen.productapi.controllers;

import ca.sheridancollege.lenguyen.productapi.beans.Product;
import ca.sheridancollege.lenguyen.productapi.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/products")
public class ProductController {
    private ProductRepository repo;
    public ProductController(ProductRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Product> getProductList(){
        return repo.findAll();
    }
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id){
        return repo.findProductById(id);
    }



}
