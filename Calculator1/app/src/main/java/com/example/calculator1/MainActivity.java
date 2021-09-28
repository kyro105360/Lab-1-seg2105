package com.example.calculator1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bu1, bu2, bu3, bu4, bu5, bu6, bu7, bu8, bu9, bu0, budot, divideBTN, plusBTN, minusBTN,
    multiplyBTN, buequal, buclear;

    TextView display;
    double val1, val2;

    enum Operator{none, add, minus, multiply, divide}
    Operator op = Operator.none;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display=findViewById(R.id.editText);
        bu0 = findViewById(R.id.bu0);
        bu1 = findViewById(R.id.bu1);
        bu2 = findViewById(R.id.bu2);
        bu3 = findViewById(R.id.bu3);
        bu4 = findViewById(R.id.bu4);
        bu5 = findViewById(R.id.bu5);
        bu6 = findViewById(R.id.bu6);
        bu7 = findViewById(R.id.bu7);
        bu8 = findViewById(R.id.bu8);
        bu9 = findViewById(R.id.bu9);
        budot = findViewById(R.id.budot);

        divideBTN = findViewById(R.id.divideBTN);
        plusBTN = findViewById(R.id.plusBTN);
        minusBTN = findViewById(R.id.minusBTN);
        multiplyBTN = findViewById(R.id.multiplyBTN);

        buequal = findViewById(R.id.buequal);
        buclear = findViewById(R.id.buclear);

        bu0.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                display.setText(display.getText() + "0");
            }
        });
        bu1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                display.setText(display.getText() + "1");
            }
        });
        bu2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                display.setText(display.getText() + "2");
            }
        });
        bu3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                display.setText(display.getText() + "3");
            }
        });
        bu4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                display.setText(display.getText() + "4");
            }
        });
        bu5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                display.setText(display.getText() + "5");
            }
        });
        bu6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                display.setText(display.getText() + "6");
            }
        });
        bu7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                display.setText(display.getText() + "7");
            }
        });
        bu8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                display.setText(display.getText() + "8");
            }
        });
        bu9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                display.setText(display.getText() + "9");
            }
        });
        budot.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (!display.getText().toString().contains(".") && !display.getText().toString().isEmpty())
                    display.setText(display.getText() + ".");
            }
        });
        buclear.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                val1 = 0;
                val2 = 0;
                display.setText("");
                op = Operator.none;
            }
        });
        divideBTN.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                op = Operator.divide;
                if (!display.getText().toString().isEmpty())
                    val1 = Double.parseDouble(display.getText().toString());
                display.setText("");
            }
        });
        multiplyBTN.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                op = Operator.multiply;
                if (!display.getText().toString().isEmpty())
                    val1 = Double.parseDouble(display.getText().toString());
                display.setText("");
            }
        });
        plusBTN.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                op = Operator.add;
                if (!display.getText().toString().isEmpty())
                    val1 = Double.parseDouble(display.getText().toString());
                display.setText("");
            }
        });
        minusBTN.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                op = Operator.minus;
                if (!display.getText().toString().isEmpty())
                    val1 = Double.parseDouble(display.getText().toString());
                display.setText("");
            }
        });
        buequal.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (!display.getText().toString().isEmpty()) {
                    val2 = Double.parseDouble(display.getText().toString());
                    if (op == Operator.minus)
                        display.setText(Double.toString(val1 - val2));
                    else if (op == Operator.add)
                        display.setText(Double.toString(val1 + val2));
                    else if (op == Operator.multiply)
                        display.setText(Double.toString(val1 * val2));
                    else if (op == Operator.divide)
                        display.setText(Double.toString(val1 / val2));
                }

            }
        });
        };
    }
