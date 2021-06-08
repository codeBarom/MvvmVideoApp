package com.example.movies.SharedPrefManager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

import com.example.movies.RoomDbPackage.VideosModel;

public class SharedPref {

        private static final String PREF_NAME = "pms_shared_pref";
        private static final String VIDEO_IMAGE = "video_image";
        private static final String VIDEO_TITLE = "video_title";
        private static final String VIDEO_YEAR = "video_year";


        @SuppressLint("StaticFieldLeak")
        private static SharedPref mInstance;
        private final Context mContext;

        public SharedPref(Context mContext) {
                this.mContext = mContext;
        }

        public static synchronized SharedPref getInstance(Context mContext) {
                if (mInstance == null) {
                        mInstance = new SharedPref(mContext);
                }
                return mInstance;
        }

        public void storeVideoTitle(String title) {
                SharedPreferences sharedPreferences = mContext.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(VIDEO_TITLE, title);
                editor.apply();
        }

        public String getVideoTitle() {
                SharedPreferences sharedPreferences = mContext.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
                return sharedPreferences.getString(VIDEO_TITLE, null);
        }

        public void storeVideoImage(String image) {
                SharedPreferences sharedPreferences = mContext.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(VIDEO_IMAGE, image);
                editor.apply();
        }

        public String getVideoImage() {
                SharedPreferences sharedPreferences = mContext.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
                return sharedPreferences.getString(VIDEO_IMAGE, null);
        }

        public void clearStoredData() {
                SharedPreferences sharedPreferences = mContext.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.apply();
        }
}
