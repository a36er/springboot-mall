package com.ambersu.springbootmall.dao;

import com.ambersu.springbootmall.dto.ProductRequest;
import com.ambersu.springbootmall.model.Product;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts();

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
