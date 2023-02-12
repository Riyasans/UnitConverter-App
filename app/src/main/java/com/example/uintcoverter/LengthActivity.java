package com.example.uintcoverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class LengthActivity extends AppCompatActivity {
    EditText input;
    TextView anwser;
    RadioGroup input_rd_btn, output_rd_btn;
    RadioButton cmToMeterbtn, cmToKilometerbtn;
    RadioButton meterToCm, meterTokilometer;
    RadioButton kilometerToCm, kilometerToMeter;
    Button convert_btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);


            input = findViewById(R.id.input_tv);
            anwser = findViewById(R.id.ans_tv);

            cmToMeterbtn = findViewById(R.id.cm_to_meter);
            cmToKilometerbtn = findViewById(R.id.cm_to_kilometer);

            meterToCm = findViewById(R.id.meter_to_cm);
            meterTokilometer = findViewById(R.id.meter_to_kilometer);

            kilometerToCm = findViewById(R.id.kilometer_to_cm);
            kilometerToMeter = findViewById(R.id.kilometer_to_meter);


            convert_btn = findViewById(R.id.bt_convert);


            convert_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String con = input.getText().toString();
                    if (con.isEmpty()) {
                        Toast.makeText(LengthActivity.this, "Fill the Unit", Toast.LENGTH_SHORT).show();
                    } else {
                        if (cmToMeterbtn.isChecked()) {
                            float f1 = Float.parseFloat(input.getText().toString());
                            float M = (float) (f1 * 0.01);
                            anwser.setText(con + " Cm = " + M + " Meter");
                            return;

                        }
                        if (cmToKilometerbtn.isChecked()) {
                            float f1 = Float.parseFloat(input.getText().toString());
                            float KM = (float) (f1 * 0.00001);
                            anwser.setText(con + " Cm = " + KM + " Kilometer");
                            return;

                        }
                        if (meterToCm.isChecked()) {
                            float f1 = Float.parseFloat(input.getText().toString());
                            float M = (float) (f1 * 100);
                            anwser.setText(con + " Meter=" + M + " Cm");
                        }
                        if (meterTokilometer.isChecked()) {
                            float f1 = Float.parseFloat(input.getText().toString());
                            float KM = (float) (f1 * 0.001);
                            anwser.setText(con + " Meter =" + KM + " Kilometer");
                        }
                        if (kilometerToCm.isChecked()) {
                            float f1 = Float.parseFloat(input.getText().toString());
                            float CM = (float) (f1 * 100000);
                            anwser.setText(con + " Km = " + CM + " Cm");
                        }
                        if (kilometerToMeter.isChecked()) {
                            float f1 = Float.parseFloat(input.getText().toString());
                            float CM = (float) (f1 * 1000);
                            anwser.setText(con + " Km = " + CM + " Meter");
                        }


                    }
                }

            });

        }
}