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

public class SpeedActivity extends AppCompatActivity {

    EditText input;
    RadioButton  kmsTOms, msTOKms, msTOkmh,kmhTOms , KsTOmh , mhTOks ;
    Button convert;
    TextView answer;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed);
        getSupportActionBar().hide();

            input = findViewById(R.id.temp_ed1);
        kmsTOms = findViewById(R.id.kmsTOms);
        msTOKms = findViewById(R.id.msTOKms);
        msTOkmh = findViewById(R.id.msTOkmh);
        kmhTOms = findViewById(R.id.kmhTOms);
        KsTOmh = findViewById(R.id.KsTOmh);
        mhTOks = findViewById(R.id.mhTOks);
            convert = findViewById(R.id.bt_convert);
            answer = findViewById(R.id.ans_tv);

            convert.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String con = input.getText().toString();
                    if (con.isEmpty()) {
                        Toast.makeText(SpeedActivity.this, "Fill the Unit", Toast.LENGTH_SHORT).show();
                    } else {
                        if ( kmsTOms.isChecked()) {
                            float f1 = Float.parseFloat(con);
                            float kmsTOms= (float) (f1 * 1000);
                            answer.setText(con + " Kilometer/second = " + kmsTOms + " Meter/second");
                        }
                        if (msTOKms.isChecked()) {
                            float f1 = Float.parseFloat(con);
                            float msTOKms = (float) (f1 * 0.001);
                            answer.setText(con + " Meter/second = " + msTOKms + " Kilometer/second ");
                        }

                        if (msTOkmh.isChecked()) {
                            float f1 = Float.parseFloat(con);
                            float msTOkmh = (float) (f1 *3.6);
                            answer.setText(con + " Meter/second = " + msTOkmh + " Kilometer/hour");
                        }
                        if (kmhTOms .isChecked()) {
                            float f1 = Float.parseFloat(con);
                            float kmhTOms = (float) (f1 * 0.277777778);
                            answer.setText(con + "Kilometer/hour = " + kmhTOms + " Meter/second");
                        }
                        if ( KsTOmh .isChecked()) {
                            float f1 = Float.parseFloat(con);
                            float KsTOmh = (float) (f1 * 2236.936);
                            answer.setText(con + "Kilometer/second = " + KsTOmh + " Mile/hour ");
                        }
                        if (mhTOks .isChecked()) {
                            float f1 = Float.parseFloat(con);
                            float mhTOks = (float) (f1 * 0.0004470400589);
                            answer.setText(con + " Mile/hour= " + mhTOks + " Kilometer/second");
                        }


                    }
                }
            });
        }
    }
