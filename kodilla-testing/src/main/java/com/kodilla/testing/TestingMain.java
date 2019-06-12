package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");

        int a = 35;
        int b =15;
        Calculator calculator = new Calculator();

        if(calculator.add(a,b)==(a+b)){
            System.out.println("test add ok");
        }
        else{
            System.out.println("Error - can not add values");
        }

        System.out.println("Test - drugi test jednostkowy:");

        if(calculator.substract(a,b)==(a-b)){
            System.out.println("test substract ok");
        }
        else{
            System.out.println("Error - can not substract values");
        }




    }
}