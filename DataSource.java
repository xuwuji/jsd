package com.puruan.application;

import java.util.HashMap;

// 模拟数据库
public class DataSource {

    //模拟商品表
    public static HashMap<Integer, Product> PRODUCT_TABLE = new HashMap<>();

    static {
        Product product1 = new Product();

        product1.setName("iphone");
        product1.setPrice(5000);
        product1.setStock(10);

        Product product2 = new Product();
        product2.setName("xiaomi");
        product2.setPrice(2000);
        product2.setStock(50);

        Product product3 = new Product();
        product3.setName("huawei");
        product3.setPrice(3000);
        product3.setStock(20);

        PRODUCT_TABLE.put(1, product1);
        PRODUCT_TABLE.put(2, product2);
        PRODUCT_TABLE.put(3, product3);


    }


}
