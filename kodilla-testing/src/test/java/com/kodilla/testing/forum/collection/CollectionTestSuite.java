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
        Assert.assertEquals(0,evenList.size());
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        ArrayList<Integer> sampleList = new ArrayList<Integer>();
        System.out.println("Fill sample list...");
        sampleList.add(1);
        sampleList.add(3);
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> evenList = oddNumbersExterminator.exterminate(sampleList);
        System.out.println("Try to find odd numbers in even list");
        Assert.assertEquals(0,evenList.size());
    }

}
