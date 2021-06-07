package com.example.movies.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class PrimaryTitle implements Serializable {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("image")
        @Expose
        private Image__2 image;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("titleType")
        @Expose
        private String titleType;
        @SerializedName("year")
        @Expose
        private Integer year;

        /**
         * No args constructor for use in serialization
         */
        public PrimaryTitle() {
        }

        /**
         * @param image
         * @param titleType
         * @param year
         * @param id
         * @param title
         */
        public PrimaryTitle(String id, Image__2 image, String title, String titleType, Integer year) {
                super();
                this.id = id;
                this.image = image;
                this.title = title;
                this.titleType = titleType;
                this.year = year;
        }

        public String getId() {
                return id;
        }

        public void setId(String id) {
                this.id = id;
        }

        public Image__2 getImage() {
                return image;
        }

        public void setImage(Image__2 image) {
                this.image = image;
        }

        public String getTitle() {
                return title;
        }

        public void setTitle(String title) {
                this.title = title;
        }

        public String getTitleType() {
                return titleType;
        }

        public void setTitleType(String titleType) {
                this.titleType = titleType;
        }

        public Integer getYear() {
                return year;
        }

        public void setYear(Integer year) {
                this.year = year;
        }

}
