package com.example.reserviera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Royall extends AppCompatActivity {
    ViewFlipper viewFlipper;
    ExpandableListView expandableListView;
    HashMap<String, List<String>> listChild;
    List<String> listHeader;
    CustomAdapter customAdapter;
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_royall );
        viewFlipper = findViewById( R.id.viewlippercrystal );
        button =findViewById( R.id.buttontobook );
        button.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent= new Intent(Royall.this,Book.class );
                    startActivity( intent );

                }
        } );
        int Images[] = {R.drawable.r1, R.drawable.r2, R.drawable.r3, R.drawable.r4};




        //for loop
        for(int i =0 ;i <Images.length;i++){
            flipperImages( Images[i]);


            expandableListView =  findViewById(R.id.expand2);
            listChild =ExpandablelistDataroyal.getData();
            listHeader = new ArrayList<String>(listChild.keySet());
            customAdapter = new CustomAdapter(this, listHeader, listChild);
            expandableListView.setAdapter(customAdapter);


        }
    }
    public void flipperImages (int image){
        ImageView imageView =new ImageView( this );
        //  imageView.setBackgroundResource(image  );
        imageView.setImageResource( image );
        viewFlipper.addView( imageView );
        viewFlipper.setFlipInterval( 2500 );
        viewFlipper.setAutoStart(true);
        viewFlipper.setInAnimation( this,android.R.anim.slide_in_left );
        viewFlipper.setOutAnimation( this,android.R.anim.slide_out_right);

    }
}