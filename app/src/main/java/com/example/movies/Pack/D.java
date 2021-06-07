package com.example.movies.Pack;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class D {

        @SerializedName("i")
        @Expose
        private I i;
        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("l")
        @Expose
        private String l;
        @SerializedName("q")
        @Expose
        private String q;
        @SerializedName("rank")
        @Expose
        private Integer rank;
        @SerializedName("s")
        @Expose
        private String s;
        @SerializedName("v")
        @Expose
        private List<V> v = null;
        @SerializedName("vt")
        @Expose
        private Integer vt;
        @SerializedName("y")
        @Expose
        private Integer y;

        /**
         * No args constructor for use in serialization
         *
         */
        public D() {
        }

        /**
         *
         * @param q
         * @param s
         * @param v
         * @param i
         * @param rank
         * @param y
         * @param id
         * @param l
         * @param vt
         */
        public D(I i, String id, String l, String q, Integer rank, String s, List<V> v, Integer vt, Integer y) {
                super();
                this.i = i;
                this.id = id;
                this.l = l;
                this.q = q;
                this.rank = rank;
                this.s = s;
                this.v = v;
                this.vt = vt;
                this.y = y;
        }

        public I getI() {
                return i;
        }

        public void setI(I i) {
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

        public String getQ() {
                return q;
        }

        public void setQ(String q) {
                this.q = q;
        }

        public Integer getRank() {
                return rank;
        }

        public void setRank(Integer rank) {
                this.rank = rank;
        }

        public String getS() {
                return s;
        }

        public void setS(String s) {
                this.s = s;
        }

        public List<V> getV() {
                return v;
        }

        public void setV(List<V> v) {
                this.v = v;
        }

        public Integer getVt() {
                return vt;
        }

        public void setVt(Integer vt) {
                this.vt = vt;
        }

        public Integer getY() {
                return y;
        }

        public void setY(Integer y) {
                this.y = y;
        }

}


