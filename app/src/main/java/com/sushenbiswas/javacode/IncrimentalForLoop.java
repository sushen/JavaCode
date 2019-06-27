package com.sushenbiswas.javacode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class IncrimentalForLoop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incrimental_for_loop);

        goToMain();
    }

    // this is for Display if Else statement
    public void submitOrder(View view) {
        display("    // This is Incrimental For Loop\n" +
                "    public void raiseAlarm(int numberOfWorning){\n" +
                "        for (int i = 1; i <= numberOfWorning; i++){\n" +
                "            System.out.println(\"Warning!\");\n" +
                "        }\n" +
                "    }" +
                "        // Call Incrimental While Loop\n" +
                "        raiseAlarm(12);");

        // Call Incrimental While Loop
        raiseAlarm(2);

    }


    // This is Incrimental For Loop
    public void raiseAlarm(int numberOfWorning){
        for (int i = 1; i <= numberOfWorning; i++){
            System.out.println("Warning!");
        }
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