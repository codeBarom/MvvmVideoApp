package com.example.movies.RoomDbPackage;

import android.os.AsyncTask;

public class deleteAllVideosAsyncTask extends AsyncTask<Void, Void, Void> {

        private final VideoDao deleteAllTask;
        public deleteAllVideosAsyncTask(VideoDao videoDao) {
                this.deleteAllTask = videoDao;
        }

        @Override
        protected Void doInBackground(Void... voids) {
                deleteAllTask.deleteAll();
                return null;
        }
}
