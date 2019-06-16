package com.sushenbiswas.javacode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityVariables extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_variables);

        goToMain();
    }

    // this is for Display Variables


    public void submitOrder(View view) {
        display( "        // Data tipe\n" +
                "        int busStation = 0;\n" +
                "        char me = 'I';\n" +
                "        boolean fact = true;\n" +
                "        String text = \"Any Text\";\n" +
                "        double price = 12.36;\n" +
                "        long total = 1001111111;") ;

        // Code for Log
        int bus;
        bus = 0;
        bus = bus+5;
        bus = bus-2;
        System.out.println(bus);

        // Data tipe
        int busStation = 0;
        char me = 'I';
        boolean fact = true;
        String text = "Any Text";
        double price = 12.36;
        long total = 1001111111;

        // print all Data Type in the log
        System.out.println(me);
        System.out.println(fact);
        System.out.println(text);
        System.out.println(price);
        System.out.println(total);

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
