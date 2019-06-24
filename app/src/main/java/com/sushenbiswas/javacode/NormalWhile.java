package com.sushenbiswas.javacode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class NormalWhile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_while);
        goToMain();
    }

    // this is for Display if Else statement
    public void submitOrder(View view) {
        display("    // This is for Check Alarm\n" +
                "    public int googleLength(){\n" +
                "        String google = \"1\";\n" +
                "        int len = google.length();\n" +
                "        while(len < 101){\n" +
                "            google = google + \"0\";\n" +
                "            len = google.length();\n" +
                "            System.out.println(len);\n" +
                "        }\n" +
                "        return len;\n" +
                "    }" +
                "        // Call Length finder While loop\n" +
                "        googleLength();");

        // Call Length finder While loop
        googleLength();
    }
    // This is Length finging While loop
    public int googleLength(){
        String google = "1";
        int len = google.length();
        while(len < 101){
            google = google + "0";
            len = google.length();
            System.out.println(len);
        }
        return len;
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