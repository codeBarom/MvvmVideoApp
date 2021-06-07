package com.example.movies.NetworkPack;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.facebook.stetho.BuildConfig;
import com.facebook.stetho.okhttp3.StethoInterceptor;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class BaseServices {

        /*private static final String MOVIES_BASE_URL = "https://imdb8.p.rapidapi.com/";*/
        private static final String MOVIES_BASE_URL = "https://imdb8.p.rapidapi.com/";
        /*private static final String AUTH = "";*/
        private static BaseServices baseServices;
        @Nullable
        private static Retrofit retrofit;


        private BaseServices() {

                HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
                if (BuildConfig.DEBUG) {
                        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
                }
                OkHttpClient okHttpClient = new OkHttpClient.Builder().connectTimeout(30, TimeUnit.MINUTES).readTimeout(30, TimeUnit.MINUTES).writeTimeout(30, TimeUnit.MINUTES).addNetworkInterceptor(new StethoInterceptor()).addInterceptor(
                        chain -> {
                                Request original = chain.request();
                                Request.Builder requestBuilder = original.newBuilder()
                                        .addHeader("x-rapidapi-key", "dbf0c980c8mshda35039ec1bb1eep14807cjsn194318adcc63")
                                        .addHeader("x-rapidapi-host", "imdb8.p.rapidapi.com")
                                        .method(original.method(), original.body());
                                Request request = requestBuilder.build();
                                return chain.proceed(request);
                        }
                ).addInterceptor(logging).build();

                Gson gson = new GsonBuilder().setLenient().create();
                retrofit = new Retrofit.Builder().baseUrl(MOVIES_BASE_URL).addConverterFactory(GsonConverterFactory.create(gson)).client(okHttpClient).build();
        }

        public static Retrofit retrofit() {
                return retrofit;
        }

        public static synchronized BaseServices getInstance() {
                if (baseServices == null) {
                        baseServices = new BaseServices();
                }

                return baseServices;
        }

        @NonNull
        public EndPoints getApiClient() {
                return Objects.requireNonNull(retrofit).create(EndPoints.class);
        }
}
