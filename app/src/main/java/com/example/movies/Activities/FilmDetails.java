package com.example.movies.Activities;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.movies.Model.Video;
import com.example.movies.R;
import com.example.movies.databinding.ActivityFilmDetailsBinding;
import com.squareup.picasso.Picasso;

public class FilmDetails extends AppCompatActivity {

        ActivityFilmDetailsBinding activityFilmDetailsBinding;
        private String title, type, image;
        private int year;
        private Video filmsResponse;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                getWindow().setStatusBarColor(Color.TRANSPARENT);
                activityFilmDetailsBinding = DataBindingUtil.setContentView(this, R.layout.activity_film_details);

                filmsResponse = (Video) getIntent().getSerializableExtra("films");

                Picasso.get().load(String.valueOf(filmsResponse.getPrimaryTitle().getImage().getUrl())).into(activityFilmDetailsBinding.filmImage);
                activityFilmDetailsBinding.filmTitle.setText(filmsResponse.getPrimaryTitle().getTitle());
                activityFilmDetailsBinding.filmType.setText(filmsResponse.getPrimaryTitle().getTitleType());
                //activityFilmDetailsBinding.filmYear.setText(filmsResponse.getPrimaryTitle().getYear());
        }
}