package com.sushenbiswas.javacode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DecrimentalLoop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decrimental_loop);

        goToMain();
    }

    // this is for Display if Else statement
    public void submitOrder(View view) {
        display("    // This is Decrimental Loop\n" +
                "    public int DecrimentalLoop() {\n" +
                "        int x = 0;\n" +
                "        for (int i = 5; i >= 1; i--){\n" +
                "            System.out.println(i);\n" +
                "        }\n" +
                "        return x;\n" +
                "    }\n" +
                "        // Call Decrimental Loop Function\n" +
                "        DecrimentalLoop();");

        // Call Decrimental Loop Function
        DecrimentalLoop(6);

    }

    // This is Decrimental Loop
    public int DecrimentalLoop(int numberInput) {
        int x = 0;
        for (int i = numberInput; i >= 1; i--){
            System.out.println(i);
        }
        return x;
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
