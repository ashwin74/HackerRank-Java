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
public class Animal {

    public int age;
    public Animal (int age) {
        this.age = age;
        System.out.println("Age of Animal is " + this.age);
    }
    public void eat() {
        System.out.println("animal is eating");
    }
    public static void main(String[] args) {
        Animal a = new Animal(5);
        Dog d = new Dog(); //inheritence Dog class
        d.run();
        d.bark();
        d.eat();
    }
    
}
