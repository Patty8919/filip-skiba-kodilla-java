package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraLargePizzaOrderDecorator extends AbstractPizzaOrderDecorator {
    public ExtraLargePizzaOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(8));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + extra large";
    }
}
