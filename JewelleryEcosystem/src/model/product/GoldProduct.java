/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.product;

/**
 *
 * @author trimbkjagtap
 */
public class GoldProduct extends Product {
    private double goldWeight;
    private double otherWeight;
    private int karat;
    private double laborCharges;
    private double externalCharges;

    public GoldProduct(double goldWeight, double otherWeight, String name, double weight) {
        super(name, weight);
        this.goldWeight = goldWeight;
        this.otherWeight = otherWeight;
        this.setProductType(ProductType.Gold);
    }
    
    public GoldProduct(double goldWeight, double otherWeight, int karat, double laborCharges, double externalCharges, String name, double weight) {
        super(name, weight);
        this.goldWeight = goldWeight;
        this.otherWeight = otherWeight;
        this.karat = karat;
        this.laborCharges = laborCharges;
        this.externalCharges = externalCharges;
        this.setProductType(ProductType.Gold);
    }
    
    @Override
    public double getPrice(){
        return (goldWeight * Gold.getGoldPrice() * (karat/24.0)) + (goldWeight + otherWeight) * laborCharges + externalCharges;
    }
    public double getGoldWeight() {
        return goldWeight;
    }

    public void setGoldWeight(double goldWeight) {
        this.goldWeight = goldWeight;
    }

    public double getOtherWeight() {
        return otherWeight;
    }

    public void setOtherWeight(double otherWeight) {
        this.otherWeight = otherWeight;
    }

    public int getKarat() {
        return karat;
    }

    public void setKarat(int karat) {
        this.karat = karat;
    }

    public double getLaborCharges() {
        return laborCharges;
    }

    public void setLaborCharges(double laborCharges) {
        this.laborCharges = laborCharges;
    }

    public double getExternalCharges() {
        return externalCharges;
    }

    public void setExternalCharges(double externalCharges) {
        this.externalCharges = externalCharges;
    }
    
}
