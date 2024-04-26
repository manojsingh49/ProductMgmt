package productManagementSystem;

import java.util.List;

public interface ProductDAO {
    void addProduct(Products products);
    List<Products>getAllProducts();
    Products getProductById(int productId);
}