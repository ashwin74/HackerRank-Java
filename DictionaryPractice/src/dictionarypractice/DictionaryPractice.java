/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionarypractice;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Ashwin
 */
public class DictionaryPractice {
    
    public static void main(String[] args) {
        // English to Spanish Dictionary
        Map<String, String> engSpanDictionary = new HashMap<String, String>();
        //Putting things inside dictionary.
        engSpanDictionary.put("Monday", "Lunes");
        engSpanDictionary.put("Tuesday", "Martes");
        engSpanDictionary.put("Wednesday", "Miercoles");
        engSpanDictionary.put("Thursday", "Jueves");
        engSpanDictionary.put("Friday", "Viernes");
        
        //Retrieve things from our dictionary.
        System.out.println(engSpanDictionary.get("Monday"));
        System.out.println(engSpanDictionary.get("Tuesday"));
        System.out.println(engSpanDictionary.get("Wednesday"));
        System.out.println(engSpanDictionary.get("Thursday"));
        System.out.println(engSpanDictionary.get("Friday"));
        System.out.println(engSpanDictionary.keySet());
        System.out.println(engSpanDictionary.values());
        System.out.println("Size is " + engSpanDictionary.size());
        
        System.out.println();
        System.out.println();
        System.out.println(engSpanDictionary.toString());
        engSpanDictionary.remove("Monday");
        System.out.println(engSpanDictionary.toString());
        engSpanDictionary.replace("Tuesday", "Fool");
        System.out.println(engSpanDictionary.toString());
        engSpanDictionary.clear();
        System.out.println(engSpanDictionary.toString());
    }
    
}
