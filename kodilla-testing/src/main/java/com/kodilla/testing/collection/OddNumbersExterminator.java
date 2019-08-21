<<<<<<< HEAD
package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        ArrayList<Integer> even = new ArrayList<Integer>();
        for(Integer number: numbers){
            if(number%2==0){
                even.add(number);
            }
        }
        return even;
    }
}
=======
package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        ArrayList<Integer> even = new ArrayList<Integer>();
        for(Integer number: numbers){
            if(number%2==0){
                even.add(number);
            }
        }
        return even;
    }
}
>>>>>>> 7259dfe96ba4b4a6129cc9ead52c842e94ca297f
