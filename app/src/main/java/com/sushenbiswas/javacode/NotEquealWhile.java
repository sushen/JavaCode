package com.sushenbiswas.javacode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class NotEquealWhile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_not_equeal_while);
        goToMain();
    }

    // this is for Display if Else statement
    public void submitOrder(View view) {
        display("  // I Defune Return Value function here\n" +
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
                "    // This is Not Equeal While loop\n" +
                "    public int keepRolling(){\n" +
                "        int disc1 = rollDisc();\n" +
                "        int disc2 = rollDisc();\n" +
                "        int count = 1;\n" +
                "\n" +
                "        while (!(disc1 == disc2)){\n" +
                "            disc1 = rollDisc();\n" +
                "            disc2 = rollDisc();\n" +
                "            count = count +1;\n" +
                "            System.out.println(count);\n" +
                "        }\n" +
                "        return count;\n" +
                "    }" +
                "" +
                "        // Call Not Equeal While loop\n" +
                "        keepRolling();\n");

        // Call Not Equeal While loop
        keepRolling();

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
    // This is Not Equeal While loop
    public int keepRolling(){
        int disc1 = rollDisc();
        int disc2 = rollDisc();
        int count = 1;

        while (!(disc1 == disc2)){
            disc1 = rollDisc();
            disc2 = rollDisc();
            count = count +1;
            System.out.println(count);
        }
        return count;
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
