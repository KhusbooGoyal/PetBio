package com.example.petbio;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BioActivity extends AppCompatActivity {

    private ImageView petview;
    private TextView petname;
    private TextView petbio;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        petview = (ImageView) findViewById(R.id.petbioID);
        petname = (TextView) findViewById(R.id.nameID);
        petbio = (TextView) findViewById(R.id.biotextID);

        extras = getIntent().getExtras();

        if(extras!=null){
            String name = extras.getString("name");
            String bio = extras.getString("bio");

            setUp(name, bio);
        }

    }

    @SuppressLint("UseCompatLoadingForDrawables")
    public void  setUp(String name, String bio){
        if(name.equals("Dufus")){
            petview.setImageDrawable(getResources().getDrawable(R.drawable.dog));
            petname.setText(name);
            petbio.setText(bio);
        }
        else if(name.equals("Jarvis")){
            petview.setImageDrawable(getResources().getDrawable(R.drawable.cat));
            petbio.setText(bio);
            petname.setText(name);

        }

    }
}