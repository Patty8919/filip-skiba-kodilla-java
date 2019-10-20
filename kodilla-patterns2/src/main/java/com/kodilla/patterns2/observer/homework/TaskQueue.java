package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class TaskQueue implements TaskObservable {

    private String studentsName;
    private Deque<String> tasks;
    private List<MentorObserver> mentors;

    public TaskQueue(String studentsName) {
        this.studentsName = studentsName;
        this.tasks = new ArrayDeque<>();
        this.mentors = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.offer(task);
        notifyObserver();
    }


    @Override
    public void addObserver(MentorObserver mentorObserver) {
        mentors.add(mentorObserver);
    }

    @Override
    public void removeObserver(MentorObserver mentorObserver) {
        mentors.remove(mentorObserver);
    }

    @Override
    public void notifyObserver() {
        for (MentorObserver mentorObserver : mentors) {
            mentorObserver.update(this);
        }
    }

    public String getStudentsName() {
        return studentsName;
    }

    public Deque<String> getTasks() {
        return tasks;
    }
}