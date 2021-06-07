package com.example.movies.MoviesRepository;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.example.movies.Model.Films;
import com.example.movies.NetworkPack.BaseServices;

import org.jetbrains.annotations.NotNull;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FilmRepository {

        private static final String TAG = "FilmRepository";
        private static FilmRepository instance;

        public static FilmRepository getInstance(){
                if (instance == null){
                        instance = new FilmRepository();
                }
                return instance;
        }

        public MutableLiveData<Films> getFilms(){
                MutableLiveData<Films> filmsMutableLiveData = new MutableLiveData<>();
                Call<Films> call = BaseServices.getInstance().getApiClient().getAllFilms();
                call.enqueue(new Callback<Films>() {
                        @Override
                        public void onResponse(@NotNull Call<Films> call, @NotNull Response<Films> response) {
                                if (call.isExecuted()) Log.e(TAG, "onResponse: " + "Films request was executed");
                                try {
                                        if (response.isSuccessful()){
                                                Films films = response.body();
                                                filmsMutableLiveData.postValue(films);
                                                Log.e(TAG, "onResponseSuccessful: " + response.raw());
                                        }else {
                                                Log.e(TAG, "onResponseError: " + response.raw());
                                        }
                                } catch (Exception e) {
                                        e.printStackTrace();
                                }
                        }

                        @Override
                        public void onFailure(@NotNull Call<Films> call, @NotNull Throwable t) {
                                Log.e(TAG, "onFailure: " + t.getLocalizedMessage());
                        }
                });
                return filmsMutableLiveData;
        }
}
