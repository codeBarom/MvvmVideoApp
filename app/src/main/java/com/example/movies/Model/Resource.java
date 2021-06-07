package com.example.movies.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Resource implements Serializable {

        @SerializedName("@type")
        @Expose
        private String type;
        @SerializedName("akas")
        @Expose
        private List<String> akas = null;
        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("image")
        @Expose
        private Image image;
        @SerializedName("legacyNameText")
        @Expose
        private String legacyNameText;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("size")
        @Expose
        private Integer size;
        @SerializedName("videoCounts")
        @Expose
        private List<VideoCount> videoCounts = null;
        @SerializedName("videos")
        @Expose
        private List<Video> videos = null;

        /**
         * No args constructor for use in serialization
         */
        public Resource() {
        }

        /**
         * @param akas
         * @param image
         * @param legacyNameText
         * @param size
         * @param name
         * @param videoCounts
         * @param videos
         * @param id
         * @param type
         */
        public Resource(String type, List<String> akas, String id, Image image, String legacyNameText, String name, Integer size, List<VideoCount> videoCounts, List<Video> videos) {
                super();
                this.type = type;
                this.akas = akas;
                this.id = id;
                this.image = image;
                this.legacyNameText = legacyNameText;
                this.name = name;
                this.size = size;
                this.videoCounts = videoCounts;
                this.videos = videos;
        }

        public String getType() {
                return type;
        }

        public void setType(String type) {
                this.type = type;
        }

        public List<String> getAkas() {
                return akas;
        }

        public void setAkas(List<String> akas) {
                this.akas = akas;
        }

        public String getId() {
                return id;
        }

        public void setId(String id) {
                this.id = id;
        }

        public Image getImage() {
                return image;
        }

        public void setImage(Image image) {
                this.image = image;
        }

        public String getLegacyNameText() {
                return legacyNameText;
        }

        public void setLegacyNameText(String legacyNameText) {
                this.legacyNameText = legacyNameText;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public Integer getSize() {
                return size;
        }

        public void setSize(Integer size) {
                this.size = size;
        }

        public List<VideoCount> getVideoCounts() {
                return videoCounts;
        }

        public void setVideoCounts(List<VideoCount> videoCounts) {
                this.videoCounts = videoCounts;
        }

        public List<Video> getVideos() {
                return videos;
        }

        public void setVideos(List<Video> videos) {
                this.videos = videos;
        }

}
