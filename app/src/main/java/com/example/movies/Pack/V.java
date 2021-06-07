package com.example.movies.Pack;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class V {

        @SerializedName("i")
        @Expose
        private I__1 i;
        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("l")
        @Expose
        private String l;
        @SerializedName("s")
        @Expose
        private String s;

        /**
         * No args constructor for use in serialization
         */
        public V() {
        }

        /**
         * @param s
         * @param i
         * @param id
         * @param l
         */
        public V(I__1 i, String id, String l, String s) {
                super();
                this.i = i;
                this.id = id;
                this.l = l;
                this.s = s;
        }

        public I__1 getI() {
                return i;
        }

        public void setI(I__1 i) {
                this.i = i;
        }

        public String getId() {
                return id;
        }

        public void setId(String id) {
                this.id = id;
        }

        public String getL() {
                return l;
        }

        public void setL(String l) {
                this.l = l;
        }

        public String getS() {
                return s;
        }

        public void setS(String s) {
                this.s = s;
        }
}
