package com.ambersu.springbootmall.dao;

import com.ambersu.springbootmall.dto.ProductRequest;
import com.ambersu.springbootmall.model.Product;
import org.springframework.web.bind.annotation.RequestBody;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
