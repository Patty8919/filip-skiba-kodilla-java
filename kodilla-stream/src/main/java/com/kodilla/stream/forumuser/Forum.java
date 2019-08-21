package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUsers = new ArrayList<>();

    public Forum(){
        forumUsers.add(new ForumUser(1,"Filip",'M', LocalDate.parse("1991-05-05"),34));
        forumUsers.add(new ForumUser(2,"Ola",'F', LocalDate.parse("2005-04-25"),54));
        forumUsers.add(new ForumUser(3,"Karolina",'F', LocalDate.parse("1997-12-27"),5));
        forumUsers.add(new ForumUser(4,"Justyna",'F', LocalDate.parse("2003-11-08"),62));
        forumUsers.add(new ForumUser(5,"Marcin",'M', LocalDate.parse("2006-04-03"),1));
        forumUsers.add(new ForumUser(6,"Karol",'M', LocalDate.parse("1995-06-17"),0));
        forumUsers.add(new ForumUser(7,"Anna",'F', LocalDate.parse("1982-08-30"),7));
        forumUsers.add(new ForumUser(8,"Monika",'F', LocalDate.parse("1984-07-15"),58));
        forumUsers.add(new ForumUser(9,"Zenek",'M', LocalDate.parse("2000-03-14"),121));
        forumUsers.add(new ForumUser(10,"Marek",'M', LocalDate.parse("1999-01-22"),3));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(forumUsers);
    }

}
