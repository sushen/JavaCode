package com.sushenbiswas.javacode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class WhileLoop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_while_loop);

        goToMain();
    }

    // this is for Display if Else statement
    public void submitOrder(View view) {
        display("    // I Defune Return Value function here\n" +
                "\n" +
                "    public int rollDisc(){\n" +
                "        //This will ganerate decimal Value\n" +
                "        double randomNumber = Math.random();\n" +
                "\n" +
                "        //This will Generate a biger value\n" +
                "        randomNumber = randomNumber *6;\n" +
                "\n" +
                "        //This will Genarate Value which is less then 7\n" +
                "        randomNumber = randomNumber + 1;\n" +
                "\n" +
                "        //Custing Random Number\n" +
                "        int randomNumberInt = (int)randomNumber;\n" +
                "\n" +
                "        return randomNumberInt;\n" +
                "    }" +
                "        // I Call The Return Value\n" +
                "        int firstNumber = rollDisc();\n" +
                "        int secoundNumber = rollDisc();\n" +
                "        System.out.println(\"First \"+ firstNumber);\n" +
                "        System.out.println(\"Secound \"+ secoundNumber);");

        // I Call The Alarm Function
        alarm();

    }
    // This is for Check Alarm
    public boolean checkAlarm(){
        boolean ring = true;
        if(ring){
            System.out.println("Ringtone Ringing");
        }else {
            System.out.println("Set Ring Tone");
        }
        return ring;
    }
    // This is beep Function
    public void beep(){
        System.out.println("Beepiln");
    }

    // Alarm  function Wirh While loop
    public void alarm(){
        boolean on = checkAlarm();
        if (on){
            beep();
            on = checkAlarm();
        }
    }





    // This is for Desplaying after Clicking Btn
    private void display(String text) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + text);
    }

    // this for Button to go main Activety
    private void goToMain() {
        Button btn = (Button) findViewById(R.id.goToMainBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Toast.makeText(getApplicationContext(),"I am Going to main activety",Toast.LENGTH_LONG)
                        .show();
            }
        });


    }
}