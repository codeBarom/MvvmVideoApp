package com.example.movies.RoomDbPackage;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class VideoRoomRepository {

        private final VideoDao videoDao;
        private final LiveData<List<VideosModel>> videosLiveDataList;

        public VideoRoomRepository(Application application) {
                VideoRoomDb videoRoomDb = VideoRoomDb.getVideoDatabase(application);
                videoDao = videoRoomDb.videoDao();
                videosLiveDataList = videoDao.getAllVideos();
        }

        public LiveData<List<VideosModel>> getVideosLiveDataList() {
                return videosLiveDataList;
        }

        public void insert(VideosModel video){
                new insertAsyncTask(videoDao).execute(video);
        }

        public void deleteAllVideos(){
                new deleteAllVideosAsyncTask(videoDao).execute();
        }

        public void deleteVideo(VideosModel video){
                new deleteVideoAsyncTask(videoDao).execute(video);
        }
}
