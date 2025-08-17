package com.jarvis.app;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.activity.ComponentActivity;

public class MainActivity extends ComponentActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    WebView wv = new WebView(this);
    setContentView(wv);
    wv.getSettings().setJavaScriptEnabled(true);
    wv.getSettings().setDomStorageEnabled(true);
    wv.setWebViewClient(new WebViewClient());
    // Loads our offline UI page packaged in assets
    wv.loadUrl("file:///android_asset/index.html");
  }
}
