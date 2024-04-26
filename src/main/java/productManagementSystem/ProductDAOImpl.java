package productManagementSystem;


import java.util.ArrayList;
import java.util.List;

class ProductDAOImpl implements ProductDAO {
    private List<Products>products = new ArrayList<>();


    @Override
    public void addProduct(Products productDetails) {
        this.products.add(productDetails);

    }

    @Override
    public List<Products> getAllProducts() {
        return products;
    }

    @Override
    public Products getProductById(int productId) {
        for(Products productDetails1: products){
            if(productDetails1.getProductId() == productId){
                return productDetails1;
            }
        }
        return null;

    }
}
