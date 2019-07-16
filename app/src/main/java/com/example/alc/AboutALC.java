package com.example.alc;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.strictmode.WebViewMethodCalledOnWrongThreadViolation;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutALC extends AppCompatActivity {

    private WebView wvALC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String wvURL = "https://www.google.com/";
//        https://andela.com/alc/

        wvALC = findViewById(R.id.wv_ALC);

        WebSettings webSettings = wvALC.getSettings();
        webSettings.setJavaScriptEnabled(true);

        wvALC.setWebViewClient(new WebViewClient());
        wvALC.loadUrl(wvURL);

//        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(wvURL));
//        startActivity(intent);

    }

    @Override
    public void onBackPressed() {
        if (wvALC.canGoBack()){
            wvALC.goBack();
        }
        else {
            super.onBackPressed();
        }
    }


}
