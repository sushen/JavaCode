package com.sushenbiswas.javacode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PyramidBlockCount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pyramid_block_count);

        goToMain();
    }

    // this is for Display if Else statement
    public void submitOrder(View view) {
        display("    // This is pyramid Block Count Function\n" +
                "\n" +
                "    public int countBlocks(int levels){\n" +
                "        int total = 0;\n" +
                "        for (int i=1;i<=levels;i++){\n" +
                "            total = total+(i*i);\n" +
                "        }\n" +
                "        return total;\n" +
                "    }" +
                "        // Call Pyramid Block Count Function\n" +
                "        int pyramidLevelCount = countBlocks(4);\n" +
                "        System.out.println(pyramidLevelCount + \" block stone needed to build this pyramid\");");

        // Call Pyramid Block Count Function
        int pyramidLevelCount = countBlocks(4);
        System.out.println(pyramidLevelCount + " block stone needed to build this pyramid");
    }

    // This is pyramid Block Count Function

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