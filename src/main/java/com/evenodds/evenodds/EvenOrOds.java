package com.evenodds.evenodds;

import java.util.ArrayList;
import java.util.Deque;

 class EvenOrOdds{
    public void splitIntoEvenAndOdds(Deque<String> theQueue){
        ArrayList<String> evenList = new ArrayList<>();
        ArrayList<String> oddList = new ArrayList<>();

        while (theQueue.size() > 0) {
            for (int n = 0; n < theQueue.size(); n++) {
                String word = theQueue.poll();
                if (word.length() % 2 == 0) {
                    evenList.add(word);
                }else{
                    oddList.add(word);
                }
            }
        }
        System.out.println("Even: " + evenList);
        System.out.println("Odds: " + oddList);
    }
}