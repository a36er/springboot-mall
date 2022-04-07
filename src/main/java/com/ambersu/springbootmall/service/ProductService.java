package com.ambersu.springbootmall.service;

import com.ambersu.springbootmall.constant.ProductCategory;
import com.ambersu.springbootmall.dto.ProductRequest;
import com.ambersu.springbootmall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId ,ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
