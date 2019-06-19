package com.sushenbiswas.javacode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SwitchStatement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch_statement);
        goToMain();
    }

    // this is for Display Hello World
    public void submitOrder(View view) {
        display("        // Code for Log Out\n" +
                "        int passcode = 555;\n" +
                "        String coffeeype;\n" +
                "        if(passcode == 555){\n" +
                "            coffeeype = \"Expresso\";\n" +
                "        }else if(passcode == 321){\n" +
                "            coffeeype = \"Vanilla Latte\";\n" +
                "        }else if(passcode == 629){\n" +
                "            coffeeype = \"Drip Coffee\";\n" +
                "        }else if(passcode == 666){\n" +
                "            coffeeype = \"Americanno\";\n" +
                "        }else {\n" +
                "            coffeeype = \"Unknown\";\n" +
                "        }\n" +
                "        System.out.println(coffeeype);");

        // Code for Log Out
        int passcode = 666;
        String coffeeype;
        if(passcode == 555){
            coffeeype = "Expresso";
        }else if(passcode == 321){
            coffeeype = "Vanilla Latte";
        }else if(passcode == 629){
            coffeeype = "Drip Coffee";
        }else if(passcode == 666){
            coffeeype = "Americanno";
        }else {
            coffeeype = "Unknown";
        }
        System.out.println(coffeeype);
    }

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
