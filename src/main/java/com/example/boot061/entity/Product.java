package com.example.boot061.entity;

/**
 * @author Freg
 * @date 2022/9/11 - 16:21
 */
public class Product {
    private int id;
    private String title;
    private double price;
    private int num;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", num=" + num +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Product(int id, String title, double price, int num) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.num = num;
    }

    public Product() {
    }
}
