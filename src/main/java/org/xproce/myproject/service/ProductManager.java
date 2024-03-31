package org.xproce.myproject.service;

import org.xproce.myproject.dao.entities.Product;

import java.util.List;

public interface ProductManager {
public Product addProduct(Product product);
public Boolean deleteProduct(Product product);
public Boolean deleteProductById(Integer id);
public Product UpdateProduct(Product product);
public List<Product> getallProduct();
public Product getProductbyid(Integer id);
}
