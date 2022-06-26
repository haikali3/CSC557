package com.example.indiapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class aboutMe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.logout) {

            Intent intent = new Intent(aboutMe.this,MainActivity.class);
            startActivity(intent);
            Toast.makeText(aboutMe.this, "Logged out", Toast.LENGTH_SHORT).show();
            return true;
        }
        else
        if (id == R.id.hobbies) {

            Intent intent = new Intent(aboutMe.this,hobbies.class);
            startActivity(intent);

            return true;
        }
        if (id == R.id.skills) {

            Intent intent = new Intent(aboutMe.this,SkillsPage.class);
            startActivity(intent);

            return true;
        }
        if (id == R.id.resume) {

            Intent intent = new Intent(aboutMe.this,Resume.class);
            startActivity(intent);

            return true;
        }
        if (id == R.id.istudent) {

            Intent intent = new Intent(aboutMe.this,WebApp.class);
            startActivity(intent);

            return true;
        }
        if (id == R.id.uitm) {

            Intent intent = new Intent(aboutMe.this,WebUitm.class);
            startActivity(intent);

            return true;
        }
        if (id == R.id.omnifood) {

            Intent intent = new Intent(aboutMe.this,Omnifood.class);
            startActivity(intent);

            return true;
        }


        return super.onOptionsItemSelected(item);
    }
}

