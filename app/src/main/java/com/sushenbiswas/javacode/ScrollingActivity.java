package com.sushenbiswas.javacode;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ScrollingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        goToMain();
        configureNestedIfStatements();
        configureSwitchStatement();
        configureBeautifulSwitch();
        configureFunction();
        configureVariableAsArgument();
        configureMultipleParamiter();
        configureReturnValue();

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

    // This is for Go to Nasted If Statements
    private void configureNestedIfStatements(){
        Button nextButton = (Button) findViewById(R.id.goToNestedIfStatements);
        nextButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.i("MyApps","I am happy");
                Toast.makeText(getApplicationContext(),"I am in Nasted If Statements",Toast.LENGTH_SHORT)
                        .show();

                // Lonch The Print Line Activety
                Intent intent = new Intent(ScrollingActivity.this,NastedIf.class);
                startActivity(intent);
            }
        });
    }
    // This is for Go to Switch Statements
    private void configureSwitchStatement(){
        Button nextButton = (Button) findViewById(R.id.goToSwitchStatement);
        nextButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.i("MyApps","I am happy");
                Toast.makeText(getApplicationContext(),"I am in Switch Statements",Toast.LENGTH_SHORT)
                        .show();

                // Lonch The Print Line Activety
                Intent intent = new Intent(ScrollingActivity.this,SwitchStatement.class);
                startActivity(intent);
            }
        });
    }
    // This is for Go to Beautiful Switch
    private void configureBeautifulSwitch(){
        Button nextButton = (Button) findViewById(R.id.goToBeautifulSwitch);
        nextButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.i("MyApps","I am happy");
                Toast.makeText(getApplicationContext(),"I am in Beautiful Switch",Toast.LENGTH_SHORT)
                        .show();

                // Lonch The Print Line Activety
                Intent intent = new Intent(ScrollingActivity.this,BeautifulSwitch.class);
                startActivity(intent);
            }
        });
    }
    // This is for Go to Function
    private void configureFunction(){
        Button nextButton = (Button) findViewById(R.id.goToFunction);
        nextButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.i("MyApps","I am happy");
                Toast.makeText(getApplicationContext(),"I am in Function",Toast.LENGTH_SHORT)
                        .show();

                // Lonch The Print Line Activety
                Intent intent = new Intent(ScrollingActivity.this,ActivityFunction.class);
                startActivity(intent);
            }
        });
    }

    // This is for Go to Variable As Argument
    private void configureVariableAsArgument(){
        Button nextButton = (Button) findViewById(R.id.goVariableAsArgument);
        nextButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.i("MyApps","I am happy");
                Toast.makeText(getApplicationContext(),"I am in Variable As Argument",Toast.LENGTH_SHORT)
                        .show();

                // Lonch The Print Line Activety
                Intent intent = new Intent(ScrollingActivity.this,VariableAsArgument.class);
                startActivity(intent);
            }
        });
    }
    // This is for Go to Multiple Paramiter
    private void configureMultipleParamiter(){
        Button nextButton = (Button) findViewById(R.id.goMultipleParamiter);
        nextButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.i("MyApps","I am happy");
                Toast.makeText(getApplicationContext(),"I am in Multiple Paramiter",Toast.LENGTH_SHORT)
                        .show();

                // Lonch The Multiple Parimiter Activety
                Intent intent = new Intent(ScrollingActivity.this,MultipleParamiter.class);
                startActivity(intent);
            }
        });
    }
    // This is for Go to Return Value
    private void configureReturnValue(){
        Button nextButton = (Button) findViewById(R.id.goReturnValue);
        nextButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.i("MyApps","I am happy");
                Toast.makeText(getApplicationContext(),"I am in Return Value",Toast.LENGTH_SHORT)
                        .show();

                // Lonch The Multiple Parimiter Activety
                Intent intent = new Intent(ScrollingActivity.this,ReturnValue.class);
                startActivity(intent);
            }
        });
    }
}
