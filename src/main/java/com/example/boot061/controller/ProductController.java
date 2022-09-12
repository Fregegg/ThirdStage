package com.example.boot061.controller;

import com.example.boot061.entity.Product;
import com.example.boot061.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @author Freg
 * @date 2022/9/11 - 16:18
 */
@RestController
public class ProductController {
    @Autowired
    ProductMapper mapper;

    @RequestMapping("/insert")
    public void insert(@RequestBody Product product){
        mapper.insert(product);
    }

    @RequestMapping("/select")
    public ArrayList<Product> select(){
        return mapper.select();
    }

    @RequestMapping("/delete")
    public void delete(int id){
        mapper.deleteById(id);
    }

    @RequestMapping("/selectById")
    public Product selectById(int id){
        return mapper.selectById(id);
    }

    @RequestMapping("/update")
    public void update(@RequestBody Product product){
        mapper.update(product);
    }
}
