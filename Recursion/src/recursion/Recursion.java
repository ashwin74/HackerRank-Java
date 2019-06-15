/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

public class Recursion {

    public static int Factorial(int n) {
        if (n <= 1){
            return 1;
        } else {
            return n * Factorial(n-1);
        }
    }
    
    public static int Expo(int n, int p){
        if (p<1) {
            return 1;
        } else {
            return n * Expo(n, p-1);
        }
    }
    
    public static void main(String[] args) {
        System.out.println(Factorial(6));
        System.out.println(Expo(5,3));
    }
    
}
