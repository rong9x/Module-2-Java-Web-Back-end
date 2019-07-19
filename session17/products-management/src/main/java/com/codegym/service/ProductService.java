package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService {

    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Iphone", "Smartphone", 100));
        products.put(2, new Product(2, "Ipad", "Tablet", 300));
        products.put(3, new Product(3, "Samsung", "Smartphone", 80));
        products.put(4, new Product(4, "HTCOne", "Smartphone", 60));
        products.put(5, new Product(5, "HuaweiI9", "Smartphone", 99));
    }

    @Override
    public List<Product> getAllProducts() {
        return new ArrayList<>(products.values());
    }

    @Override
    public Product getProductById(int id) {
        return products.get(id);
    }

    @Override
    public void saveProduct(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public void updateProduct(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void deleteProduct(int id) {
        products.remove(id);
    }
}
