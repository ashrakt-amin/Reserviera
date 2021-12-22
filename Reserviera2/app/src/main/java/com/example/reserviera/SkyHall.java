package com.example.reserviera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterViewFlipper;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import java.net.DatagramPacket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SkyHall extends AppCompatActivity {
        ViewFlipper viewFlipper;
        ExpandableListView expandableListView;
	    HashMap<String, List<String>> listChild;
	    List<String> listHeader;
	    CustomAdapter customAdapter;
	     TextView textView;
	    EditText editText;
	    Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_sky_hall );

        viewFlipper = findViewById( R.id.viewlipper );
        button =findViewById( R.id.buttontobook );


        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( SkyHall.this, Book.class );
                startActivity( intent );
            }


            });

        int Images[] = {R.drawable.sky1, R.drawable.sky_2, R.drawable.sky3, R.drawable.sky4, R.drawable.sky};

        //for loop
          for(int i =0 ;i <Images.length;i++){
                    flipperImages( Images[i]);

                    textView =findViewById(R.id.tsky1  )  ;
                    expandableListView =  findViewById(R.id.expand1);
                    listChild =ExpandableListData.getData();
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

