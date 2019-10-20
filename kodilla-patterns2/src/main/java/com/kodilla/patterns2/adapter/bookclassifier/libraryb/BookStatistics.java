package com.kodilla.patterns2.adapter.bookclassifier.libraryb;

import java.util.Map;

public interface BookStatistics {

    int averageYearOfPublication(Map<BookSignature, Book> books);
    int medianYearOfPublication(Map<BookSignature, Book> books);
}
