package com.evenodds.evenodds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayDeque;
import java.util.Deque;

@SpringBootApplication
public class EvenOddsApplication {

    public static void main (String[] args) {
        Deque<String> stringsList = new ArrayDeque<>();

        RandomStringGenerator rsg = new RandomStringGenerator();
        int counter = 0;
        for (int i=0; i<50; i++){
            counter++;
            stringsList.offer(rsg.getRandomString());
        }
        EvenOrOdds object = new EvenOrOdds();
        object.splitIntoEvenAndOdds(stringsList);
    }
}
