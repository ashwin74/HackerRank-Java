/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author Ashwin
 */
public class Dog extends Animal{
    
    public Dog() {
       super(15); //inherits Animal Parent class.
        System.out.println("Dog has been created");
    }
    public void run(){
        System.out.println("Dog is running");
    }
    public void bark(){
        System.out.println("Dog is barking");
    }
}
