package com.example.fransiskajesinta.mrent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainMenuActivity extends AppCompatActivity {

    ImageButton mb, mt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        mb=(ImageButton)findViewById(R.id.mbl);
        mt=(ImageButton)findViewById(R.id.mtr);

        mb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(MainMenuActivity.this, ListActivity.class);
                pindah.putExtra("tipe","mobil");
                startActivity(pindah);
                //finish();
            }
        });

        mt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(MainMenuActivity.this, ListActivity.class);
                pindah.putExtra("tipe","motor");
                startActivity(pindah);
                //finish();
            }
        });
    }
}
