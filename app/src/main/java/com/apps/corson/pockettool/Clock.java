package com.apps.corson.pockettool;

/**
 * Created by Brian on 5/28/16.
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Clock {
    public static String getTime(){
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
        return (sdf.format(cal.getTime()));
    }

    public void vibrateTime(){

    }

}
