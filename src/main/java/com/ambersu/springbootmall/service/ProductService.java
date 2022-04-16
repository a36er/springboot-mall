package com.ambersu.springbootmall.service;

import com.ambersu.springbootmall.dto.ProductQueryParams;
import com.ambersu.springbootmall.dto.ProductRequest;
import com.ambersu.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    Integer getCountProducts(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId ,ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
