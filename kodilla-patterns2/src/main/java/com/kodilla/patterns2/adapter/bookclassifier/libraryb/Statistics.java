package com.kodilla.patterns2.adapter.bookclassifier.libraryb;

import java.util.Arrays;
import java.util.Map;

public class Statistics implements BookStatistics {

    @Override
    public int averageYearOfPublication(Map<BookSignature, Book> books) {
        if(books.size() == 0) {
            return 0;
        }
        int sum = 0;
        for(Map.Entry<BookSignature, Book> book : books.entrySet()) {
            sum += book.getValue().getYearOfPublication();
        }
        return sum/books.size();
    }

    @Override
    public int medianYearOfPublication(Map<BookSignature, Book> books) {
        if(books.size() == 0) {
            return 0;
        }
        int[] years = new int[books.size()];
        int i = 0;
        for(Map.Entry<BookSignature, Book> book : books.entrySet()) {
            years[i] = book.getValue().getYearOfPublication();
            i++;
        }
        Arrays.sort(years);
        if(years.length % 2 == 0) {
            return years[(int)(years.length / 2 + 0.5)];
        } else {
            return years[years.length / 2];
        }
    }
}
