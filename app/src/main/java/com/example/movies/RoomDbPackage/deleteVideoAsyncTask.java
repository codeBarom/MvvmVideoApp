package com.example.movies.RoomDbPackage;

import android.os.AsyncTask;

import com.example.movies.Model.Video;

public class deleteVideoAsyncTask extends AsyncTask<VideosModel, Video, Video> {

        private final VideoDao deleteVideoTask;
        public deleteVideoAsyncTask(VideoDao videoDao) {
                this.deleteVideoTask = videoDao;
        }

        @Override
        protected Video doInBackground(VideosModel... videos) {
                deleteVideoTask.deleteVideos(videos[0]);
                return null;
        }
}
