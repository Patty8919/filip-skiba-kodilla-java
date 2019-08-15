package com.kodilla.patterns.strategy.social;
import com.kodilla.patterns.strategy.social.publishers.TwitterPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User filip = new YGeneration("Filip");
        User ania = new Millenials("Ania");
        User mariusz = new ZGeneration("Mariusz");

        //When
        String filipsSocialPublisher = filip.sharePost();
        System.out.println(filipsSocialPublisher);
        String aniaSocialPublisher = ania.sharePost();
        System.out.println(aniaSocialPublisher);
        String mariuszSocialPublisher = mariusz.sharePost();
        System.out.println(mariuszSocialPublisher);
        //Then
        Assert.assertEquals("Facebook", filipsSocialPublisher);
        Assert.assertEquals("Snapchat",aniaSocialPublisher);
        Assert.assertEquals("Twitter",mariuszSocialPublisher);


    }
    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User filip = new YGeneration("Filip");

        //When
        String filipsSocialPublisher = filip.sharePost();
        System.out.println("Publisher was: "+filipsSocialPublisher);

        filip.setSocialPublisher(new TwitterPublisher());
        filipsSocialPublisher = filip.sharePost();
        System.out.println("Now publisher is: "+filipsSocialPublisher);

        //Then
        Assert.assertEquals("Twitter",filipsSocialPublisher);

    }
}
