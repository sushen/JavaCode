package com.sushenbiswas.javacode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        goToMain();

        configureInfiniteLoop();
        configureIncrementalWhile();
        configureIncrementalForLoop();
        configureLoopCounter();
        configureRandomResultForLoop();
        configurePyramidBlockCount();
        configureDecrimentalLoop();
        configureBreak();
        configuregoToActivety4();

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

    // This is for Go to Next page
    private void configuregoToActivety4(){
        Button nextButton = (Button) findViewById(R.id.goToActivety4);
        nextButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.i("MyApps","I am happy");
                Toast.makeText(getApplicationContext(),"I am in Activety 3",Toast.LENGTH_SHORT)
                        .show();

                // Lonch The Print Line Activety
                Intent intent = new Intent(Main3Activity.this,Main4Activity.class);
                startActivity(intent);
            }
        });
    }

    // This is for Go to Logical Operator
    private void configureInfiniteLoop() {
        Button nextButton = (Button) findViewById(R.id.goInfiniteLoop);
        nextButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.i("MyApps", "I am happy");
                Toast.makeText(getApplicationContext(), "I am in Logical Operator", Toast.LENGTH_SHORT)
                        .show();

                // Lonch The Print Line Activety
                Intent intent = new Intent(Main3Activity.this, InfiniteLoop.class);
                startActivity(intent);
            }
        });
    }

    // This is for Go to Incremental While
    private void configureIncrementalWhile(){
        Button nextButton = (Button) findViewById(R.id.goIncrementalWhile);
        nextButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.i("MyApps","I am happy");
                Toast.makeText(getApplicationContext(),"I am in Incremental While",Toast.LENGTH_SHORT)
                        .show();

                // Lonch The Multiple Parimiter Activety
                Intent intent = new Intent(Main3Activity.this,IncrementalWhile.class);
                startActivity(intent);
            }
        });
    }
    // This is for Go to Incremental For Loop
    private void configureIncrementalForLoop(){
        Button nextButton = (Button) findViewById(R.id.goIncrementalForLoop);
        nextButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.i("MyApps","I am happy");
                Toast.makeText(getApplicationContext(),"I am in Incremental For Loop",Toast.LENGTH_SHORT)
                        .show();

                // Lonch The Multiple Parimiter Activety
                Intent intent = new Intent(Main3Activity.this,IncrimentalForLoop.class);
                startActivity(intent);
            }
        });
    }
    // This is for Go to Loop Counter
    private void configureLoopCounter(){
        Button nextButton = (Button) findViewById(R.id.goLoopCounter);
        nextButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.i("MyApps","I am happy");
                Toast.makeText(getApplicationContext(),"I am in Loop Counter",Toast.LENGTH_SHORT)
                        .show();

                // Lonch The Multiple Parimiter Activety
                Intent intent = new Intent(Main3Activity.this,LoopCounter.class);
                startActivity(intent);
            }
        });
    }
    // This is for Go to Random Result For Loop
    private void configureRandomResultForLoop(){
        Button nextButton = (Button) findViewById(R.id.goRandomResultForLoop);
        nextButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.i("MyApps","I am happy");
                Toast.makeText(getApplicationContext(),"I am in Random Result For Loop",Toast.LENGTH_SHORT)
                        .show();

                // Lonch The Multiple Parimiter Activety
                Intent intent = new Intent(Main3Activity.this,RandomResultForLoop.class);
                startActivity(intent);
            }
        });
    }
    // This is for Go to Pyramid Block Count
    private void configurePyramidBlockCount(){
        Button nextButton = (Button) findViewById(R.id.goPyramidBlockCount);
        nextButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.i("MyApps","I am happy");
                Toast.makeText(getApplicationContext(),"I am in Pyramid Block Count",Toast.LENGTH_SHORT)
                        .show();

                // Lonch The Multiple Parimiter Activety
                Intent intent = new Intent(Main3Activity.this,PyramidBlockCount.class);
                startActivity(intent);
            }
        });
    }
    // This is for Go to Decrimental Loop
    private void configureDecrimentalLoop(){
        Button nextButton = (Button) findViewById(R.id.goDecrimentalLoop);
        nextButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.i("MyApps","I am happy");
                Toast.makeText(getApplicationContext(),"I am in Decrimental Loop",Toast.LENGTH_SHORT)
                        .show();

                // Lonch The Multiple Parimiter Activety
                Intent intent = new Intent(Main3Activity.this,DecrimentalLoop.class);
                startActivity(intent);
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
                Intent intent = new Intent(Main3Activity.this,Break.class);
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
                Intent intent = new Intent(Main3Activity.this,Arrays.class);
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
                Intent intent = new Intent(Main3Activity.this,RandomResultArrays.class);
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
                Intent intent = new Intent(Main3Activity.this,ArraysAndLoop.class);
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
                Intent intent = new Intent(Main3Activity.this,ArrayBound.class);
                startActivity(intent);
            }
        });
    }


}