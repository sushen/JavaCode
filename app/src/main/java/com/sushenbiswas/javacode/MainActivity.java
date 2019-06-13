package com.sushenbiswas.javacode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configureNextButton();
        configureGoToPrintLine();

    }


    // This is for Go to Hello World
    private void configureNextButton(){
        Button nextButton = (Button) findViewById(R.id.goToHelloWorld);
        nextButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.i("MyApps","I am happy");
                Toast.makeText(getApplicationContext(),"Cheers! Cheers ! It a good day",Toast.LENGTH_SHORT)
                .show();

            // Lonch The Hello World Activety
                Intent intent = new Intent(MainActivity.this,HelloWorld.class);
                startActivity(intent);
            }
        });
    }

    // This is for Go to Print Line
    private void configureGoToPrintLine(){
        Button nextButton = (Button) findViewById(R.id.goToPrintLine);
        nextButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.i("MyApps","I am happy");
                Toast.makeText(getApplicationContext(),"Cheers! Cheers ! It a good day",Toast.LENGTH_SHORT)
                        .show();

                // Lonch The Hello World Activety
                Intent intent = new Intent(MainActivity.this,PrintLine.class);
                startActivity(intent);
            }
        });
    }
}
