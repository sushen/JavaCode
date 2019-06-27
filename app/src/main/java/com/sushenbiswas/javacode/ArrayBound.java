package com.sushenbiswas.javacode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ArrayBound extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_bound);

        goToMain();
    }

    // this is for Display if Else statement
    public void submitOrder(View view) {
        display("    // This is Arrays\n" +
                "\n" +
                "    public void calcluteAverage(double [] temprature){\n" +
                "        int size = temprature.length;\n" +
                "        double total = 0;\n" +
                "        for (int i = 0; i < size; i++){\n" +
                "            total += temprature[i];\n" +
                "        }\n" +
                "        double average = total/size;\n" +
                "        System.out.println(average);\n" +
                "        return ;\n" +
                "    }" +
                "        // Call Array Functioon and Calcluting Average\n" +
                "        double [] tempratureInput = {75,78,66,66};\n" +
                "        calcluteAverage(tempratureInput);");

        // Call Array Functioon and Calcluting Average
        double [] tempratureInput = {75,78,66,66};
        calcluteAverage(tempratureInput);
    }



    // This is Arrays fo Calcluting Average
    public void calcluteAverage(double [] temprature){
        int size = temprature.length;
        double total = 0;
        for (int i = 0; i < size; i++){
            total += temprature[i];
        }
        double average = total/size;
        System.out.println(average);
        return ;

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
