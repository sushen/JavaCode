package com.sushenbiswas.javacode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ReturnValue extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_return_value);

        goToMain();
    }

    // this is for Display if Else statement
    public void submitOrder(View view) {
        display("    // I Defune Return Value function here\n" +
                "    public String admission(double hight){\n" +
                "        String passText;\n" +
                "        if (hight>120){\n" +
                "            passText = \"You pass the height Requirements\";\n" +
                "        }else {\n" +
                "            passText = \"Sorry, you don not pass\";\n" +
                "        }\n" +
                "        return passText;\n" +
                "    }" +
                "        // I Call The Return Value\n" +
                "        String MamunHight = admission(122);\n" +
                "        System.out.println(MamunHight);");

        // I Call The Return Value
        String MamunHight = admission(122);
        System.out.println(MamunHight);

    }

    // I Defune Return Value function here
    public String admission(double hight){
        String passText;
        if (hight>120){
            passText = "You pass the height Requirements";
        }else {
            passText = "Sorry, you don not pass";
        }
        return passText;
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