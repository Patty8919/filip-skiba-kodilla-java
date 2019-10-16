package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING_TASK = "SHOPPING_TASK";
    public static final String PAINTING_TASK = "PAINTING_TASK";
    public static final String DRIVING_TASK = "DRIVING_TASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING_TASK:
                return new ShoppingTask("Buy car", "Buy new BMW", 250000.0);
            case PAINTING_TASK:
                return new PaintingTask("Paint car", "Blue", "Paint left door");
            case DRIVING_TASK:
                return new DrivingTask("Test ride", "Bydgoszcz", "BMW");
            default:
                return null;
        }
    }
}
