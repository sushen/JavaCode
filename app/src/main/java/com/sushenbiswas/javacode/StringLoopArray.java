package com.sushenbiswas.javacode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class StringLoopArray extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string_loop_array);

        goToMain();
    }

    // this is for Display if Else statement
    public void submitOrder(View view) {
        display("    // This is String Arrays Loop Example\n" +
                "    public String findLongestName(String [] names){\n" +
                "        //This is the example of Array bound\n" +
                "        int size = names.length;\n" +
                "        String longestName = names[0];\n" +
                "        for (int i = 1; i<size; i++){\n" +
                "            if (names[i].length() > longestName.length() ){\n" +
                "                longestName = names[i];\n" +
                "            }\n" +
                "        }\n" +
                "        return longestName;\n" +
                "    }" +
                "        // Call String Arrays Loop\n" +
                "        String [] frout = {\"Mango\",\"banana\",\"Jam\",\"Barry\",\"papaya\",\"Jack Frouts\",\"Strawbarry\"};\n" +
                "        System.out.println(findLongestName(frout));");

        // Call String Arrays Loop
        String [] frout = {"Mango","banana","Jam","Barry","papaya","Jack Frouts","Strawbarry"};
        System.out.println(findLongestName(frout));
    }



    // This is String Arrays Loop Example
    public String findLongestName(String [] names){
        //This is the example of Array bound
        int size = names.length;
        String longestName = names[0];
        for (int i = 1; i<size; i++){
            if (names[i].length() > longestName.length() ){
                longestName = names[i];
            }
        }
        return longestName;
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