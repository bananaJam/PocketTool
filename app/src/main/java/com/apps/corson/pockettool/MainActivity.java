package com.apps.corson.pockettool;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import android.os.Vibrator;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    Button timeButton;
    TextView timeText;

    String timeString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //  final Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        timeText = (TextView)findViewById(R.id.time);

        timeButton = (Button) findViewById(R.id.timeButton);
        timeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Vibrator v2 = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                timeString = Clock.getTime();
                timeText.setText(timeString);
                vibrateTime(v2);
            }
        });


    }



    public void vibrateTime(Vibrator v){
        //"04:51"


        String time = timeString;

        System.out.println(Integer.parseInt(time.substring(0, 1)));

        ArrayList<Integer>timeList = new ArrayList<Integer>();


        for (int i = 0; i < time.length(); i++){
            System.out.println(time.substring(i, i+1));
            if (i==2){
                timeList.add(-1);
            }
            else{
                timeList.add(Integer.parseInt(time.substring(i, i+1)));
            }
        }

        for (int i = 0; i < 5; i++){
            System.out.println(timeList.get(i));
            if (timeList.get(i)==-1){
                v.vibrate(300);
                try {
                    Thread.sleep(500);                 //1000 milliseconds is one second.
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
            else{
                for (int k = 0; k < timeList.get(i); k++){
                    v.vibrate(100);
                    try {
                        Thread.sleep(500);                 //1000 milliseconds is one second.
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
            try {
                Thread.sleep(500);                 //1000 milliseconds is one second.
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }




    }

}
/*


int finalNumber = oldNumber*10 + newNumber;

190 * 10 = 1900 + 1 = 1901

String[] time = timeString.split("");
for (int i = 0; i < time.length; i++){
            System.out.println(time[i]);
        }

        for (int z = 0; z < 4; z++) {

            if (z == 2){            //signal the colon
                v.vibrate(3000);
            }

            else {                  //if it is a digit

                for (int k = 0; k < Integer.parseInt(time[z]); k++) {

                    v.vibrate(200);
                    try {
                        Thread.sleep(1000);                 //1000 milliseconds is one second.
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

*/
