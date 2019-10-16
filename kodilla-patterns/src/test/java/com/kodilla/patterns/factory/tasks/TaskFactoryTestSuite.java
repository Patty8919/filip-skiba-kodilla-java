package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryPaintingTask() {
        TaskFactory taskFactory = new TaskFactory();
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTING_TASK);
        paintingTask.executeTask();

        Assert.assertEquals("Paint car", paintingTask.getTaskName());
        Assert.assertTrue(paintingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryShoppingTask() {
        TaskFactory taskFactory = new TaskFactory();
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING_TASK);
        shoppingTask.executeTask();

        Assert.assertEquals("Buy car", shoppingTask.getTaskName());
        Assert.assertTrue(shoppingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryDrivingTask() {
        TaskFactory taskFactory = new TaskFactory();
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVING_TASK);
        drivingTask.executeTask();

        Assert.assertEquals("Test ride", drivingTask.getTaskName());
        Assert.assertTrue(drivingTask.isTaskExecuted());
    }
}
