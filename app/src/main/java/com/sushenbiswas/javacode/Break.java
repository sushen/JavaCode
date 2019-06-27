package com.sushenbiswas.javacode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Break extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_break);

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
                "    }\n" +
                "\n" +
                "    // This is Break\n" +
                "\n" +
                "    public boolean rollSix(){\n" +
                "        int disc = rollDisc();\n" +
                "        while (disc!=6){\n" +
                "            disc = rollDisc();\n" +
                "            if(disc ==3);\n" +
                "            break;\n" +
                "        }\n" +
                "        if(disc == 6)\n" +
                "            return true;\n" +
                "        else\n" +
                "            return false;\n" +
                "    }" +
                "        // Call Break Function\n" +
                "        System.out.println(rollSix());");

        // Call Break Function
        System.out.println(rollSix());

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

    // This is Break

    public boolean rollSix(){
        int disc = rollDisc();
        while (disc!=6){
            disc = rollDisc();
            if(disc ==3);
            break;
        }
        if(disc == 6)
            return true;
        else
            return false;
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