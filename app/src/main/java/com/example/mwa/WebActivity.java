package com.example.mwa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        EditText webeditid = (EditText) findViewById(R.id.webeditid);
        WebView webvid = (WebView) findViewById(R.id.webvid);
        Button webbtnid = (Button)  findViewById(R.id.webbtnid);
        webbtnid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webvid.loadUrl(webeditid.getText().toString());
                webvid.getSettings().setJavaScriptEnabled(true);
                webvid.setWebViewClient(new WebViewClient());
            }
        });
    }
}