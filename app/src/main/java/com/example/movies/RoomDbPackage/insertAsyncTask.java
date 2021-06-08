package com.example.movies.RoomDbPackage;

import android.os.AsyncTask;

import com.example.movies.Model.Video;

public class insertAsyncTask extends AsyncTask<VideosModel, Void, Void> {
        private final VideoDao insertVideoTask;

        public insertAsyncTask(VideoDao videoDao) {
                this.insertVideoTask = videoDao;
        }

        @Override
        protected Void doInBackground(VideosModel... videos) {
                insertVideoTask.insert(videos[0]);
                return null;
        }
}
