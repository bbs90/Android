package com.example.light.myapplicationwebview;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            if (Uri.parse(url).getHost().equals("www.example.com")) {
                // This is my web site, so do not override; let my WebView load the page
                return false;
            }
            // Otherwise, the link is not for a page on my site, so launch another Activity that handles URLs
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
            return true;
        }
    }
    */


    public void onEnters(View view) {
        EditText field1 = (EditText) findViewById(R.id.editText);

        String url = field1.getText().toString();

        connectionDetector cd = new connectionDetector(getApplicationContext());

        if (cd.isConnectedToNetwork()) {
            WebView wv1 = (WebView) findViewById(R.id.webView);
            //wv1.setWebViewClient(new MyWebViewClient());
            wv1.getSettings().setLoadsImagesAutomatically(true);
            wv1.getSettings().setJavaScriptEnabled(true);
            wv1.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
            wv1.loadUrl("https://" + url);
        }
        else{
            Context context1 = getApplicationContext();
            CharSequence text = "No Internet Connection";
            int duration = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(context1, text, duration);
            toast.show();
        }
    }
}

