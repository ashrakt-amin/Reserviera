package com.example.reserviera;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class Halls extends AppCompatActivity {

 ImageView imageViewsky ,imageViewroyal,imageViewdiamond,imageViewcrystal ,imageViewback;
 TextView textViewsky ,textViewroyal ,textViewdiamond ,textViewcrystal ;
 ImageButton imageButton;
 LinearLayout linearLayout;
 ConstraintLayout constraintLayout;
 ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_halls );
        imageViewsky = findViewById( R.id.imagesky2 );
        imageViewroyal = findViewById( R.id.imageroyal);
        imageViewdiamond = findViewById( R.id.imagediamond );
        imageViewcrystal = findViewById( R.id.imagecrystal);

        textViewsky = findViewById( R.id.text1sky );
       imageViewback = findViewById( R.id.imagecompo);
        textViewroyal = findViewById( R.id.text1royal );
        textViewdiamond= findViewById( R.id.text1diamond );
        textViewcrystal = findViewById( R.id.textcrystal);

        linearLayout=findViewById( R.id.linear );
        constraintLayout =findViewById( R.id.con1 );
        constraintLayout =findViewById( R.id.con2);
        scrollView =findViewById( R.id.scroll );


    imageViewsky.setOnClickListener( new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent= new Intent( Halls.this,SkyHall.class );
        startActivity( intent );
    }
} );

        imageViewback.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent= new Intent( Halls.this,MainActivity.class );
                startActivity( intent );
            }
        } );

        imageViewroyal.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent( Halls.this,Royall.class );
                startActivity( intent );
            }
        } );

        imageViewcrystal.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent( Halls.this,Crystal.class );
                startActivity( intent );
            }
        } );

        imageViewdiamond.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent( Halls.this,Diamond.class );
                startActivity( intent );
            }
        } );

            }
        }




