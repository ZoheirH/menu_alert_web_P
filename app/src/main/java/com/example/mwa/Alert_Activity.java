package com.example.mwa;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;

public class Alert_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);
    }

    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(Alert_Activity.this);


        builder.setMessage("Do you want to return to the main page?");


        builder.setTitle("Alert !");


        builder.setCancelable(false);


        builder.setPositiveButton("Yes", (DialogInterface.OnClickListener) (dialog, which) -> {

            finish();
        });


        builder.setNegativeButton("No", (DialogInterface.OnClickListener) (dialog, which) -> {

            dialog.cancel();
        });


        AlertDialog alertDialog = builder.create();

        alertDialog.show();
    }

}
