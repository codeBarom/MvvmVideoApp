package com.example.movies.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Image__1 implements Serializable {

        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("width")
        @Expose
        private Integer width;

        /**
         * No args constructor for use in serialization
         */
        public Image__1() {
        }

        /**
         * @param width
         * @param url
         * @param height
         */
        public Image__1(Integer height, String url, Integer width) {
                super();
                this.height = height;
                this.url = url;
                this.width = width;
        }

        public Integer getHeight() {
                return height;
        }

        public void setHeight(Integer height) {
                this.height = height;
        }

        public String getUrl() {
                return url;
        }

        public void setUrl(String url) {
                this.url = url;
        }

        public Integer getWidth() {
                return width;
        }

        public void setWidth(Integer width) {
                this.width = width;
        }

}
