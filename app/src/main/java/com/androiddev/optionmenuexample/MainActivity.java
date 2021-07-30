package com.androiddev.optionmenuexample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
    }
    //inflating the menu(view) in the UI
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    //event
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        if(itemId == R.id.op_home)
        {
            Toast.makeText(MainActivity.this, "you clicked on home", Toast.LENGTH_SHORT).show();
        }
        if(itemId == R.id.op_setting)
        {
            Toast.makeText(MainActivity.this, "you clicked on setting", Toast.LENGTH_SHORT).show();
        }
        if(itemId == R.id.op_upload)
        {
            Toast.makeText(MainActivity.this, "you clicked on upload", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}