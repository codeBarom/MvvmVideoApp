package com.example.movies.RoomDbPackage;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.movies.Model.Video;

import java.util.List;

@Dao
public interface VideoDao {

        @Insert(onConflict = OnConflictStrategy.IGNORE)
        void insert(VideosModel video);

        @Query("DELETE FROM videos_table")
        void deleteAll();

        @Query("SELECT * from videos_table ORDER BY title ASC")
        LiveData<List<VideosModel>> getAllVideos();

        @Query("SELECT * from videos_table LIMIT 1")
        Video[] getAnyVideo();

        @Delete
        void deleteVideos(VideosModel video);
}
