package com.example.uintcoverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class FrequecyActivity extends AppCompatActivity {
    EditText input;
    RadioButton hztokz, hztomz, kztohz, kztomz, mztohz, mztokz;
    Button convert;
    TextView answer;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frequecy);

            hztokz = findViewById(R.id.hztokz);
            hztomz = findViewById(R.id.hztomz);

            kztohz = findViewById(R.id.kztohz);
            kztomz = findViewById(R.id.kztomz);

            mztohz = findViewById(R.id.mztohz);
            mztokz = findViewById(R.id.mztokz);

            convert = findViewById(R.id.bt_convert);
            answer = findViewById(R.id.answer_tv);

            input=findViewById(R.id.frequnecy_ed);

            convert.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String con = input.getText().toString();

                    if (con.isEmpty()) {
                        Toast.makeText(FrequecyActivity.this, "Fill the Unit", Toast.LENGTH_SHORT).show();
                    } else {
                        if (hztokz.isChecked()) {
                            float f1 = Float.parseFloat(con);
                            float HZTOKZ = (float) (f1 * 0.001);
                            answer.setText(con+" Hertz to = "+HZTOKZ+" KiloHertz");
                        }
                        if (hztomz.isChecked()) {
                            float f1 = Float.parseFloat(con);
                            float HZTOMZ = (float) (f1 * 0.000001);
                            answer.setText(con+" Hertz to = "+HZTOMZ+" MegaHertz");
                        }
                        if (kztohz.isChecked()) {
                            float f1 = Float.parseFloat(con);
                            float KZTOHZ = (float) (f1 * 1000);
                            answer.setText(con+" KiloHertz to = "+KZTOHZ+" Hertz");
                        }
                        if (kztomz.isChecked()) {
                            float f1 = Float.parseFloat(con);
                            float KZTOMZ = (float) (f1 * 0.001);
                            answer.setText(con+" KiloHertz to = "+KZTOMZ+" MegaHertz");
                        }
                        if (mztohz.isChecked()) {
                            float f1 = Float.parseFloat(con);
                            float MZTOHZ = (float) (f1 * 1000000);
                            answer.setText(con+" MegaHertz to = "+MZTOHZ+" Hertz");
                        }
                        if (mztokz.isChecked()) {
                            float f1 = Float.parseFloat(con);
                            float MZTOKZ = (float) (f1 * 1000);
                            answer.setText(con+" MegaHertz to = "+MZTOKZ+" KiloHertz");
                        }
                    }
                }
            });


        }
}