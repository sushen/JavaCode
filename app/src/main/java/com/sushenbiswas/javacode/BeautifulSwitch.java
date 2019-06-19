package com.sushenbiswas.javacode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class BeautifulSwitch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beautiful_switch);
        goToMain();
    }

    // this is for Display Hello World
    public void submitOrder(View view) {
        display("//Complete this switch statement by 1) writing the last case (case 12), so that it prints out \"December\"\n" +
                "// and 2) writing a default case that for any month number not between 1 and 12, will print out \"Invalid month\"\n" +
                "\n" +
                "        int month = 2; // should be a number 1-12\n" +
                "        String monthString;\n" +
                "\n" +
                "        switch(month) {\n" +
                "            case 1: monthString = \"January\";\n" +
                "                break;\n" +
                "            case 2: monthString = \"February\";\n" +
                "                break;\n" +
                "            case 3: monthString = \"March\";\n" +
                "                break;\n" +
                "            case 4: monthString = \"April\";\n" +
                "                break;\n" +
                "            case 5: monthString = \"May\";\n" +
                "                break;\n" +
                "            case 6: monthString = \"June\";\n" +
                "                break;\n" +
                "            case 7: monthString = \"July\";\n" +
                "                break;\n" +
                "            case 8: monthString = \"August\";\n" +
                "                break;\n" +
                "            case 9: monthString = \"September\";\n" +
                "                break;\n" +
                "            case 10: monthString = \"October\";\n" +
                "                break;\n" +
                "            case 11: monthString = \"November\";\n" +
                "                break;\n" +
                "            case 12: monthString = \"December\";\n" +
                "                break;\n" +
                "            default: monthString = \"Invalid month\";\n" +
                "                break;\n" +
                "        }\n" +
                "        System.out.println(monthString);");

//Complete this switch statement by 1) writing the last case (case 12), so that it prints out "December"
// and 2) writing a default case that for any month number not between 1 and 12, will print out "Invalid month"

        int month = 2; // should be a number 1-12
        String monthString;

        switch(month) {
            case 1: monthString = "January";
                break;
            case 2: monthString = "February";
                break;
            case 3: monthString = "March";
                break;
            case 4: monthString = "April";
                break;
            case 5: monthString = "May";
                break;
            case 6: monthString = "June";
                break;
            case 7: monthString = "July";
                break;
            case 8: monthString = "August";
                break;
            case 9: monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            default: monthString = "Invalid month";
                break;
        }
        System.out.println(monthString);
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
