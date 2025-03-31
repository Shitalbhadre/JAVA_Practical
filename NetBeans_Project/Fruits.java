/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author hp
 */
public class Fruits implements DisplayProduct {
    String name;

    public Fruits(String name) {
        this.name = name;
    }

    @Override
    public void DisplayProductDetail() {
        System.out.println("Fruits : " + name);
    }
    
}
