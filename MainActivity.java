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
        View button1 = findViewById(R.id.kgtog);
        View button2 = findViewById(R.id.poundtokg);
        View button3 = findViewById(R.id.mtocm);
        View button4 = findViewById(R.id.Cmtom);
        View button5 = findViewById(R.id.cmtoinch);
        View button6 = findViewById(R.id.inchtocm);
        View button7 = findViewById(R.id.gtokg);
        View button8 = findViewById(R.id.inchtom);
        View button9 = findViewById(R.id.mtoinch);

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
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Converted!!", Toast.LENGTH_SHORT).show();
                String s = editText.getText().toString();
                int newinch1 = Integer.parseInt(s);
                double result1 = newinch1*2.54;
                textView.setText("The Corresponding Value In Cm Is "+ result1);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Converted!!", Toast.LENGTH_SHORT).show();
                String s = editText.getText().toString();
                int newg1 = Integer.parseInt(s);
                double result1 = newg1*0.001;
                textView.setText("The Corresponding Value In Kg Is "+ result1);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Converted!!", Toast.LENGTH_SHORT).show();
                String s = editText.getText().toString();
                int newinch1 = Integer.parseInt(s);
                double result1 = newinch1*0.0254;
                textView.setText("The Corresponding Value In M Is "+ result1);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Converted!!", Toast.LENGTH_SHORT).show();
                String s = editText.getText().toString();
                int newm2 = Integer.parseInt(s);
                double result1 = newm2*39.3701;
                textView.setText("The Corresponding Value In Inches Is "+ result1);
            }
        });

    }
}
