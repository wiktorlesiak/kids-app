package com.lesiak.wiktor.kidsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class kids_app extends AppCompatActivity {
    int count = 0;
    int r1;
    int r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kids_app);
         newRandom();
    }
    private void newRandom(){

        if(count==10){

            Toast.makeText(this, "you won!", Toast.LENGTH_SHORT).show();
            count =0;

        }else {


        Random rand = new Random();
        r1 = rand.nextInt(10);

        while(true){
            r2 = rand.nextInt(10);
            if(r1!=r2)

                break;
            }
        }



        Button b1 = findViewById(R.id.button1);
        b1.setText(Integer.toString(r1));
        Button b2 = findViewById(R.id.button2);
        b2.setText(Integer.toString(r2));
    }


    public void onClickLeft(View view) {

        if(r1 > r2)
                count++;
        else
            count--;
            TextView txt = (TextView) findViewById(R.id.textViewPoints);
            txt.setText("Points: " + count);
            newRandom();

    }

    public void onClickRight(View view) {
        if (r1 < r2)
            count++;
        else
            count--;
            TextView txt = (TextView) findViewById(R.id.textViewPoints);
            txt.setText("Points: " + count);
            newRandom();
    }
}
