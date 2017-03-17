package com.example.fransiskajesinta.mrent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailKendaraanActivity extends AppCompatActivity {
    String tipe, pilihan;
    TextView mNama, mJumlah, mWarna;
    ImageView mImageView;
    Button mSewa;
    int a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kendaraan);

        mNama = (TextView) findViewById(R.id.namamobil);
        mJumlah = (TextView) findViewById(R.id.harga);
        mImageView = (ImageView) findViewById(R.id.gambar);
        mWarna = (TextView)findViewById(R.id.warna);
        Intent getPaket = new Intent(getIntent());
        tipe = getPaket.getStringExtra("tipe");
        pilihan = getPaket.getStringExtra("pilihan");
        final String[] pilihanArray, pilihanDetail;

        if(tipe.equalsIgnoreCase("mobil")) {
            pilihanArray = getResources().getStringArray(R.array.mobil_array);
            if(pilihan.equalsIgnoreCase("Avanza")){
                pilihanDetail = getResources().getStringArray(R.array.Avanza);
                mNama.setText(pilihanDetail[0]);
                mJumlah.setText(pilihanDetail[1]);
                mWarna.setText(pilihanDetail[3]);
                mImageView.setImageResource(R.drawable.newavanzablue);
                a = R.drawable.newavanzablue;
            }else if (pilihan.equalsIgnoreCase("Xenia")){
                pilihanDetail = getResources().getStringArray(R.array.Xenia);
                mNama.setText(pilihanDetail[0]);
                mJumlah.setText(pilihanDetail[1]);
                mWarna.setText(pilihanDetail[3]);
                mImageView.setImageResource(R.drawable.xenia);
                a = R.drawable.newavanzablue;
            }else if (pilihan.equalsIgnoreCase("Jazz")){
                pilihanDetail = getResources().getStringArray(R.array.Jazz);
                mNama.setText(pilihanDetail[0]);
                mJumlah.setText(pilihanDetail[1]);
                mWarna.setText(pilihanDetail[3]);
                mImageView.setImageResource(R.drawable.orchid);
                a = R.drawable.newavanzablue;
            }else if (pilihan.equalsIgnoreCase("Innova")){
                pilihanDetail = getResources().getStringArray(R.array.Innova);
                mNama.setText(pilihanDetail[0]);
                mJumlah.setText(pilihanDetail[1]);
                mWarna.setText(pilihanDetail[3]);
                mImageView.setImageResource(R.drawable.innova);
                a = R.drawable.newavanzablue;
            }else{
                pilihanDetail = getResources().getStringArray(R.array.Ertiga);
                mNama.setText(pilihanDetail[0]);
                mJumlah.setText(pilihanDetail[1]);
                mWarna.setText(pilihanDetail[3]);
                mImageView.setImageResource(R.drawable.ertiga);
                a = R.drawable.newavanzablue;
            }

        }else{
            pilihanArray = getResources().getStringArray(R.array.motor_array);
            if(pilihan.equalsIgnoreCase("Mio")){
                pilihanDetail = getResources().getStringArray(R.array.Mio);
                mNama.setText(pilihanDetail[0]);
                mJumlah.setText(pilihanDetail[1]);
                mWarna.setText(pilihanDetail[3]);
                mImageView.setImageResource(R.drawable.mio);
                a = R.drawable.newavanzablue;
            }else if (pilihan.equalsIgnoreCase("Beat")){
                pilihanDetail = getResources().getStringArray(R.array.Beat);
                mNama.setText(pilihanDetail[0]);
                mJumlah.setText(pilihanDetail[1]);
                mWarna.setText(pilihanDetail[3]);
                mImageView.setImageResource(R.drawable.beat);
                a = R.drawable.newavanzablue;
            }else if (pilihan.equalsIgnoreCase("Supra")){
                pilihanDetail = getResources().getStringArray(R.array.Supra);
                mNama.setText(pilihanDetail[0]);
                mJumlah.setText(pilihanDetail[1]);
                mWarna.setText(pilihanDetail[3]);
                mImageView.setImageResource(R.drawable.supra);
                a = R.drawable.newavanzablue;
            }else if (pilihan.equalsIgnoreCase("Ninja")){
                pilihanDetail = getResources().getStringArray(R.array.Ninja);
                mNama.setText(pilihanDetail[0]);
                mJumlah.setText(pilihanDetail[1]);
                mWarna.setText(pilihanDetail[3]);
                mImageView.setImageResource(R.drawable.motorninja);
                a = R.drawable.newavanzablue;
            }else{
                pilihanDetail = getResources().getStringArray(R.array.Nmax);
                mNama.setText(pilihanDetail[0]);
                mJumlah.setText(pilihanDetail[1]);
                mWarna.setText(pilihanDetail[3]);
                mImageView.setImageResource(R.drawable.nmax);
                a = R.drawable.newavanzablue;
            }
        }

        mSewa = (Button) findViewById(R.id.Sewa);
        mSewa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailKendaraanActivity.this, ReviewActivity.class);
                intent.putExtra("nama", pilihanDetail[0]);
                intent.putExtra("harga", pilihanDetail[1]);
                intent.putExtra("gambar", a);
                startActivity(intent);
            }
        });
    }
}
