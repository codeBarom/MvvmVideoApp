package com.example.movies.Pack;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Movies {

        @SerializedName("d")
        @Expose
        private List<D> d = new ArrayList<>();
        @SerializedName("q")
        @Expose
        private String q;
        @SerializedName("v")
        @Expose
        private Integer v;

        /**
         * No args constructor for use in serialization
         */
        public Movies() {
        }

        /**
         * @param q
         * @param d
         * @param v
         */
        public Movies(List<D> d, String q, Integer v) {
                super();
                this.d = d;
                this.q = q;
                this.v = v;
        }

        public List<D> getD() {
                return d;
        }

        public void setD(List<D> d) {
                this.d = d;
        }

        public String getQ() {
                return q;
        }

        public void setQ(String q) {
                this.q = q;
        }

        public Integer getV() {
                return v;
        }

        public void setV(Integer v) {
                this.v = v;
        }

}
