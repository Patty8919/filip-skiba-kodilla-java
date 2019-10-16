package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        Set<Book> listOfBooks = new HashSet<>();
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listOfBooks.add(new Book("Title " + n, "Author" + n, LocalDate.now())));

        Library library = new Library("Library");
        library.setBooks(listOfBooks);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Shallow cloned library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Deep cloned library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        library.getBooks().remove(library.getBooks().stream().findFirst().get());

        library.printBooks();
        clonedLibrary.printBooks();
        deepClonedLibrary.printBooks();

        Assert.assertEquals(9, library.getBooks().size());
        Assert.assertEquals(9, clonedLibrary.getBooks().size());
        Assert.assertEquals(10, deepClonedLibrary.getBooks().size());


    }
}
