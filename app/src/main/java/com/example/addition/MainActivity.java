package com.example.addition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText editText1;
    EditText editText2;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        editText1=findViewById(R.id.e1);
        editText2=findViewById(R.id.e2);
        textView=findViewById(R.id.textview);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=editText1.getText().toString();
                int a1=Integer.parseInt(s);
                String s2=editText2.getText().toString();
                int b1=Integer.parseInt(s2);
                textView.setText("Addition :"+(a1+b1));
            }
        });

    }
}