package com.example.mwa;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.my_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.webid){

            Intent i=new Intent(MainActivity.this, WebActivity.class);
            startActivity(i);
        } else if ((item.getItemId() == R.id.alertid)) {
            Intent i=new Intent(MainActivity.this, Alert_Activity.class);
            startActivity(i);
        }
        else {
            return false;
        }
        return super.onOptionsItemSelected(item);
    }
}