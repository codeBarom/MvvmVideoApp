package com.example.movies.RoomDbPackage;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.movies.Model.Video;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class VideoRoomViewModel extends AndroidViewModel {

        private final VideoRoomRepository videoRoomRepository;
        private final LiveData<List<VideosModel>> videosLiveData;

        public VideoRoomViewModel(@NonNull @NotNull Application application) {
                super(application);
                videoRoomRepository = new VideoRoomRepository(application);
                videosLiveData = videoRoomRepository.getVideosLiveDataList();
        }

        public LiveData<List<VideosModel>> getVideosLiveData() {
                return videosLiveData;
        }

        public void insert(VideosModel video){
                videoRoomRepository.insert(video);
        }

        public void deleteAllVideos(){
                videoRoomRepository.deleteAllVideos();
        }

        public void deleteVideo(VideosModel video){
                videoRoomRepository.deleteVideo(video);
        }
}
