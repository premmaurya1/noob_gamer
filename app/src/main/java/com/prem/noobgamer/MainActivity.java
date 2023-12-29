package com.prem.noobgamer;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

public class MainActivity extends Activity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        new AdBlockerWebView.init(this).initializeWebView(game);
//        game.getSettings().setSupportMultipleWindows(true);
//        game.getSettings().setJavaScriptEnabled(true);
//        game.getSettings().setAllowContentAccess(true);
//        game.getSettings().setDatabaseEnabled(true);
//        game.getSettings().setAllowFileAccess(true);
//        game.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
//        game.getSettings().setDomStorageEnabled(true);
//        game.getSettings().setBuiltInZoomControls(true);
//        game.getSettings().setGeolocationEnabled(true);
       // game.getSettings().setPluginState(WebSettings.PluginState.ON);

//        game.setWebViewClient(new Browser_Home());

//        String gameUrl  = "https://html5.gamedistribution.com/639df47033804f18bf39e113ef29f4fa/";
//        game.loadUrl(gameUrl);

        webView = findViewById(R.id.webView);

//        new AdBlockerWebView.init(this).initializeWebView(webView);
        webView.getSettings().setSupportMultipleWindows(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAllowContentAccess(true);
        webView.getSettings().setDatabaseEnabled(true);
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setGeolocationEnabled(true);
        webView.setWebViewClient(new WebViewClient());
//        webView.getSettings().setPluginState(WebSettings.PluginState.ON);
//        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
//        webView.setWebViewClient(new Browser_Home());


//        gamelink= getIntent().getStringExtra("gameLink");


        webView.loadUrl("https://html5.gamedistribution.com/63137d6d920145f68f3efddfe0f45675/?gd_sdk_referrer_url=https://gamedistribution.com/games/vex-3-xmas");  // HERE PASTE YOUR GAME URL


    }
}