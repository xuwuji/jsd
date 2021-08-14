package com.puruan.application;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {


    /**
     * http://localhost:8080/product/4
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
    public Product getById(@PathVariable("id") int id) {
        if (DataSource.PRODUCT_TABLE.containsKey(id)) {
            Product product = DataSource.PRODUCT_TABLE.get(id);
            return product;
        } else {
            throw new BizException("查询的商品id不存在");
        }
    }


    /**
     * http://localhost:8080/delete/product/5
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/delete/product/{id}", method = RequestMethod.GET)
    public void deleteById(@PathVariable("id") int id) {
        if (DataSource.PRODUCT_TABLE.containsKey(id)) {
            DataSource.PRODUCT_TABLE.remove(id);
        } else {
            throw new BizException("删除的商品id不存在");
        }
    }

    /**
     * http://localhost:8080/product/getAll
     *
     * @return
     */
    @RequestMapping(value = "/product/getAll", method = RequestMethod.GET)
    public List<Product> getAll() {
        if (DataSource.PRODUCT_TABLE.size() > 1) {
            throw new TechException("数据量过大，不能全部取出");
        }
        ArrayList<Product> result = new ArrayList<>();
        DataSource.PRODUCT_TABLE.forEach((k, v) -> {
            result.add(v);
        });
        return result;
    }
}
