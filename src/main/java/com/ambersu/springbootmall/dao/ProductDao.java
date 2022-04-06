package com.ambersu.springbootmall.dao;

import com.ambersu.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
