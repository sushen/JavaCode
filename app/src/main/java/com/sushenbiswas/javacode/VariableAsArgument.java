package com.sushenbiswas.javacode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class VariableAsArgument extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_variable_as_argument);

        goToMain();
    }

    // this is for Display if Else statement
    public void submitOrder(View view) {
        display("    // I Defune  function here\n" +
                "    public static void weatherInterprater(int temprature){\n" +
                "        if (temprature > 30){\n" +
                "            System.out.println(\"Its too hot outside.\");\n" +
                "        }else if (temprature < 5){\n" +
                "            System.out.println(\"Brr, consider waring a jacket.\");\n" +
                "        }else {\n" +
                "            System.out.println(\"Not too hot, Not too cold.\");\n" +
                "        }\n" +
                "    }" +
                "// I Call The Variable degree Celcious a argument to the Function weatherInterprater\n" +
                "        int degreeCelcious = 32;\n" +
                "        weatherInterprater(degreeCelcious);");
        // I Call The Variable degree Celcious a argument to the Function weatherInterprater
        int degreeCelcious = 32;
        weatherInterprater(degreeCelcious);
    }

    // I Defune Variable Paramiter function here
    public static void weatherInterprater(int temprature){
        if (temprature > 30){
            System.out.println("Its too hot outside.");
        }else if (temprature < 5){
            System.out.println("Brr, consider waring a jacket.");
        }else {
            System.out.println("Not too hot, Not too cold.");
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


