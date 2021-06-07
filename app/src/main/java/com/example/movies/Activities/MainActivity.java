package com.example.movies.Activities;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;

import com.example.movies.Adapter.FilmsAdapter;
import com.example.movies.R;
import com.example.movies.Utilities.Utils;
import com.example.movies.ViewModel.FilmViewModel;
import com.example.movies.databinding.ActivityMainBinding;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

        private ActivityMainBinding mainBinding;
        private final Utils utils = new Utils();
        private FilmsAdapter filmsAdapter;
        private FilmViewModel filmViewModel;
        int orientation;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
                filmViewModel = ViewModelProviders.of(this).get(FilmViewModel.class);

                mainBinding.progressBar.setVisibility(View.VISIBLE);
                filmViewModel.init();
                filmViewModel.getFilmsLiveData().observe(this, movies -> {
                        initRecyclerView();
                        filmsAdapter.notifyDataSetChanged();
                });
        }

        private void initRecyclerView() {
                filmsAdapter = new FilmsAdapter(Objects.requireNonNull(filmViewModel.getFilmsLiveData().getValue()), this);

                if (filmsAdapter.getItemCount() == 0)
                if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
                        mainBinding.movRecycler.setLayoutManager(new GridLayoutManager(this, 4));
                }else {
                        mainBinding.movRecycler.setLayoutManager(new GridLayoutManager(this, 2));
                }
                mainBinding.movRecycler.setAdapter(filmsAdapter);
        }
}