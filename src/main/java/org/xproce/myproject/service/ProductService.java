package org.xproce.myproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xproce.myproject.dao.entities.Product;
import org.xproce.myproject.dao.repositories.ProductRepository;

import java.sql.SQLOutput;
import java.util.List;

@Service
public class ProductService implements ProductManager  {
    @Autowired
   private  ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        try {
            return productRepository.save(product);
        }catch (Exception E){
            System.out.println(E.getMessage());
            return null;
        }
    }

    @Override
    public Boolean deleteProduct(Product product) {
        try {
            productRepository.delete(product);
            return true;
        }catch (Exception E){
            System.out.println(E.getMessage());
            return false;
        }
    }

    @Override
    public Boolean deleteProductById(Integer id) {
        try {
            productRepository.deleteById(id);
            return true;
        }catch (Exception E){
            System.out.println(E.getMessage());
            return false;
        }
    }

    @Override
    public List<Product> getallProduct() {
        try {
            return productRepository.findAll();

        }catch (Exception E){
            System.out.println(E.getMessage());
            return null;
        }
    }

    @Override
    public Product getProductbyid(Integer id) {
        try {
            return productRepository.findById(id).get();

        }catch (Exception E){
            System.out.println(E.getMessage());
            return null;
        }
    }

    @Override
    public Product UpdateProduct(Product product) {
        try {
            return productRepository.save(product);
        }catch (Exception E){
            System.out.println(E.getMessage());
            return null;
        }
    }
}
