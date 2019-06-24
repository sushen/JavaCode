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
        display("    // This is for Check Alarm\n" +
                "    public boolean checkAlarm(){\n" +
                "        boolean ring = true;\n" +
                "        if(ring){\n" +
                "            System.out.println(\"Ringtone Ringing\");\n" +
                "        }else {\n" +
                "            System.out.println(\"Set Ring Tone\");\n" +
                "        }\n" +
                "        return ring;\n" +
                "    }\n" +
                "    // This is beep Function\n" +
                "    public void beep(){\n" +
                "        System.out.println(\"Beepiln\");\n" +
                "    }\n" +
                "\n" +
                "    // Alarm  function Wirh While loop\n" +
                "    public void alarm(){\n" +
                "        boolean on = checkAlarm();\n" +
                "        if (on){\n" +
                "            beep();\n" +
                "            on = checkAlarm();\n" +
                "        }\n" +
                "    }" +
                "        // I Call The Alarm Function\n" +
                "        alarm();");

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