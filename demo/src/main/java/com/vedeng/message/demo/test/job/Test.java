package com.vedeng.message.demo.test.job;

import java.util.Arrays;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) throws InterruptedException {  
     /*   String name = "";
        String name1 = "12";
        String name2 = "12345";
        
        System.out.println(validInput(name,inputStr ->  !inputStr.isEmpty() &&  inputStr.length() <= 3 ));
        System.out.println(validInput(name1,inputStr ->  !inputStr.isEmpty() &&  inputStr.length() <= 3 ));
        System.out.println(validInput(name2,inputStr ->  !inputStr.isEmpty() &&  inputStr.length() <= 3 )); */
    
    
        Arrays.asList( "a", "b", "d" ).forEach(e -> System.out.println( e ) );
        String separator = ",";
        Arrays.asList( "a", "b", "d" ).forEach(
                ( String e ) -> System.out.print( e + separator ) );
    }  
    public static boolean validInput(String name, Predicate<String> function) {
        return function.test(name);  
    }  
}  