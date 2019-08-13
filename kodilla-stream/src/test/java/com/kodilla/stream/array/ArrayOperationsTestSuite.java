package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){

        int[] tab = new int[5];
        tab[0] = 2;
        tab[1] = 4;
        tab[2] = 5;
        tab[3] = 8;
        tab[4] = 3;

        double avg = ArrayOperations.getAverage(tab);
        System.out.println(avg);
        Assert.assertEquals(4.4, avg,0.001);

    }
}
