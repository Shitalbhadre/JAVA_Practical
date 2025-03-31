/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author hp
 */
public class Mysecondprojectusingant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Farmer F1 = new Farmer("Namdev Bhadre", 55, "Farmer");
        Customer C1 = new Customer("Shrikant Chandanshive",35, "Customer");
        
        F1.DisplayInformation();
        C1.DisplayInformation();
        
        Vegetables V1 = new Vegetables("Tomato");
        Fruits Fru1 = new Fruits("Mango");
        
        V1.DisplayProductDetail();
        Fru1.DisplayProductDetail();
        
        
    }
    
}
