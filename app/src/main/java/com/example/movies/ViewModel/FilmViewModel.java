package com.example.movies.ViewModel;

import android.os.AsyncTask;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.movies.Model.Films;
import com.example.movies.MoviesRepository.FilmRepository;

import java.util.List;

public class FilmViewModel extends ViewModel {
        private MutableLiveData<Films> filmsMutableLiveData;
        private FilmRepository filmRepository;
        private MutableLiveData<Boolean> isUpdating = new MutableLiveData<>();

        public void init(){
                if (filmsMutableLiveData != null){
                        return;
                }
                filmRepository = FilmRepository.getInstance();
                filmsMutableLiveData = filmRepository.getFilms();
        }

        public LiveData<Films> getFilmsLiveData(){
                return filmsMutableLiveData;
        }
}
