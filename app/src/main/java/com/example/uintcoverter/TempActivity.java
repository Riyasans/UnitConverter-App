package com.example.uintcoverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class TempActivity extends AppCompatActivity {
    EditText input;
    RadioButton celtoft, celtokl, fttocel, fttokl, kltocel, kltoft;
    Button convert;
    TextView answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);

            input = findViewById(R.id.temp_ed);
            celtoft = findViewById(R.id.celtoft);
            celtokl = findViewById(R.id.celtokl);
            fttocel = findViewById(R.id.fttocel);
            fttokl = findViewById(R.id.fttokl);
            kltocel = findViewById(R.id.kltocel);
            kltoft = findViewById(R.id.kltoft);
            convert = findViewById(R.id.bt_convert);
            answer = findViewById(R.id.ans_tv);

            convert.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String con = input.getText().toString();
                    if (con.isEmpty()) {
                        Toast.makeText(TempActivity.this, "Fill the Unit", Toast.LENGTH_SHORT).show();
                    } else {
                        if (celtoft.isChecked()) {
                            float f1 = Float.parseFloat(con);
                            float CELTOFT = (float) ((f1 * 9 / 5) + 32);
                            answer.setText(con + " °Celsius = " + CELTOFT + " °Fahreneit");
                        }
                        if (celtokl.isChecked()) {
                            float f1 = Float.parseFloat(con);
                            float CELTOKL = (float) (f1 + 273.15);
                            answer.setText(con + " °Celsius = " + CELTOKL + " °Kelvin");
                        }

                        if (fttocel.isChecked()) {
                            float f1 = Float.parseFloat(con);
                            float FTTOCEL = (float) ((f1 - 32) * 5 / 9);
                            answer.setText(con + " °Fahreneit = " + FTTOCEL + " °Celsius");
                        }
                        if (fttokl.isChecked()) {
                            float f1 = Float.parseFloat(con);
                            float FTTOKL = (float) ((f1 - 32) * 5 / 9 + 273.15);
                            answer.setText(con + " °Fahreneit = " + FTTOKL + " °Kelvin");
                        }
                        if (kltocel.isChecked()) {
                            float f1 = Float.parseFloat(con);
                            float KLTOCEL = (float) (f1 - 273.15);
                            answer.setText(con + " °Fahreneit = " + KLTOCEL + " °Kelvin");
                        }
                        if (kltoft.isChecked()) {
                            float f1 = Float.parseFloat(con);
                            float KLTOFT = (float) ((f1 - 273.15) * 9 / 5 + 32);
                            answer.setText(con + " °Fahreneit = " + KLTOFT + " °Kelvin");
                        }


                    }
                }
            });
    }
}