package com.apps.corson.pockettool;

/**
 * Created by Brian on 5/28/16.
 */

import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;


public class Clock {

    public static String getTime(){
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
        return (sdf.format(cal.getTime()));
    }

    public static void timer(int length){  //length in miliseconds

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("TIMETIMERITIMERIMTIERMTIMERIMETIEMTIMERTIMERTIMERTIMERTIMER");
            }
        },length);
    }

}
