/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.product;

/**
 *
 * @author YASH
 */
public class RepairProduct extends Product {
    private double charges;
    
    public RepairProduct(String name, double weight, double charges) {
        super(name, weight);
        this.charges = charges;
        this.setProductType(ProductType.Repair);
    }
    
    @Override
    public double getPrice(){
        return 0.0;
    }
}
