package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try{
            secondChallenge.probablyIWillThrowException(3,2);
        }catch (Exception e){
            System.out.println("Exception catched");
        }finally {
            System.out.println("Some info...");
        }
    }
}
