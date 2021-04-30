package com.example.latihan2;
//29/04/2021, membuat tampilan verifyaccount, 10118009, Tassyakur Pasya, IF01
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class verifyaccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verifyaccount);
    }
    public void Home(View view) {
        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }
}