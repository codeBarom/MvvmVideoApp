package com.example.movies.Utilities;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import androidx.annotation.NonNull;

public class Utils {

        public boolean isNetworkAvailable(@NonNull Context context) {
                ConnectivityManager connectMgr;
                connectMgr = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo activeNetworkInfo = connectMgr.getActiveNetworkInfo();
                return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        }
}
