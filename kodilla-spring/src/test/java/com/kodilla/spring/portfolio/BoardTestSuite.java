package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        String toDo= "to do";
        String inProgress = "in progress";
        String done = "done";

        board.getToDoList().addTask(toDo);
        board.getInProgressList().addTask(inProgress);
        board.getDoneList().addTask(done);
        //When
        String resultToDoTask = board.getToDoList().getTasks().get(0);
        String resultInProgressTask = board.getInProgressList().getTasks().get(0);
        String resultDoneTask = board.getDoneList().getTasks().get(0);
        //Then
        Assert.assertEquals("to do", resultToDoTask);
        Assert.assertEquals("in progress", resultInProgressTask);
        Assert.assertEquals("done", resultDoneTask);
    }
}
