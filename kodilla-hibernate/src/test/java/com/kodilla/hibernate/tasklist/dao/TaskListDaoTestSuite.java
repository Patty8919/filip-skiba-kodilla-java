package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    TaskListDao taskListDao;
    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("Test list name", DESCRIPTION);
        //When
        taskListDao.save(taskList);
        String listName = taskList.getListName();
        List<TaskList> readTaskList = taskListDao.findByListName(listName);
        //Then
        Assert.assertEquals(1, readTaskList.size());

        //Clean up
        int id = readTaskList.get(0).getId();
        taskListDao.deleteById(id);
    }
}
