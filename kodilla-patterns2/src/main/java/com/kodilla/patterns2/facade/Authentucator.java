package com.kodilla.patterns2.facade;

import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;
import java.util.Random;

@Service
public class Authentucator {
    public boolean isAuthenticated(Long userId){
        Random random = new Random();
        return random.nextBoolean();
    }
}
