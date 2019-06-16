package com.kodilla.testing.forum.statistics;


public class ForumInfo {

    private int usersCount;
    private int totalPosts;
    private int totalComments;
    private int avgPostsPerUser;
    private int avgCommentsPerUser;
    private int avgCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics){
        usersCount=statistics.usersNames().size();
        totalPosts=statistics.postsCount();
        totalComments=statistics.commentsCount();
        if(statistics.postsCount()==0 || statistics.usersNames().size()==0){
            avgPostsPerUser=0;
        }
        else{
                avgPostsPerUser = statistics.postsCount() / statistics.usersNames().size();
        }
        if(statistics.commentsCount()==0 || statistics.usersNames().size()==0){
            avgCommentsPerUser=0;
        }
        else {
            avgCommentsPerUser = statistics.commentsCount() / statistics.usersNames().size();
        }
        if(statistics.commentsCount()==0 || statistics.postsCount()==0)
            avgCommentsPerPost=0;
        else {
            avgCommentsPerPost = statistics.commentsCount() / statistics.postsCount();
        }
    }

    public int getUsersCount() {
        return usersCount;
    }

    public int getTotalPosts() {
        return totalPosts;
    }

    public int getTotalComments() {
        return totalComments;
    }

    public int getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public int getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public int getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }

    public void showStatistics(){

    }

}
