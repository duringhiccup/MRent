package com.example.fransiskajesinta.mrent;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {
    String tipe, pilihan;
    TextView nk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Intent getPaket = new Intent(getIntent());
        tipe = getPaket.getStringExtra("tipe");
        nk = (TextView) findViewById(R.id.nk);

        final RadioGroup radioGrp = (RadioGroup) findViewById(R.id.radio_group_pilihan);
        String[] pilihanArray;

        //get string array from source
        if(tipe.equalsIgnoreCase("mobil")) {
            pilihanArray = getResources().getStringArray(R.array.mobil_array);
            nk.setText("Pilihan Mobil");
        }else{
            pilihanArray = getResources().getStringArray(R.array.motor_array);
            nk.setText("Pilihan Motor");
        }
        //create radio buttons
        for (int i = 0; i < pilihanArray.length; i++) {
            RadioButton radioButton = new RadioButton(this);
            radioButton.setText(pilihanArray[i]);
            radioButton.setId(i);
            radioGrp.addView(radioButton);
        }

        //set listener to radio button group
        radioGrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override


            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int checkedRadioButtonId = radioGrp.getCheckedRadioButtonId();
                RadioButton radioBtn = (RadioButton) findViewById(checkedRadioButtonId);
                Toast.makeText(ListActivity.this, radioBtn.getText(), Toast.LENGTH_SHORT).show();
                pilihan = radioBtn.getText().toString();
                Intent pindah = new Intent(ListActivity.this, DetailKendaraanActivity.class);
                pindah.putExtra("tipe",tipe);
                pindah.putExtra("pilihan",pilihan);
                startActivity(pindah);
            }
        });
    }
}
