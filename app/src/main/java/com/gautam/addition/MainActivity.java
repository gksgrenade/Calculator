package com.gautam.addition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private EditText edtxt;
    private EditText edtxt2;
    private TextView antxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button);
        edtxt=findViewById(R.id.editTextNumberDecimal);
        edtxt2=findViewById(R.id.editTextNumberDecimal2);
        antxt=findViewById(R.id.textView2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Summation Found Successfully", Toast.LENGTH_SHORT).show();
                String S1=edtxt.getText().toString();
                String S2=edtxt2.getText().toString();
                double a=Double.parseDouble(S1);
                double b=Double.parseDouble(S2);
                double s=a+b;
                antxt.setText(""+s);
            }
        });
    }
}