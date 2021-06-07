package com.example.movies.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class VideoCount implements Serializable {

        @SerializedName("contentType")
        @Expose
        private String contentType;
        @SerializedName("count")
        @Expose
        private Integer count;

        /**
         * No args constructor for use in serialization
         */
        public VideoCount() {
        }

        /**
         * @param count
         * @param contentType
         */
        public VideoCount(String contentType, Integer count) {
                super();
                this.contentType = contentType;
                this.count = count;
        }

        public String getContentType() {
                return contentType;
        }

        public void setContentType(String contentType) {
                this.contentType = contentType;
        }

        public Integer getCount() {
                return count;
        }

        public void setCount(Integer count) {
                this.count = count;
        }
}
