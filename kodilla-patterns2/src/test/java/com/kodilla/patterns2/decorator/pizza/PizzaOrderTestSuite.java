package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    //extra cheese - 6 //  + extra cheese
    //capri - 9 //  + ham and mushrooms
    //hawaii - 15 //  + ham and pineapple
    // extra large - 8 //  + extra large pizza

    @Test
    public void testBasicPizzaOrderGetCost(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculateCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15),calculateCost);
    }
    @Test
    public void testBasicPizzaOrderGetDescription(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Basic pizza (Bottom, sauce, cheese)",description);
    }
    @Test
    public void testCapriPizzaOrderWithExtraLargeGetCost(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new CapriPizzaOrderDecorator(pizzaOrder);
        pizzaOrder = new ExtraLargePizzaOrderDecorator(pizzaOrder);
        //When
        BigDecimal calculateCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(32),calculateCost);
    }

    @Test
    public void testCapriPizzaOrderWithExtraLargeGetDescription(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new CapriPizzaOrderDecorator(pizzaOrder);
        pizzaOrder = new ExtraLargePizzaOrderDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Basic pizza (Bottom, sauce, cheese) + ham and mushrooms + extra large",description);
    }

    @Test
    public void testHawaiiPizzaOrderWithExtraCheeseGetCost(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new HawaiiPizzaOrderDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheesePizzaOrderDecorator(pizzaOrder);
        //When
        BigDecimal calculateCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(36),calculateCost);
    }

    @Test
    public void testHawaiiPizzaOrderWithExtraCheeseGetDescription(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new HawaiiPizzaOrderDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheesePizzaOrderDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Basic pizza (Bottom, sauce, cheese) + ham and pineapple + extra cheese",description);
    }
}
