package com.example.mentosbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView text1;
    Button cambiaActivity;
    int n; //numero random

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = findViewById(R.id.showButton);
        cambiaActivity = findViewById(R.id.cambiaActivity);
    }

    public void generaNumero(View view){

        Random rand = new Random();
        n = rand.nextInt(10);
        text1.setText(Integer.toString(n+1));
        cambiaActivity.setVisibility(View.VISIBLE);
    }


    public void cambiaActivity(View view){
        Intent ActivityMusic = new Intent(getApplicationContext(), MusicActivity.class);
        ActivityMusic.putExtra("NumeroRandom", n);
        startActivity(ActivityMusic);

    }

}