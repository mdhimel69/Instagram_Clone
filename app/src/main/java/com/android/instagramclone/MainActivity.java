package com.android.instagramclone;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imgView);
        button = findViewById(R.id.button);

        //String url = "https://i.pinimg.com/736x/58/78/fa/5878faabdbde40edd6a32228e946a120.jpg";
        //String url = "https://1000logos.net/wp-content/uploads/2017/02/Logo-Instagram-1.png";

//        Picasso.get()
//                .load(R.drawable.insta_logo)
//                .fit()
//                .into(imageView);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);
            }
        });

    }
}