package com.sushenbiswas.javacode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        goToMain();

        configureArrays();
        configureRandomResultArrays();
        configureArraysAndLoop();
        configureArrayBound();
        configuregoToActivety5();
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


    // This is for Go to Break
    private void configureBreak(){
        Button nextButton = (Button) findViewById(R.id.goBreak);
        nextButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.i("MyApps","I am happy");
                Toast.makeText(getApplicationContext(),"I am in Break",Toast.LENGTH_SHORT)
                        .show();

                // Lonch The Multiple Parimiter Activety
                Intent intent = new Intent(Main4Activity.this,Break.class);
                startActivity(intent);
            }
        });
    }
    // This is for Go to Arrays
    private void configureArrays(){
        Button nextButton = (Button) findViewById(R.id.goArrays);
        nextButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.i("MyApps","I am happy");
                Toast.makeText(getApplicationContext(),"I am in Arrays",Toast.LENGTH_SHORT)
                        .show();

                // Lonch The Multiple Parimiter Activety
                Intent intent = new Intent(Main4Activity.this,Arrays.class);
                startActivity(intent);
            }
        });
    }
    // This is for Go to Random Result Using Arrays
    private void configureRandomResultArrays(){
        Button nextButton = (Button) findViewById(R.id.goRandomResultArrays);
        nextButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.i("MyApps","I am happy");
                Toast.makeText(getApplicationContext(),"I am in Result Using Arrays",Toast.LENGTH_SHORT)
                        .show();

                // Lonch The Multiple Parimiter Activety
                Intent intent = new Intent(Main4Activity.this,RandomResultArrays.class);
                startActivity(intent);
            }
        });
    }
    // This is for Go to Arrays and Loop
    private void configureArraysAndLoop(){
        Button nextButton = (Button) findViewById(R.id.goArraysAndLoop);
        nextButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.i("MyApps","I am happy");
                Toast.makeText(getApplicationContext(),"I am in Arrays and Loop",Toast.LENGTH_SHORT)
                        .show();

                // Lonch The Multiple Parimiter Activety
                Intent intent = new Intent(Main4Activity.this,ArraysAndLoop.class);
                startActivity(intent);
            }
        });
    }
    // This is for Go to Arrays Bound
    private void configureArrayBound(){
        Button nextButton = (Button) findViewById(R.id.goArrayBound);
        nextButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.i("MyApps","I am happy");
                Toast.makeText(getApplicationContext(),"I am in Arrays Bound",Toast.LENGTH_SHORT)
                        .show();

                // Lonch The Multiple Parimiter Activety
                Intent intent = new Intent(Main4Activity.this,ArrayBound.class);
                startActivity(intent);
            }
        });
    }

    // This is for Go to Next page
    private void configuregoToActivety5(){
        Button nextButton = (Button) findViewById(R.id.goToActivety5);
        nextButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.i("MyApps","I am happy");
                Toast.makeText(getApplicationContext(),"I am not Creat Yet",Toast.LENGTH_SHORT)
                        .show();

//                // Lonch The Print Line Activety
//                Intent intent = new Intent(Main3Activity.this,Main4Activity.class);
//                startActivity(intent);
            }
        });
    }



}