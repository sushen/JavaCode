package com.sushenbiswas.javacode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class NestedLoopWith2dArrays extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nested_loop_with2d_arrays);

        goToMain();
    }

    // this is for Display if Else statement
    public void submitOrder(View view) {
        display("    // This is Nested Loops\n" +
                "    public void nestedLoopsWith2dArrsys(){\n" +
                "        int total = 0;\n" +
                "\n" +
                "        for(int i = 0; i <3 ; i++){\n" +
                "            for (int j = 0; j <3; j++){\n" +
                "                total += grades[i][j];\n" +
                "            }\n" +
                "        }\n" +
                "    }" +
                "" +
                "        // Call Nested Loops with 2d Arrays Function \n" +
                "        nestedLoopsWith2dArrsys();");

//        // Call Nested Loops with 2d Arrays Function
//        nestedLoopsWith2dArrsys();

    }
    // This is Nested Loops with 2d Arrays
//    public void nestedLoopsWith2dArrsys(){
//        int total = 0;
//
//        for(int i = 0; i <3 ; i++){
//            for (int j = 0; j <3; j++){
//                total += grades[i][j];
//            }
//        }
//    }


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
