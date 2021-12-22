package com.example.reserviera;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Contact extends AppCompatActivity {
EditText editText;
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_contact );
        imageView =findViewById( R.id.imagemail );

        imageView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_SEND );
                i.setData( Uri.parse( "email" ) );
                String[] s={"reserviera@gmail.com"};
                i.putExtra( Intent.EXTRA_EMAIL,s );
                i.putExtra( Intent.EXTRA_SUBJECT,"This is a subject");
                i.putExtra( Intent.EXTRA_TEXT,"this is the email body");
                i.setType( "message/rfc82" );
                Intent chooser=Intent.createChooser( i,"email" );
                startActivity( chooser );
                }
            } );

}}