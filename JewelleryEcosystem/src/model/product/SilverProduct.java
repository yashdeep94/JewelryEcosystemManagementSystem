/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.product;

/**
 *
 * @author trimbkjagtap
 */
public class SilverProduct extends Product {
    private double price;
    public SilverProduct(String name, double weight, double price) {
        super(name, weight);
        this.price = price;
        this.setProductType(ProductType.Silver);
    }
    @Override
    public double getPrice(){
        return this.price;
    }
}
