package com.example.movies.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Films implements Serializable {

        @SerializedName("@meta")
        @Expose
        private Meta meta;
        @SerializedName("resource")
        @Expose
        private Resource resource;

        /**
         * No args constructor for use in serialization
         *
         */
        public Films() {
        }

        /**
         *
         * @param resource
         * @param meta
         */
        public Films(Meta meta, Resource resource) {
                super();
                this.meta = meta;
                this.resource = resource;
        }

        public Meta getMeta() {
                return meta;
        }

        public void setMeta(Meta meta) {
                this.meta = meta;
        }

        public Resource getResource() {
                return resource;
        }

        public void setResource(Resource resource) {
                this.resource = resource;
        }

}

