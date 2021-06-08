package com.example.movies.Activities;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.example.movies.Adapter.FavouriteMovieAdapter;
import com.example.movies.Model.Video;
import com.example.movies.R;
import com.example.movies.RoomDbPackage.VideoRoomViewModel;
import com.example.movies.RoomDbPackage.VideosModel;
import com.example.movies.SharedPrefManager.SharedPref;
import com.example.movies.databinding.ActivityFavouriteMoviesBinding;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class FavouriteMovies extends AppCompatActivity {

        ActivityFavouriteMoviesBinding activityFavouriteMoviesBinding;
        private List<VideosModel> videosModelList;
        private VideoRoomViewModel videoRoomViewModel;
        private FavouriteMovieAdapter favouriteMovieAdapter;
        private SharedPref sharedPref;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                activityFavouriteMoviesBinding = DataBindingUtil.setContentView(this, R.layout.activity_favourite_movies);
                videoRoomViewModel = ViewModelProviders.of(this).get(VideoRoomViewModel.class);
                sharedPref = new SharedPref(this);
                sharedPref.clearStoredData();

                initRecyclerView();
        }

        private void initRecyclerView() {
                videosModelList = new ArrayList<>();
                favouriteMovieAdapter = new FavouriteMovieAdapter(this, videosModelList);
                int orientation = this.getResources().getConfiguration().orientation;
                if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
                        activityFavouriteMoviesBinding.favouriteMovieRecycler.setLayoutManager(new GridLayoutManager(this, 4));
                } else {
                        activityFavouriteMoviesBinding.favouriteMovieRecycler.setLayoutManager(new GridLayoutManager(this, 2));
                }
                activityFavouriteMoviesBinding.favouriteMovieRecycler.setAdapter(favouriteMovieAdapter);

                Video filmsResponse = (Video) getIntent().getSerializableExtra("films");
                videoRoomViewModel.getVideosLiveData().observe(this, favouriteMovieAdapter::setVideosModelList);
                /*VideosModel videosModel = new VideosModel(sharedPref.getVideoTitle(), null, sharedPref.getVideoImage());*/
                VideosModel videosModel = new VideosModel(sharedPref.getVideoTitle(), null, sharedPref.getVideoImage());
                videoRoomViewModel.insert(videosModel);

                swipeDelete();
        }

        private void swipeDelete() {
                ItemTouchHelper touchHelper = new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT) {
                        @Override
                        public boolean onMove(@NonNull @NotNull RecyclerView recyclerView, @NonNull @NotNull RecyclerView.ViewHolder viewHolder, @NonNull @NotNull RecyclerView.ViewHolder target) {
                                return false;
                        }

                        @Override
                        public void onSwiped(@NonNull @NotNull RecyclerView.ViewHolder viewHolder, int direction) {
                                int position = viewHolder.getAdapterPosition();
                                VideosModel videosModel = favouriteMovieAdapter.getVideoPosition(position);
                                Toast.makeText(FavouriteMovies.this, "Deleting...", Toast.LENGTH_SHORT).show();
                        }
                });
                touchHelper.attachToRecyclerView(activityFavouriteMoviesBinding.favouriteMovieRecycler);
        }
}