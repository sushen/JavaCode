package com.sushenbiswas.javacode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MultipleParamiter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_paramiter);

        goToMain();
    }

    // this is for Display if Else statement
    public void submitOrder(View view) {
        display("    // I Defune Variable Paramiter function here\n" +
                "    public static void printPhoto(int width, int hight, boolean inColor){\n" +
                "        System.out.println(\"Width \" + width + \" cm\");\n" +
                "        System.out.println(\"Hight \" + hight + \" cm\");\n" +
                "        if (inColor){\n" +
                "            System.out.println(\"Print is full color\");\n" +
                "        }else {\n" +
                "            System.out.println(\"Print is Black and White\");\n" +
                "        }\n" +
                "    }" +
                "        // I Call The Variable degree Celcious a argument to the Function weatherInterprater\n" +
                "        printPhoto(40,60,false);");
        // I Call The Multiple Paramiter here
        printPhoto(40,60,false);

        // Another Multiple Pramiter Call
        likePhoto(100, "Mango People", true);
    }

    // I Defune Multiple Paramiter function here
    public static void printPhoto(int width, int hight, boolean inColor){
        System.out.println("Width " + width + " cm");
        System.out.println("Hight " + hight + " cm");
        if (inColor){
            System.out.println("Print is full color");
        }else {
            System.out.println("Print is Black and White");
        }
    }
    // Another Multiple Pramiter
    public void likePhoto(int currentLike, String comment, boolean like){
        System.out.println("Feedback: "+ currentLike);
        if (like){
            currentLike = currentLike +1;
        }
        System.out.println("Number of Lile " + currentLike);
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
