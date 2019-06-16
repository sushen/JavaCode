package com.sushenbiswas.javacode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class exampleInteger extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_integer);
        goToMain();
    }

    // this is for Display Hello World
    public void submitOrder(View view) {
        display("        /* Your friend seems to be really good at music, \n" +
                "he managed to score 96% on his final exam!\n" +
                "Now that you know all 5 subject grades, \n" +
                "update the average calculation below to calculate the \n" +
                "total average of all subjects. */\n" +
                "\n" +
                "        double maths=97.5;\n" +
                "        double english=98;\n" +
                "        double science=83.5;\n" +
                "        double drama=75;\n" +
                "        double music = 96;\n" +
                "        double sum=maths+english+science+drama+music;\n" +
                "        double average=sum/5;\n" +
                "        System.out.println(average);\n" +
                "        To See Result View The Log");

        /* Your friend seems to be really good at music,
he managed to score 96% on his final exam!
Now that you know all 5 subject grades,
update the average calculation below to calculate the
total average of all subjects. */

        double maths=97.5;
        double english=98;
        double science=83.5;
        double drama=75;
        double music = 96;
        double sum=maths+english+science+drama+music;
        double average=sum/5;
        System.out.println(average);
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
