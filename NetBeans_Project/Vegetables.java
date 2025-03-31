/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author hp
 */
public class Vegetables implements DisplayProduct {
    String name;
    public Vegetables(String name) {
        this.name = name;
    }

    @Override
    public void DisplayProductDetail() {
        System.out.println("Vegetable : " + name);
    }
   
    
}
