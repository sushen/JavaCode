package com.sushenbiswas.javacode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Arrays extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arrays);

        goToMain();
    }

    // this is for Display if Else statement
    public void submitOrder(View view) {
        display("    // This is Arrays\n" +
                "\n" +
                "    public void arrayFunctionExample(){\n" +
                "        // This Single line is the example of Arrays\n" +
                "        String [] newsOutlet = {\"abc\",\"bbc\",\"CNN\",\"CBS\",\"AP\",\"NBA\",\"FOX\",\"npr\",\"sky\",\"Aljazeera\"};\n" +
                "\n" +
                "        //This line is for Output Log here I call newsOutlet[0]\n" +
                "        System.out.println(newsOutlet[1]);\n" +
                "    }" +
                "        // Call Array Functioon\n" +
                "        arrayFunctionExample();");

        // Call Array Functioon
        arrayFunctionExample();

    }



    // This is Arrays

    public void arrayFunctionExample(){
        // This Single line is the example of Arrays
        String [] newsOutlet = {"abc","bbc","CNN","CBS","AP","NBA","FOX","npr","sky","Aljazeera"};

        //This line is for Output Log here I call newsOutlet[0]
        System.out.println(newsOutlet[1]);
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
