package com.example.unite2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void uyg2Goster(View view) {
        Intent i = new Intent( MainActivity.this, Uyg2.Class);
        startActivity(i);
    }
}
