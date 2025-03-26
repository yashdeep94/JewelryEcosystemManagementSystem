/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.product;

import java.util.ArrayList;
import model.product.Product.ProductType;

/**
 *
 * @author trimbkjagtap
 */
public class ProductCatalog {
    private ArrayList<Product> products;
    private ArrayList<GoldProduct> goldProducts;
    private ArrayList<SilverProduct> silverProducts;
    private ArrayList<RepairProduct> repairProducts;
    
    public ProductCatalog() {
        products = new ArrayList<Product>();
        goldProducts = new ArrayList<GoldProduct>();
        silverProducts = new ArrayList<SilverProduct>();
        repairProducts = new ArrayList<RepairProduct>();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
    
    public ArrayList<GoldProduct> getGoldProducts() {
        return goldProducts;
    }
    
    public ArrayList<SilverProduct> getSilverProducts() {
        return silverProducts;
    }
    
    public Product CreateNewProduct(ProductType type, String name, double weight, double goldWeight, double otherWeight, int karat, double laborCharges, double externalCharges) {
        GoldProduct product = new GoldProduct(goldWeight, otherWeight, karat, laborCharges, externalCharges, name, weight);
        products.add(product);
        goldProducts.add(product);
        return product;
    }
    
    public Product CreateNewProduct(ProductType type, String name, double weight, double goldWeight, double otherWeight) {
        GoldProduct product = new GoldProduct(goldWeight, otherWeight, name, weight);
        products.add(product);
        goldProducts.add(product);
        return product;
    }
    
    public Product CreateNewProduct(ProductType type, String name, double weight, double price) {
        if (type.equals(ProductType.Silver)) {
            SilverProduct product = new SilverProduct(name, weight, price);
            products.add(product);
            silverProducts.add(product);
            return product;
        } 
        RepairProduct product = new RepairProduct(name, weight, price);
        products.add(product);
        repairProducts.add(product);
        return product;
    }
}
