package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.kgtopound);
        View button1 = findViewById(R.id.gtokg);
        View button2 = findViewById(R.id.poundtokg);
        View button3 = findViewById(R.id.mtocm);
        View button4 = findViewById(R.id.Cmtom);
        View button5 = findViewById(R.id.cmtoinch);

        textView = findViewById(R.id.textView3);
        editText = findViewById(R.id.editTextText2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Converted!!", Toast.LENGTH_SHORT).show();
              String s = editText.getText().toString();
               int kg = Integer.parseInt(s);
               double pound = kg*2.205;
               textView.setText("The Corresponding Value In Pounds Is "+ pound);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Converted!!", Toast.LENGTH_SHORT).show();
                String s = editText.getText().toString();
                int newkg = Integer.parseInt(s);
                double result1 = newkg*1000;
                textView.setText("The Corresponding Value In Gram Is "+ result1);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Converted!!", Toast.LENGTH_SHORT).show();
                String s = editText.getText().toString();
                int newpound = Integer.parseInt(s);
                double result1 = newpound*0.453592;
                textView.setText("The Corresponding Value In Kg Is "+ result1);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Converted!!", Toast.LENGTH_SHORT).show();
                String s = editText.getText().toString();
                int newm = Integer.parseInt(s);
                double result1 = newm*100;
                textView.setText("The Corresponding Value In Cm Is "+ result1);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Converted!!", Toast.LENGTH_SHORT).show();
                String s = editText.getText().toString();
                int newcm = Integer.parseInt(s);
                double result1 = newcm*0.01;
                textView.setText("The Corresponding Value In M Is "+ result1);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Converted!!", Toast.LENGTH_SHORT).show();
                String s = editText.getText().toString();
                int newcm1 = Integer.parseInt(s);
                double result1 = newcm1*0.393701;
                textView.setText("The Corresponding Value In Inches Is "+ result1);
            }
        });

    }
}