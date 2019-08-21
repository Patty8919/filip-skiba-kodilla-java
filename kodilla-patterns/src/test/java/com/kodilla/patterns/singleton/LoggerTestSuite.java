package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;


public class LoggerTestSuite {

    @Test
    public void getLastLog() {
        String logInfo = "System shutdown";
        //When
        Logger.getInstance().log(logInfo);
        String lastInfo = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals(logInfo, lastInfo);
    }
}
