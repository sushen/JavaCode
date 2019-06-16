package com.sushenbiswas.javacode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CodeBoolean extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_boolean);

        goToMain();
    }

    // this is for Display Hello World
    public void submitOrder(View view) {
        display("         \n" +
                "        boolean greenLight = true;\n" +
                "\n" +
                "        if (greenLight){\n" +
                "            System.out.println(\"Drive\");\n" +
                "        }");

        // Code for Log Out
        boolean greenLight = true;

        if (greenLight){
            System.out.println("Drive");
        }


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
