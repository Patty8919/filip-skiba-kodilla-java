package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class TaskQueueTestSuite {

    @Test
    public void testObservers() {
        //Given
        TaskQueue queue1 = new TaskQueue("Filip Skiba");
        TaskQueue queue2 = new TaskQueue("Jan Kowalski");
        TaskQueue queue3 = new TaskQueue("Tomasz Nowak");
        Mentor mentor1 = new Mentor("Mentor 1");
        Mentor mentor2 = new Mentor("Mentor 2");
        queue1.addObserver(mentor1);
        queue2.addObserver(mentor2);
        queue3.addObserver(mentor1);
        queue3.addObserver(mentor2);
        //When
        queue1.addTask("Task 1");
        queue1.addTask("Task 2");
        queue1.addTask("Task 3");
        queue2.addTask("Task 1");
        queue2.addTask("Task 2");
        queue3.addTask("Task 1");
        //Then
        Assert.assertEquals(4, mentor1.getUpdateCount());
        Assert.assertEquals(3, mentor2.getUpdateCount());
    }
}