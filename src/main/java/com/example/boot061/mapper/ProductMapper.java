package com.example.boot061.mapper;

import com.example.boot061.entity.Product;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

/**
 * @author Freg
 * @date 2022/9/11 - 16:19
 */
@Mapper
public interface ProductMapper {

    @Insert("INSERT INTO product VALUES(null,#{title},#{price},#{num})")
    void insert(Product product);

    @Select("SELECT * FROM product")
    ArrayList<Product> select();

    @Delete("DELETE FROM product WHERE id=#{id}")
    void deleteById(int id);

    @Select("SELECT * FROM product WHERE id= #{id}")
    Product selectById(int id);

    @Update("UPDATE product SET title=#{title},price=#{price},num=#{num} WHERE id=#{id}")
    void update(Product product);
}
