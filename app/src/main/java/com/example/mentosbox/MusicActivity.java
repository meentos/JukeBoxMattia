package com.example.mentosbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        numeroPreso = getIntent().getExtras().getInt("NumeroRandom");
        mostraCazone = findViewById(R.id.mostraCanzone);
        mostraCazone.setText(titoliCanzoni[numeroPreso]);
        fotoCanzone = findViewById(R.id.fotoCanzone);
        fotoCanzone.setImageResource(immagini[numeroPreso]);


    }

    int numeroPreso;
    TextView mostraCazone;
    ImageView fotoCanzone;

    String[] titoliCanzoni = {
            "Metro Boomin, The Weeknd, 21 Savage - Creepin' (Visualizer)",
            "Drake, 21 Savage - Rich Flex (Audio)",
            "Taylor Swift - Anti-Hero (Official Music Video)",
            "Imagine Dragons - Bones (Official Music Video)",
            "Harry Styles - As It Was (Official Video)",
            "Camila Cabello ft. Ed Sheeran - Bam Bam (Official Music Video)",
            "Fireboy DML & Ed Sheeran - Peru (Official Video)",
            "Lizzo - About Damn Time [Official Video]",
            "Tiësto & Ava Max - The Motto (Official Music Video)",
            "Joji - Glimpse of Us"
    };

    String[] linkCanzoni = {
            "https://www.youtube.com/watch?v=61ymOWwOwuk&list=RDCLAK5uy_nqRa4MZhGLlzdFysGGDQyuGA43aqJR8FQ&index=1",
            "https://www.youtube.com/watch?v=I4DjHHVHWAE&list=RDCLAK5uy_nqRa4MZhGLlzdFysGGDQyuGA43aqJR8FQ&index=5",
            "https://www.youtube.com/watch?v=b1kbLwvqugk&list=RDCLAK5uy_nqRa4MZhGLlzdFysGGDQyuGA43aqJR8FQ&index=7",
            "https://www.youtube.com/watch?v=TO-_3tck2tg&list=RDCLAK5uy_nqRa4MZhGLlzdFysGGDQyuGA43aqJR8FQ&index=12",
            "https://www.youtube.com/watch?v=H5v3kku4y6Q&list=RDCLAK5uy_nqRa4MZhGLlzdFysGGDQyuGA43aqJR8FQ&index=14",
            "https://www.youtube.com/watch?v=-8VfKZCOo_I&list=RDCLAK5uy_nqRa4MZhGLlzdFysGGDQyuGA43aqJR8FQ&index=16",
            "https://www.youtube.com/watch?v=pekzpzNCNDQ&list=RDCLAK5uy_nqRa4MZhGLlzdFysGGDQyuGA43aqJR8FQ&index=17",
            "https://www.youtube.com/watch?v=IXXxciRUMzE&list=RDCLAK5uy_nqRa4MZhGLlzdFysGGDQyuGA43aqJR8FQ&index=18",
            "https://www.youtube.com/watch?v=1_4ELAxKrDc&list=RDCLAK5uy_nqRa4MZhGLlzdFysGGDQyuGA43aqJR8FQ&index=19",
            "https://www.youtube.com/watch?v=FvOpPeKSf_4&list=RDCLAK5uy_nqRa4MZhGLlzdFysGGDQyuGA43aqJR8FQ&index=21"
    };

    String[] votiMentos = {
            "8",
            "4",
            "7",
            "5",
            "6",
            "4",
            "8",
            "8",
            "3",
            "10"
    };

    int[] immagini = {
            R.raw.n1,
            R.raw.n2,
            R.raw.n3,
            R.raw.n4,
            R.raw.n5,
            R.raw.n6,
            R.raw.n7,
            R.raw.n8,
            R.raw.n9,
            R.raw.n10,
    };

    public void cambiaActivity(View view) {
        Intent ActivityMusic = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(ActivityMusic);

    }

    public void vaiSuYouTube(View view){
        Intent youTube = new Intent(Intent.ACTION_VIEW, Uri.parse(linkCanzoni[numeroPreso]));
        startActivity(youTube);
    }

    public void mostraVoto(View view){
        Toast toast = Toast.makeText(this, votiMentos[numeroPreso],
                Toast.LENGTH_SHORT);
        toast.show();
    }

}