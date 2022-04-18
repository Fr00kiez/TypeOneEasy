package com.example.typeoneeasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String nama, npm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button veriff = findViewById(R.id.veriff);
        Button reset = findViewById(R.id.rst);
        final TextView nama2 = findViewById(R.id.nama2);
        final TextView npm2 = findViewById(R.id.npm2);
        final TextView nama1 = findViewById(R.id.nama1);
        final TextView npm1 = findViewById(R.id.npm1);

        veriff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama = nama1.getText().toString();
                npm = npm1.getText().toString();

                nama2.setText(nama);
                npm2.setText(npm);
            }
        });

        reset.setOnClickListener(v -> {
            Intent a = new Intent(MainActivity.this, MainActivity.class);
            startActivity(a);
        });


    }
}