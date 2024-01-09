package com.example.myregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class register extends AppCompatActivity {
    TextView log;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        log = (TextView) findViewById(R.id.SudahAdaAkun);
        log.setOnClickListener(new View.OnContextClickListener() {
            @Override
            public boolean onContextClick(View v) {
                startActivity(new Intent((MainActivity.this, register.class));
            }
        });
    }
}