package com.minhtrietofficial.lab1_ex3_radio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioButton rd1, rd2, rd3, rd4;
    private Button buttonCheck;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rd1 = findViewById(R.id.rd1);
        rd2 = findViewById(R.id.rd2);
        rd3 = findViewById(R.id.rd3);
        rd4 = findViewById(R.id.rd4);
        buttonCheck = findViewById(R.id.btCheck);
        tvResult = findViewById(R.id.tvResult);

        buttonCheck.setOnClickListener(new View.OnClickListener() {

            String text = "";


            @Override
            public void onClick(View view) {
                if (rd1.isChecked()) {
                    text = "Your selected: \n";
                    text += rd1.getText().toString() + ": " + true + "\n \n" ;
                    text += rd2.getText().toString() + ": " + false + "\n";
                    text += rd3.getText().toString() + ": " + false + "\n";
                    text += rd4.getText().toString() + ": " + false + "\n";

                    tvResult.setText(text);
                }

                if (rd2.isChecked()) {
                    text = "Your selected: \n";
                    text += rd2.getText().toString() + ": " + true + "\n \n";
                    text += rd1.getText().toString() + ": " + false + "\n";
                    text += rd3.getText().toString() + ": " + false + "\n";
                    text += rd4.getText().toString() + ": " + false + "\n";

                    tvResult.setText(text);
                }

                if (rd3.isChecked()) {
                    text = "Your selected: \n";
                    text += rd3.getText().toString() + ": " + true + "\n \n";
                    text += rd1.getText().toString() + ": " + false + "\n";
                    text += rd2.getText().toString() + ": " + false + "\n";
                    text += rd4.getText().toString() + ": " + false + "\n";

                    tvResult.setText(text);
                }

                if (rd4.isChecked()) {
                    text = "Your selected: \n";
                    text += rd4.getText().toString() + ": " + true + "\n \n";
                    text += rd1.getText().toString() + ": " + false + "\n";
                    text += rd2.getText().toString() + ": " + false + "\n";
                    text += rd3.getText().toString() + ": " + false + "\n";

                    tvResult.setText(text);
                }
            }
        });
    }
}