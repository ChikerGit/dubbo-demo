package com.deepexi.product.domain.eo;

import com.deepexi.util.mapper.SuperEntity;

public class Product extends SuperEntity {
    /**
     * 名称
     */
    private String name;
    /**
     * 价格
     */
    private Integer price;

    public Product() {}

    public Product(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}

