package com.example.uintcoverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class WeightActivity extends AppCompatActivity {

    EditText input;
    RadioButton mltogr, mltokg, grtoml, grtokl, kgtoml, kgtogr;
    Button convert;
    TextView answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);
        getSupportActionBar().hide();


            input = findViewById(R.id.weight_ed);
            mltogr = findViewById(R.id.mltogr);
            mltokg = findViewById(R.id.mltokg);
            grtoml = findViewById(R.id.grtoml);
            grtokl = findViewById(R.id.grtokl);
            kgtoml = findViewById(R.id.kgtoml);
            kgtogr = findViewById(R.id.kgtogr);
            convert = findViewById(R.id.bt_convert);
            answer = findViewById(R.id.answer_tv);

            convert.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String con = input.getText().toString();
                    if (con.isEmpty()) {
                        Toast.makeText(WeightActivity.this, "Fill the Unit", Toast.LENGTH_SHORT).show();
                    } else {
                        if (mltogr.isChecked()) {
                            float f1 = Float.parseFloat(con);
                            float CELTOFT = (float) (f1 * 0.001);
                            answer.setText(con + " MiliGram = " + CELTOFT + " Gram");
                        }
                        if (mltokg.isChecked()) {
                            float f1 = Float.parseFloat(con);
                            float CELTOKL = (float) (f1 * 0.000001);
                            answer.setText(con + " MiliGram = " + CELTOKL + " KiloGram");
                        }

                        if (grtoml.isChecked()) {
                            float f1 = Float.parseFloat(con);
                            float FTTOCEL = (float) (f1 * 1000);
                            answer.setText(con + " Gram = " + FTTOCEL + " MiliGram");
                        }
                        if (grtokl.isChecked()) {
                            float f1 = Float.parseFloat(con);
                            float FTTOKL = (float) (f1 * 0.001);
                            answer.setText(con + " Gram = " + FTTOKL + " KiloGram");
                        }
                        if (kgtoml.isChecked()) {
                            float f1 = Float.parseFloat(con);
                            float KLTOCEL = (float) (f1 * 1000000);
                            answer.setText(con + " KiloGram = " + KLTOCEL + " MiliGram");
                        }
                        if (kgtogr.isChecked()) {
                            float f1 = Float.parseFloat(con);
                            float KLTOFT = (float) (f1 * 1000);
                            answer.setText(con + " KiloGram = " + KLTOFT + " Gram");
                        }


                    }
                }
            });
    }
}