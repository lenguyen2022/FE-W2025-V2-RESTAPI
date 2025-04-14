package ca.sheridancollege.lenguyen.productapi.beans;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity(name="Product")
@Data
@NoArgsConstructor
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Long id;
    @Column(name="PRODUCT_NAME")
    private String productName;
    @Column(name="PRICE")
    private Double price;
    @Column(name="QUANTITY")
    private Integer quantity;
}
