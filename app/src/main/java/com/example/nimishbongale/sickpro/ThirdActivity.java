package com.example.thirdactivity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button b1, b2, b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.music);
        b2 = findViewById(R.id.video);
        b3 = findViewById(R.id.games);
        final Intent implicit= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jiosaavn.com/"));
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(implicit);
            }
        });
        final Intent implicit1= new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com"));
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(implicit1);
            }
        });
        final Intent implicit2= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.arkadium.com/free-online-games/#"));
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(implicit2);
            }
        });
    }
}
