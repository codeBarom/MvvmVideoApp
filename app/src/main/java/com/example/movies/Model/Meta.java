package com.example.movies.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Meta implements Serializable {

        @SerializedName("operation")
        @Expose
        private String operation;
        @SerializedName("requestId")
        @Expose
        private String requestId;
        @SerializedName("serviceTimeMs")
        @Expose
        private Double serviceTimeMs;

        /**
         * No args constructor for use in serialization
         */
        public Meta() {
        }

        /**
         * @param requestId
         * @param serviceTimeMs
         * @param operation
         */
        public Meta(String operation, String requestId, Double serviceTimeMs) {
                super();
                this.operation = operation;
                this.requestId = requestId;
                this.serviceTimeMs = serviceTimeMs;
        }

        public String getOperation() {
                return operation;
        }

        public void setOperation(String operation) {
                this.operation = operation;
        }

        public String getRequestId() {
                return requestId;
        }

        public void setRequestId(String requestId) {
                this.requestId = requestId;
        }

        public Double getServiceTimeMs() {
                return serviceTimeMs;
        }

        public void setServiceTimeMs(Double serviceTimeMs) {
                this.serviceTimeMs = serviceTimeMs;
        }

}
