package com.example.latihan2;
//27/04/2021, membuat tampilan register, 10118009, Tassyakur Pasya, IF01
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    public void Almost(View view) {
        Intent intent = new Intent(this, Almost.class);
        startActivity(intent);
    }
}