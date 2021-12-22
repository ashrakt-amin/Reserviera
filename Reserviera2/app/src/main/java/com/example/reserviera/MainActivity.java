package com.example.reserviera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Menu menu;
    TextView textView1 ,textView2;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        textView1 =findViewById( R.id.home1);
        textView2 =findViewById( R.id.home2);

    }
        public boolean onCreateOptionsMenu(Menu menu) {
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.menu, menu);
            return true;
        }

        public boolean onOptionsItemSelected(MenuItem item) {
            switch (item.getItemId()) {
                case R.id.Halls:
                    startActivity( new Intent( MainActivity.this, Halls.class ) );
                    break;
              case R.id.Book:
                    startActivity( new Intent( MainActivity.this, Book.class ) );
                    break;

                case R.id.Contact:
                    startActivity( new Intent( MainActivity.this, Contact.class ) );
                    break;
                default:
            }
                return super.onOptionsItemSelected( item );

            }
        }



