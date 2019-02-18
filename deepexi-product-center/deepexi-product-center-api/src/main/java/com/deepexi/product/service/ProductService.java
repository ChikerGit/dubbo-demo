package com.deepexi.product.service;

import com.deepexi.product.domain.eo.Product;
import com.deepexi.util.pageHelper.PageBean;

public interface ProductService {

    PageBean getProductList(Integer page, Integer size, Integer price);

    Product getProductById(String id);

    Object createProduct(Product product);

    Boolean deleteProductById(String id);

}
