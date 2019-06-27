package com.sushenbiswas.javacode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class InfiniteLoop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infinite_loop);

        goToMain();
    }

    // this is for Display if Else statement
    public void submitOrder(View view) {
        display("    // This is Infinite Loop\n" +
                "    // If you run it it will hang your computer\n" +
                "    public void raiseAlarm(int numberOfWorning){\n" +
                "        for (int i = 1; i <= numberOfWorning; i++){\n" +
                "            i = i - 1;\n" +
                "            System.out.println(\"Warning! \" + i);\n" +
                "        }\n" +
                "    }" +
                "        // Call Infinite Loop\n" +
                "        raiseAlarm(5);\n");

        // Call Infinite Loop
//        raiseAlarm(5);
        int pyramidLevelCount = countBlocks(4);
        System.out.println(pyramidLevelCount);
    }

    // This is Infinite Loop
    // If you run it it will hang your computer

//    public void raiseAlarm(int numberOfWorning){
//        for (int i = 1; i <= numberOfWorning; i++){
//            i = i - 1;
//            System.out.println("Warning! " + i);
//        }
//    }

    public int countBlocks(int levels){
        int total = 0;
        for (int i=1;i<=levels;i++){
            total = total+(i*i);
        }
        return total;
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
