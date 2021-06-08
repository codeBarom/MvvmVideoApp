package com.example.movies.RoomDbPackage;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.example.movies.Model.Video;

import org.jetbrains.annotations.NotNull;

@Database(entities = {VideosModel.class}, version = 1, exportSchema = false)
public abstract class VideoRoomDb extends RoomDatabase {

        public abstract VideoDao videoDao();
        private static VideoRoomDb instance;

        private static final RoomDatabase.Callback roomDatabaseCallback = new RoomDatabase.Callback() {
                @Override
                public void onOpen(@NonNull @NotNull SupportSQLiteDatabase db) {
                        super.onOpen(db);
                        new PopulateDbAsync(instance).execute();
                }
        };

        public static VideoRoomDb getVideoDatabase(final Context context){
                if (instance == null){
                        synchronized (VideoRoomDb.class){
                                if (instance == null){
                                        instance = Room.databaseBuilder(context.getApplicationContext(), VideoRoomDb.class, "videos_database")
                                                .fallbackToDestructiveMigration().addCallback(roomDatabaseCallback).build();
                                }
                        }
                }
                return instance;
        }

        private static class PopulateDbAsync extends AsyncTask<Void, Void, Void> {
                private final VideoDao videoDao;
                String[] testInformation = {"Game of thrones, Merlin, Avatar, Blacklist"};

                public PopulateDbAsync(VideoRoomDb instance) {
                        videoDao = instance.videoDao();
                }

                @Override
                protected Void doInBackground(Void... voids) {
                        videoDao.deleteAll();
                        return null;
                }
        }
}
