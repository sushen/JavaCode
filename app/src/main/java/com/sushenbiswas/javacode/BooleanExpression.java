package com.sushenbiswas.javacode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class BooleanExpression extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boolean_expression);
        goToMain();
    }

    // this is for Display if Else statement
    public void submitOrder(View view) {
        display("// Code for Log Out\n" +
                "        int ticketPrice =10;\n" +
                "        int age = 70;\n" +
                "        boolean isStudent = false;\n" +
                "\n" +
                "        if(age <= 15){\n" +
                "            ticketPrice = 5;\n" +
                "            System.out.println(\"Child! Give his ticket\");\n" +
                "        }else if(age > 60){\n" +
                "            ticketPrice = 5;\n" +
                "            System.out.println(\"Senior Citizen! Give his ticket\");\n" +
                "        }else if(isStudent){\n" +
                "            ticketPrice = 5;\n" +
                "            System.out.println(\"Student! Give his ticket\");\n" +
                "        }else System.out.println(\"Just Give his ticket\");\n" +
                "    }");

        // Code for Log Out
        int ticketPrice =10;
        int age = 70;
        boolean isStudent = false;

        if(age <= 15){
            ticketPrice = 5;
            System.out.println("Child! Give his ticket");
        }else if(age > 60){
            ticketPrice = 5;
            System.out.println("Senior Citizen! Give his ticket");
        }else if(isStudent){
            ticketPrice = 5;
            System.out.println("Student! Give his ticket");
        }else System.out.println("Just Give his ticket");
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
