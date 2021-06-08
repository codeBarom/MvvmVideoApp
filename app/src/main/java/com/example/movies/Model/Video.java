package com.example.movies.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class Video implements Serializable {


        @SerializedName("audioLanguage")
        @Expose
        private String audioLanguage;

        @SerializedName("contentType")
        @Expose
        private String contentType;

        @SerializedName("description")
        @Expose
        private String description;

        @SerializedName("durationInSeconds")
        @Expose
        private Integer durationInSeconds;

        @SerializedName("id")
        @Expose
        private String id;

        @SerializedName("image")
        @Expose
        private Image__1 image;

        @SerializedName("primaryTitle")
        @Expose
        private PrimaryTitle primaryTitle;

        @SerializedName("title")
        @Expose
        private String title;

        /**
         * No args constructor for use in serialization
         */
        public Video() {
        }

        /**
         * @param primaryTitle
         * @param image
         * @param durationInSeconds
         * @param description
         * @param audioLanguage
         * @param id
         * @param title
         * @param contentType
         */
        public Video(String audioLanguage, String contentType, String description, Integer durationInSeconds, String id, Image__1 image, PrimaryTitle primaryTitle, String title) {
                super();
                this.audioLanguage = audioLanguage;
                this.contentType = contentType;
                this.description = description;
                this.durationInSeconds = durationInSeconds;
                this.id = id;
                this.image = image;
                this.primaryTitle = primaryTitle;
                this.title = title;
        }

        public String getAudioLanguage() {
                return audioLanguage;
        }

        public void setAudioLanguage(String audioLanguage) {
                this.audioLanguage = audioLanguage;
        }

        public String getContentType() {
                return contentType;
        }

        public void setContentType(String contentType) {
                this.contentType = contentType;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public Integer getDurationInSeconds() {
                return durationInSeconds;
        }

        public void setDurationInSeconds(Integer durationInSeconds) {
                this.durationInSeconds = durationInSeconds;
        }

        public String getId() {
                return id;
        }

        public void setId(String id) {
                this.id = id;
        }

        public Image__1 getImage() {
                return image;
        }

        public void setImage(Image__1 image) {
                this.image = image;
        }

        public PrimaryTitle getPrimaryTitle() {
                return primaryTitle;
        }

        public void setPrimaryTitle(PrimaryTitle primaryTitle) {
                this.primaryTitle = primaryTitle;
        }

        public String getTitle() {
                return title;
        }

        public void setTitle(String title) {
                this.title = title;
        }

}
