package com.kodilla.patterns2.observer.homework;

public class Mentor implements MentorObserver {

    private String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
        this.updateCount = 0;
    }

    @Override
    public void update(TaskQueue taskQueue) {
        System.out.println("New task from " + taskQueue.getStudentsName() + "\n" +
                "Total number of tasks in queue for student: " + taskQueue.getTasks().size());
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
