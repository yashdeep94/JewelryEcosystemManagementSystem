/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.product;

/**
 *
 * @author lenovo
 */
public class Gold {
    public static double price;
    
    public static void changeGoldPrice(double p){
        price = p;
    }
    public static double getGoldPrice(){
        return price;
    }
}
