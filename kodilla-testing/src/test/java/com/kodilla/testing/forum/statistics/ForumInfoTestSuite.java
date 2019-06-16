package com.kodilla.testing.forum.statistics;
import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumInfoTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testCalculateAdvStatisticsZeroPosts(){
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0); // gdy liczba postów = 0
        ForumInfo forumInfo = new ForumInfo();
        //When
        forumInfo.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0,forumInfo.getTotalPosts());
    }

    @Test
    public void testCalculateAdvStatistics1000Posts(){
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(1000); // gdy liczba postów = 1000
        ForumInfo forumInfo = new ForumInfo();
        //When
        forumInfo.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(1000,forumInfo.getTotalPosts());
    }

    @Test
    public void testCalculateAdvStatisticsZeroComments(){
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(0); // gdy liczba postów = 0
        ForumInfo forumInfo = new ForumInfo();
        //When
        forumInfo.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0,forumInfo.getTotalComments());
    }

    @Test
    public void testCalculateAdvStatisticsLessComments(){
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(400); // liczba komentarzy < liczby postów
        when(statisticsMock.commentsCount()).thenReturn(200);
        ForumInfo forumInfo = new ForumInfo();
        //When
        forumInfo.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertTrue(forumInfo.getTotalComments()<forumInfo.getTotalPosts());
    }

    @Test
    public void testCalculateAdvStatisticsMoreComments(){
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(200); // liczba komentarzy > liczby postów
        when(statisticsMock.commentsCount()).thenReturn(400);
        ForumInfo forumInfo = new ForumInfo();
        //When
        forumInfo.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertTrue(forumInfo.getTotalComments()>forumInfo.getTotalPosts());
    }

    @Test
    public void testCalculateAdvStatisticsZeroUsers(){
        ArrayList<String> usersList = new ArrayList<String>();
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(usersList); // gdy liczba użytkowników = 0
        ForumInfo forumInfo = new ForumInfo();
        //When
        forumInfo.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0,forumInfo.getUsersCount());
    }

    @Test
    public void testCalculateAdvStatistics100Users(){
        List<String> usersList = Arrays.asList(new String[100]); // nie miało być loopowania w testach :D
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(usersList); // gdy liczba użytkowników = 100
        ForumInfo forumInfo = new ForumInfo();
        //When
        forumInfo.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(100,forumInfo.getUsersCount());
    }


}
