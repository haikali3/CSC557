package com.example.indiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Resume extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_resume);
        WebView webView = findViewById(R.id.myWebView);

        WebSettings settings = webView.getSettings();
        settings.setAllowFileAccess(true);

        webView.loadUrl("file:///android_asset/index.html");

    }
}