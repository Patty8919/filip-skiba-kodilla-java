<<<<<<< HEAD
package com.kodilla.testing.forum.statistics;


public class ForumInfo {

    private int usersCount;
    private int totalPosts;
    private int totalComments;
    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics){
        usersCount=statistics.usersNames().size();
        totalPosts=statistics.postsCount();
        totalComments=statistics.commentsCount();
        if(statistics.postsCount()==0 || statistics.usersNames().size()==0){
            avgPostsPerUser=0;
        }
        else{
                avgPostsPerUser = (double)statistics.postsCount() /statistics.usersNames().size();
        }
        if(statistics.commentsCount()==0 || statistics.usersNames().size()==0){
            avgCommentsPerUser=0;
        }
        else {
            avgCommentsPerUser = (double)statistics.commentsCount() / statistics.usersNames().size();
        }
        if(statistics.commentsCount()==0 || statistics.postsCount()==0)
            avgCommentsPerPost=0;
        else {
            avgCommentsPerPost = (double)statistics.commentsCount() / statistics.postsCount();
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

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }

    public void showStatistics(){

    }

}
=======
package com.kodilla.testing.forum.statistics;


public class ForumInfo {

    private int usersCount;
    private int totalPosts;
    private int totalComments;
    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics){
        usersCount=statistics.usersNames().size();
        totalPosts=statistics.postsCount();
        totalComments=statistics.commentsCount();
        if(statistics.postsCount()==0 || statistics.usersNames().size()==0){
            avgPostsPerUser=0;
        }
        else{
                avgPostsPerUser = (double)statistics.postsCount() /statistics.usersNames().size();
        }
        if(statistics.commentsCount()==0 || statistics.usersNames().size()==0){
            avgCommentsPerUser=0;
        }
        else {
            avgCommentsPerUser = (double)statistics.commentsCount() / statistics.usersNames().size();
        }
        if(statistics.commentsCount()==0 || statistics.postsCount()==0)
            avgCommentsPerPost=0;
        else {
            avgCommentsPerPost = (double)statistics.commentsCount() / statistics.postsCount();
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

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }

    public void showStatistics(){

    }

}
>>>>>>> 7259dfe96ba4b4a6129cc9ead52c842e94ca297f
