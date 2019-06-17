package com.sushenbiswas.javacode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class NastedIf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nasted_if);

        goToMain();
    }

    // this is for Display if Else statement
    public void submitOrder(View view) {
        display("// Code for Log Out\n" +
                "        int ticketPrice =10;\n" +
                "        int age = 70;\n" +
                "        boolean isStudent = false;\n" +
                "\n" +
                "        if(age <= 15 || age > 60 || isStudent){\n" +
                "            ticketPrice = 5;\n" +
                "            System.out.println(\"Give him a Discount\");\n" +
                "        }");

        // Code for Log Out
        boolean action = true;
        boolean romance = true;
        boolean comedy = true;
        boolean horor = false;

        if (action && romance){
            System.out.println(" This is a romantic action move");
            if(comedy || horor){
                System.out.println("This is a horor comedy move.");
            }
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
