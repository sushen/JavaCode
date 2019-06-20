package com.sushenbiswas.javacode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configureNextButton();
        configureGoToPrintLine();
        configureGoToVariables();
        configureGoToInteger();
        configureGoToBoolean();
        configureGoToIfElse();
        configureBooleanExpression();
        configureLogicalOperator();
        configureNestedIfStatements();
        configureSwitchStatement();
        configureBeautifulSwitch();
        configureFunction();
        configureVariableParamiter();
        configureSxrolling();

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
                Toast.makeText(getApplicationContext(),"I am in Print Line",Toast.LENGTH_SHORT)
                        .show();

                // Lonch The Print Line Activety
                Intent intent = new Intent(MainActivity.this,PrintLine.class);
                startActivity(intent);
            }
        });
    }

    // This is for Go to Variable
    private void configureGoToVariables(){
        Button nextButton = (Button) findViewById(R.id.goToVariables);
        nextButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.i("MyApps","I am happy");
                Toast.makeText(getApplicationContext(),"I am in Variable",Toast.LENGTH_SHORT)
                        .show();

                // Lonch The Print Line Activety
                Intent intent = new Intent(MainActivity.this,ActivityVariables.class);
                startActivity(intent);
            }
        });
    }
    // This is for Go to Integer
    private void configureGoToInteger(){
        Button nextButton = (Button) findViewById(R.id.goToInteget);
        nextButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.i("MyApps","I am happy");
                Toast.makeText(getApplicationContext(),"I am in Variable",Toast.LENGTH_SHORT)
                        .show();

                // Lonch The Print Line Activety
                Intent intent = new Intent(MainActivity.this,exampleInteger.class);
                startActivity(intent);
            }
        });
    }
    // This is for Go to Boolean
    private void configureGoToBoolean(){
        Button nextButton = (Button) findViewById(R.id.goToBoolean);
        nextButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.i("MyApps","I am happy");
                Toast.makeText(getApplicationContext(),"I am in Variable",Toast.LENGTH_SHORT)
                        .show();

                // Lonch The Print Line Activety
                Intent intent = new Intent(MainActivity.this,CodeBoolean.class);
                startActivity(intent);
            }
        });
    }
    // This is for Go to IfElse
    private void configureGoToIfElse(){
        Button nextButton = (Button) findViewById(R.id.goToIfElse);
        nextButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.i("MyApps","I am happy");
                Toast.makeText(getApplicationContext(),"I am in IfElse",Toast.LENGTH_SHORT)
                        .show();

                // Lonch The Print Line Activety
                Intent intent = new Intent(MainActivity.this,CodeIfEalse.class);
                startActivity(intent);
            }
        });
    }
    // This is for Go to Boolean Expression
    private void configureBooleanExpression(){
        Button nextButton = (Button) findViewById(R.id.goToBooleanExpression);
        nextButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.i("MyApps","I am happy");
                Toast.makeText(getApplicationContext(),"I am in oolean Expression",Toast.LENGTH_SHORT)
                        .show();

                // Lonch The Print Line Activety
                Intent intent = new Intent(MainActivity.this,BooleanExpression.class);
                startActivity(intent);
            }
        });
    }
    // This is for Go to Logical Operator
    private void configureLogicalOperator(){
        Button nextButton = (Button) findViewById(R.id.goToLogicalOperator);
        nextButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.i("MyApps","I am happy");
                Toast.makeText(getApplicationContext(),"I am in Logical Operator",Toast.LENGTH_SHORT)
                        .show();

                // Lonch The Print Line Activety
                Intent intent = new Intent(MainActivity.this,LogicalOperator.class);
                startActivity(intent);
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
                Intent intent = new Intent(MainActivity.this,NastedIf.class);
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
                Intent intent = new Intent(MainActivity.this,SwitchStatement.class);
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
                Intent intent = new Intent(MainActivity.this,BeautifulSwitch.class);
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
                Intent intent = new Intent(MainActivity.this,ActivityFunction.class);
                startActivity(intent);
            }
        });
    }
    // This is for Go to Variable Paramiter
    private void configureVariableParamiter(){
        Button nextButton = (Button) findViewById(R.id.goToVariableParamiter);
        nextButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.i("MyApps","I am happy");
                Toast.makeText(getApplicationContext(),"I am in Function",Toast.LENGTH_SHORT)
                        .show();

                // Lonch The Print Line Activety
                Intent intent = new Intent(MainActivity.this,ActivityVariableParimiter.class);
                startActivity(intent);
            }
        });
    }
    // This is for Go to Next page
    private void configureSxrolling(){
        Button nextButton = (Button) findViewById(R.id.goToScrolling);
        nextButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.i("MyApps","I am happy");
                Toast.makeText(getApplicationContext(),"I am in Scrolling Page",Toast.LENGTH_SHORT)
                        .show();

                // Lonch The Print Line Activety
                Intent intent = new Intent(MainActivity.this,ScrollingActivity.class);
                startActivity(intent);
            }
        });
    }
}
