package com.sushenbiswas.javacode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoopCounter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loop_counter);

        goToMain();
    }

    // this is for Display if Else statement
    public void submitOrder(View view) {
        display("    // This is Loop Counter\n" +
                "    public void raiseAlarm(int numberOfWorning){\n" +
                "        for (int i = 1; i <= numberOfWorning; i++){\n" +
                "            System.out.println(\"Warning! \" + i);\n" +
                "        }\n" +
                "    }" +
                "        // Call Loop Counter\n" +
                "        raiseAlarm(5);");

        // Call Loop Counter
        raiseAlarm(5);

    }

    // I Defune Return Value function here

    public int rollDisc(){
        //This will ganerate decimal Value
        double randomNumber = Math.random();

        //This will Generate a biger value
        randomNumber = randomNumber *6;

        //This will Genarate Value which is less then 7
        randomNumber = randomNumber + 1;

        //Custing Random Number
        int randomNumberInt = (int)randomNumber;

        return randomNumberInt;
    }
    // This is Loop Counter
    public void raiseAlarm(int numberOfWorning){
        for (int i = 1; i <= numberOfWorning; i++){
            System.out.println("Warning! " +( rollDisc() + i));
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