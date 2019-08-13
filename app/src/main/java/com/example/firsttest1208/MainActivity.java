package com.example.firsttest1208;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText txtnombre;
    private EditText txtcontra;
    private Button btn1;
    private EditText txthora;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**txtnombre = (EditText) findViewById(R.id.txtnombre);**/
        btn1 = (Button) findViewById((R.id.btnenviar));
        /**txtcontra = (EditText) findViewById(R.id.txtcontra);**/
        txthora = (EditText) findViewById(R.id.txthoras);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int total;
                int tothextras;
                int tothh;
                /**Toast.makeText(getApplicationContext(), "" + txtnombre.getText().toString(), Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), "" + txtcontra.getText().toString(), Toast.LENGTH_LONG).show();**/
                int mynum = 0;
                mynum  = Integer.parseInt(txthora.getText().toString());
                if (mynum>0 && mynum<61) {
                    tothextras = 60-mynum;
                    if (mynum <=40) {
                        total = mynum*40;
                        Toast.makeText(getApplicationContext(), "Su sueldo es:" + total, Toast.LENGTH_LONG).show();
                    }
                    else {
                        if (tothextras<11){
                            tothh = tothextras*3;
                            total = mynum*40+tothh;
                            Toast.makeText(getApplicationContext(), "Su sueldo es:" + total, Toast.LENGTH_LONG).show();
                        }
                        else {
                            tothh = tothextras*2;
                            total = mynum*40+tothh;
                            Toast.makeText(getApplicationContext(), "Su sueldo es:" + total, Toast.LENGTH_LONG).show();
                        }
                    }
                }
                else {
                    Toast.makeText(getApplicationContext(), "Saldo Inaceptable...!", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
