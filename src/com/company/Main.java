package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Consts consts = new Consts();
        QuizMechanism quizMechanism = new QuizMechanism();
        quizMechanism.generate(consts.questions);
    }
}
