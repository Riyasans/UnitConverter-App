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

public class PowerActivity extends AppCompatActivity {

    EditText input;
    RadioButton  wattTOKwatt ,kwattTOwatt, wattTOFootpound ,  FpTOwatt,hpTOwatt, wattTOhp ;
    Button convert;
    TextView answer;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_power);

          wattTOKwatt = findViewById(R.id.wattTOKwatt);
        kwattTOwatt = findViewById(R.id.kwattTOwatt);

        wattTOFootpound  = findViewById(R.id.wattTOFootpound );
        FpTOwatt= findViewById(R.id.FpTOwatt);

        hpTOwatt = findViewById(R.id.hpTOwatt);
        wattTOhp  = findViewById(R.id.wattTOhp);

            convert = findViewById(R.id.bt_convert);
            answer = findViewById(R.id.answer_tv);

            input=findViewById(R.id.frequnecy_ed);

            convert.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String con = input.getText().toString();

                    if (con.isEmpty()) {
                        Toast.makeText(PowerActivity.this, "Fill the Unit", Toast.LENGTH_SHORT).show();
                    } else {
                        if (wattTOKwatt.isChecked()) {
                            float f1 = Float.parseFloat(con);
                            float wattTOKwatt= (float) (f1 * 0.001);
                            answer.setText(con+" Watt to = "+wattTOKwatt+" KiloWatt");
                        }
                        if (wattTOFootpound .isChecked()) {
                            float f1 = Float.parseFloat(con);
                            float wattTOFootpound = (float) (f1 * 0.7375621489);
                            answer.setText(con+" Watt to = "+wattTOFootpound+" Foot-pound/second");
                        }
                        if (hpTOwatt.isChecked()) {
                            float f1 = Float.parseFloat(con);
                            float hpTOwatt = (float) (f1 * 1491.3997316);
                            answer.setText(con+" Imperial horsepower(hp) to = "+hpTOwatt+"Watt");
                        }
                        if (wattTOhp .isChecked()) {
                            float f1 = Float.parseFloat(con);
                            float wattTOhp = (float) (f1 * 0.0013410221);
                            answer.setText(con+" Watt to = "+wattTOhp+" Imperial horsepower(hp)");
                        }
                        if (kwattTOwatt.isChecked()) {
                            float f1 = Float.parseFloat(con);
                            float kwattTOwatt = (float) (f1 * 1000);
                            answer.setText(con+" Kilowatt to = "+kwattTOwatt+"Watt");
                        }
                        if ( FpTOwatt.isChecked()) {
                            float f1 = Float.parseFloat(con);
                            float FpTOwatt = (float) (f1 * 2.711635898);
                            answer.setText(con+"  Foot-pound/second to = "+FpTOwatt+" Watt");
                        }
                    }
                }
            });



    }

}

