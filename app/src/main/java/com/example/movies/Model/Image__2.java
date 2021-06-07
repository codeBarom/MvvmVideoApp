package com.example.movies.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Image__2 implements Serializable {

        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("width")
        @Expose
        private Integer width;

        /**
         * No args constructor for use in serialization
         */
        public Image__2() {
        }

        /**
         * @param width
         * @param id
         * @param url
         * @param height
         */
        public Image__2(Integer height, String id, String url, Integer width) {
                super();
                this.height = height;
                this.id = id;
                this.url = url;
                this.width = width;
        }

        public Integer getHeight() {
                return height;
        }

        public void setHeight(Integer height) {
                this.height = height;
        }

        public String getId() {
                return id;
        }

        public void setId(String id) {
                this.id = id;
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
