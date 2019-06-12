package com.kodilla.testing.forum.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> evenList = oddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing oddNumbersExterminator with empty list");
        Assert.assertEquals(emptyList.size(),evenList.size());
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        ArrayList<Integer> sampleList = new ArrayList<Integer>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> evenList = oddNumbersExterminator.exterminate(sampleList);
        System.out.println("Fill sample list...");
            for(int i =0; i<20; i++){
                sampleList.add(i);
            }
        System.out.println("Try to find odd numbers in even list");
        for(Integer number: evenList){
            Assert.assertEquals(0,number%2);
        }
    }

}
