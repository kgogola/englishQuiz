package com.company;
import java.util.Timer;
import java.util.TimerTask;
import java.io.*;

public class UserLogic {

    private String input = "";

    TimerTask task = new TimerTask()
    {
        public void run()
        {
            if( input.equals("") )
            {
                System.out.println( "The time is up :(" );
                input = "0";
            }
        }
    };


    public String getInput()
    {
        Timer timer = new Timer();
        timer.schedule( task, 10*1000 );

        System.out.println( "Your answer is: " );
        BufferedReader in = new BufferedReader(
                new InputStreamReader( System.in ) );

        try
        {
            input = in.readLine();
        }
        catch(Exception e)
        {

        }


        timer.cancel();
        System.out.println( "you have entered: "+ input );


        return input;
    }

}
