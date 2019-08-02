package com.kodilla.good.patterns.challenges.ProductOrderProcessor.config;

public interface SimpleDAO<T> {
    boolean save(T t);
    boolean delete(T t);
    boolean update(T t);
    T findByPropertyName(String string);
    T findById(long id);
}
