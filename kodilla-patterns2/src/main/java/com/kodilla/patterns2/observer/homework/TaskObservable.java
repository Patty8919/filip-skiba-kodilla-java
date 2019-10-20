package com.kodilla.patterns2.observer.homework;

public interface TaskObservable {
    void addObserver(MentorObserver mentorObserver);
    void removeObserver(MentorObserver mentorObserver);
    void notifyObserver();
}
