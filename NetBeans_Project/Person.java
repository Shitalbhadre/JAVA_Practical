/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author hp
 */
public class Person implements Farm_members {
    String name;
    int age;
    String role;
    Person(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    @Override
    public void DisplayInformation() {
        System.out.println("Name : "+ name +"\n" + "Age : " + age + "\n" + "Role : " +role);
    }
    
}
