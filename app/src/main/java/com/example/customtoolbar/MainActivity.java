package com.example.customtoolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        toolbar = findViewById(R.id.idToolbar);
//        setSupportActionBar(toolbar);
//
//        if(getSupportActionBar() != null)
//        {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            setTitle("samadhan");
            getSupportActionBar().setSubtitle("by sama");
//        }
//        toolbar.setTitle("Samadhan");
//        toolbar.setSubtitle("by sama");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(MainActivity.this).inflate(R.menu.simplemenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int i = item.getItemId();
        switch (i)
        {
            case R.id.newFolder:
            {
                Toast.makeText(this, "New Folder", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.home:
            {
                Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show();
                break;
            }
        }
        return super.onOptionsItemSelected(item);
    }
}