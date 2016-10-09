package com.example.light.myapplicationwebview;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by light on 10/8/16.
 */
public class connectionDetector {

    private Context _context;

    public connectionDetector(Context context) {
        this._context = context;
    }

    public boolean isConnectedToNetwork(){
        ConnectivityManager cm =
                (ConnectivityManager)_context.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        boolean isConnected = activeNetwork != null &&
                activeNetwork.isConnectedOrConnecting();

        return isConnected;

    }
}
