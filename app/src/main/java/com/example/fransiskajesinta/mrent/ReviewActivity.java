package com.example.fransiskajesinta.mrent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ReviewActivity extends AppCompatActivity {
    TextView rNama, rHarga, rTotal;
    ImageView rImage;
    String sNama, sHarga, sGambar;
    int b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);

        rNama = (TextView)findViewById(R.id.nama_mobil);
        rHarga = (TextView)findViewById(R.id.harga_mobil);
        rTotal = (TextView)findViewById(R.id.total_harga);
        rImage = (ImageView)findViewById(R.id.gambar);
        b = R.drawable.newavanzablue;

        sNama = getIntent().getStringExtra("nama");
        sHarga = getIntent().getStringExtra("harga");

        rNama.setText(sNama);
        rHarga.setText(sHarga);
        rTotal.setText(sHarga);

    }
}
