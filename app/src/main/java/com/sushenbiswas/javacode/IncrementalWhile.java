package com.sushenbiswas.javacode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class IncrementalWhile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incremental_while);

        goToMain();
    }

    // this is for Display if Else statement
    public void submitOrder(View view) {
        display("    // This is Incrimental While Loop\n" +
                "    public void raiseAlarm(int numberOfWorning){\n" +
                "        int i = 1;\n" +
                "        while (i <= numberOfWorning){\n" +
                "            System.out.println(\"Warning!\");\n" +
                "            i++;\n" +
                "        }\n" +
                "    }" +
                "        // Call Incrimental While Loop\n" +
                "        raiseAlarm(12);");

        // Call Incrimental While Loop
        raiseAlarm(2);

    }


    // This is Incrimental While Loop
    public void raiseAlarm(int numberOfWorning){
        int i = 1;
        while (i <= numberOfWorning){
            System.out.println("Warning!");
            i++;
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
