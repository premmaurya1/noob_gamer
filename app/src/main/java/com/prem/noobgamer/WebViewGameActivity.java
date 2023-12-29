package com.prem.noobgamer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.monstertechno.adblocker.AdBlockerWebView;

public class WebViewGameActivity extends AppCompatActivity {

    private WebView webView;
    private String gamelink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_game);

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