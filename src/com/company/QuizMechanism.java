package com.company;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;



public class QuizMechanism {

    public class timer1 extends Thread {
        @Override
        public void run() {
            for(int x=0;x<100;x++)
            {
                System.out.println("BUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu");

            }
            System.out.println("konieccccccccccccccccccccccccccccccccccc");
        }
    }

    public class timer2 extends Thread {
        @Override
        public void run() {
            for(int x=0;x<1000;x++)
            {
                System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            }
            System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
        }
    }


    public void generate(String[] questions) {
        int score = 0;
        Boolean timeIsUp = false; // jak zmienic wartosc tego w threadzie po jakims czasie

        ObjectMapper mapper = new ObjectMapper();
        StudentList studentList = mapper.readValue(jsonString, StudentList.class);

        while(!timeIsUp) {
            for(String question : questions)
            {
                System.out.println(question);
                System.out.println("Enter answer ");


                UserLogic userLogic = new UserLogic();
                var test = userLogic.getInput();
            }
        }

    }

}
