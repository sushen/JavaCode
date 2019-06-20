package com.sushenbiswas.javacode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityFunction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_function);

        goToMain();
    }

    // this is for Display if Else statement
    public void submitOrder(View view) {
        display("    // Code for Log Out\n" +
                "    public void playMusic(){\n" +
                "        boolean playButton = true;\n" +
                "        if(playButton){\n" +
                "            System.out.println(\"Music is playing\");\n" +
                "        }else {\n" +
                "            System.out.println(\"Music is paused\");\n" +
                "        }\n" +
                "    }");
        // I Call The playMusic Function here
        playMusic();
    }

    // I Defune playMusic function here
    public void playMusic(){
        boolean playButton = true;
        if(playButton){
            System.out.println("Music is playing");
        }else {
            System.out.println("Music is paused");
        }
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
