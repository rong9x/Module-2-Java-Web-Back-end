package com.codegym.model;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    @Size(min = 4, max = 4)
    private String productCode;

    @NotEmpty
    @Size(min = 5, max = 45)
    private String productName;

    @NotNull
    @Min(0)
    private double price;

    public Product() {
    }

    public Product(@NotEmpty @Size(min = 4, max = 4) String productCode, @NotEmpty @Size(min = 5, max = 45) String productName, @NotEmpty @Min(0) double price) {
        this.productCode = productCode;
        this.productName = productName;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
