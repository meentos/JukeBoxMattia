package com.example.mentosbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class LyricsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lyrics);

        ButtonMostraTesto = findViewById(R.id.ButtonMostraTesto);
        tornaIndietro = findViewById(R.id.tornaIndietro);
        MostraTesto = findViewById(R.id.MostraTesto);

    }

    Button ButtonMostraTesto;
    TextView tornaIndietro;
    TextView MostraTesto;
/*      String txt;
    public void mostraTesto(View view){

        InputStream inputStream = getResources().openRawResource(R.raw.testo1);
        try {
            byte[] buffer = new byte[inputStream.available()];
            while (inputStream.read(buffer) != -1)
                txt = new String(buffer);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    MostraTesto.setText(String);
    }
*/



}