package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class CapriPizzaOrderDecorator extends AbstractPizzaOrderDecorator {

    public CapriPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(9));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + ham and mushrooms";
    }
}
