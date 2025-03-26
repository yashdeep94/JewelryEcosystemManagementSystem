/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.product;

/**
 *
 * @author trimbkjagtap
 */
public abstract class Product {
    private String name;
    private double weight;
    private ProductType productType;
    
    public enum ProductType{
        Gold("Gold"),
        Silver("Silver"),
        Repair("Repair");
        
        private String value;
        private ProductType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public Product(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }
    
    public abstract double getPrice();
    
    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }
    
    @Override 
    public String toString() {
        return name;
    }
}
