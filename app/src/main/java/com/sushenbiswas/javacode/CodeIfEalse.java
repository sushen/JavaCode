package com.sushenbiswas.javacode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CodeIfEalse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_if_ealse);
        goToMain();
    }

    // this is for Display if Else statement
    public void submitOrder(View view) {
        display("        // Code for Log Out\n" +
                "        boolean greenLight = false;\n" +
                "        boolean yellowLight = true;\n" +
                "\n" +
                "        if (greenLight){\n" +
                "            System.out.println(\"Drive\");\n" +
                "        }\n" +
                "        else if (yellowLight){\n" +
                "            System.out.println(\"Slow Down\");\n" +
                "        }\n" +
                "        else{\n" +
                "            System.out.println(\"Stop\");\n" +
                "        }");

        // Code for Log Out
        boolean greenLight = false;
        boolean yellowLight = true;

        if (greenLight){
            System.out.println("Drive");
        }
        else if (yellowLight){
            System.out.println("Slow Down");
        }
        else{
            System.out.println("Stop");
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
