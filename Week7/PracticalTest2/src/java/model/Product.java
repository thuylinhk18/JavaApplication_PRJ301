/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author bebet
 */
public class Product {

    private int id;
    private String name;
    private String unit;
    private String category;
    private double price;

    public Product() {
    }

    public Product(String name, String unit, String category, double price) {
        this.name = name;
        this.unit = unit;
        this.category = category;
        this.price = price;
    }

    public Product(int id, String name, String unit, String category, double price) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.category = category;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", unit=" + unit + ", category=" + category + ", price=" + price + '}';
    }

}
