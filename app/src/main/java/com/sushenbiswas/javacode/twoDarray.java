package com.sushenbiswas.javacode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class twoDarray extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_darray);

        goToMain();
    }

    // this is for Display if Else statement
    public void submitOrder(View view) {
        display("");

    // Call 2d Array Function
        int studentGread [][] = {{45,42,97,54,56},{44,45,94,53,57},{45,46,67,54,56},{44,45,94,59,57},{45,46,87,54,56}};
        studentAverage(studentGread,5);

    }
    // This is 2d Array
    public static double studentAverage(int [][] grage, int student){
        int total = 0;
        int subject = grage.length;
        for (int i =0; i<subject; i++){
         total+=grage[i][student];
        }
        double average = total/(double)subject;
        return average;
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
