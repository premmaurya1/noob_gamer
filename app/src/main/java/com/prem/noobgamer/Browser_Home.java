package com.prem.noobgamer;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.monstertechno.adblocker.AdBlockerWebView;
import com.monstertechno.adblocker.util.AdBlocker;

public class Browser_Home extends WebViewClient {

    Browser_Home() {}

    @SuppressWarnings("deprecation")
    @Override
    public WebResourceResponse shouldInterceptRequest(WebView view, String url) {

        return AdBlockerWebView.blockAds(view,url) ? AdBlocker.createEmptyResource():
                super.shouldInterceptRequest(view, url);

    }
}
