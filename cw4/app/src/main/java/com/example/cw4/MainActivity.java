package com.example.cw4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText Ed1 = findViewById(R.id.ET1);
        EditText Ed2 = findViewById(R.id.ET2);
        Button b = findViewById(R.id.calculate);
        TextView t = findViewById(R.id.result);



        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(Ed1.getText().toString());
                int number2 = Integer.parseInt(Ed2.getText().toString());

                int result = number1 + number1;
                t.setText(String.valueOf(result));

                t.setText(String.valueOf(result));
            }
        });

    }
}
