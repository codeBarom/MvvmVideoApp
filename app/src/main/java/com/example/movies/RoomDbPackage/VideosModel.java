package com.example.movies.RoomDbPackage;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity(tableName = "videos_table")
public class VideosModel {

        @PrimaryKey(autoGenerate = true)
        private int video_id;
        @ColumnInfo(name = "title")
        private String title;
        @ColumnInfo(name = "description")
        @SerializedName("description")
        @Expose
        private String description;
        @ColumnInfo(name = "image")
        @SerializedName("image")
        @Expose
        private String image;
        @ColumnInfo(name = "year")
        @SerializedName("year")
        @Expose
        private int year;

        public VideosModel(int video_id, String title, String description, String image, int year) {
                this.video_id = video_id;
                this.title = title;
                this.description = description;
                this.image = image;
                this.year = year;
        }

        public int getVideo_id() {
                return video_id;
        }

        public void setVideo_id(int video_id) {
                this.video_id = video_id;
        }

        public String getTitle() {
                return title;
        }

        public void setTitle(String title) {
                this.title = title;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public String getImage() {
                return image;
        }

        public void setImage(String image) {
                this.image = image;
        }

        public int getYear() {
                return year;
        }

        public void setYear(int year) {
                this.year = year;
        }
}
