package com.example.tictactoe;

import android.os.Bundle;



import androidx.appcompat.app.AppCompatActivity;

import android.view.View;



import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    int count;
    String b1, b2, b3, b4, b5, b6, b7, b8, b9;

    int flat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void finishAffinity() {
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
    }


    public void Click(View view) {
        Button ButtonCurrent = (Button) view;
        count++;
        if (flat == 0) {
            ButtonCurrent.setText("x");
            flat = 1;
        } else {
            ButtonCurrent.setText("o");
            flat = 0;
        }

        if (count > 4) {
            b1 = btn1.getText().toString();
            b2 = btn1.getText().toString();
            b3 = btn2.getText().toString();
            b4 = btn3.getText().toString();
            b5 = btn4.getText().toString();
            b6 = btn5.getText().toString();
            b7 = btn6.getText().toString();
            b8 = btn7.getText().toString();
            b9 = btn8.getText().toString();

            if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                Toast.makeText(this, "Winner is "+b1, Toast.LENGTH_SHORT).show();
            } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                Toast.makeText(this, "Winner is "+b4, Toast.LENGTH_SHORT).show();
            } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                Toast.makeText(this, "Winner is "+b7, Toast.LENGTH_SHORT).show();
            } else if (b1.equals(b4) && b4.equals(b7) && !b4.equals("")) {
                Toast.makeText(this, "Winner is "+b1, Toast.LENGTH_SHORT).show();

            } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                Toast.makeText(this, "Winner is "+b2, Toast.LENGTH_SHORT).show();
            }
            } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
            Toast.makeText(this, "Winner is "+b3, Toast.LENGTH_SHORT).show();
            } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
            Toast.makeText(this, "Winner is "+b1, Toast.LENGTH_SHORT).show();
            } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
            Toast.makeText(this, "Winner is "+b3, Toast.LENGTH_SHORT).show();
            }


    }
}