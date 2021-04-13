package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class StartClass extends AppCompatActivity {
    EditText ed1, ed2;
    Button start;
    String e1, e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_layout);
        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
        start = findViewById(R.id.start);
        e1 = ed1.getText().toString();
        e2 = ed2.getText().toString();
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartClass.this, TwoClass.class);
                startActivity(intent);
            }});
    }
}
