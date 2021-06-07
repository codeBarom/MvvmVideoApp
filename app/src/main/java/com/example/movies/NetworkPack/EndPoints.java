package com.example.movies.NetworkPack;

import com.example.movies.Model.Films;
import com.example.movies.Pack.Movies;

import retrofit2.Call;
import retrofit2.http.GET;

public interface EndPoints {

        @GET("auto-complete?q=action")
        Call<Movies> getAllAvailableMovies();

        @GET("actors/get-all-videos?nconst=nm0001667&region=US")
        Call<Films> getAllFilms();
}
