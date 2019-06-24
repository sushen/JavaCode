package com.sushenbiswas.javacode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ReturnValueInt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_return_value_int);

        goToMain();
    }

    // this is for Display if Else statement
    public void submitOrder(View view) {
        display("    // I Defune Number Return Value function here\n" +
                "    public double makeChange(double itemCost, double dollarsProvided){\n" +
                "        double change = dollarsProvided-itemCost;\n" +
                "        return change;\n" +
                "    };" +
                "        // I Call The Number Return Value Function\n" +
                "        double backMoney = makeChange(50,110);\n" +
                "        System.out.println(backMoney);");

        // I Call The Number Return Value Function
        double backMoney = makeChange(50,110);
        System.out.println(backMoney);


    }

    // I Defune Number Return Value function here
    public double makeChange(double itemCost, double dollarsProvided){
        double change = dollarsProvided-itemCost;
        return change;
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