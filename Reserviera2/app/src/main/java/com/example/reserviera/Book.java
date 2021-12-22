package com.example.reserviera;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Book extends AppCompatActivity {
TextView textView;
EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_book );

        editText =findViewById( R.id.username );
        textView =findViewById( R.id.Name );
        editText =findViewById( R.id.ephone );
        textView =findViewById( R.id.phone );
        editText =findViewById( R.id.email );
        textView =findViewById( R.id.temail );
    }
}