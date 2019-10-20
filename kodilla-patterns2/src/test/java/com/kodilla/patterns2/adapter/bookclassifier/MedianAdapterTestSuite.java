package com.kodilla.patterns2.adapter.bookclassifier;


import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

        @Test
        public void publicationYearMedianTest() {
            //Given
            Set<Book> bookSet = new HashSet<>();
            bookSet.add(new Book("Title 1", "Author 1", 1955, "S01"));
            bookSet.add(new Book("Title 2", "Author 2", 1967, "S02"));
            bookSet.add(new Book("Title 3", "Author 3", 1999, "S03"));
            bookSet.add(new Book("Title 4", "Author 4", 2011, "S04"));
            bookSet.add(new Book("Title 5", "Author 5", 2018, "S05"));
            //When
            MedianAdapter medianAdapter = new MedianAdapter();
            int result = medianAdapter.publicationYearMedian(bookSet);
            //Then
            Assert.assertEquals(1999, result);
        }
    }

