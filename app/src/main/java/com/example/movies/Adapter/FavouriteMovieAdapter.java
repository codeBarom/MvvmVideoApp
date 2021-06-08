package com.example.movies.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.movies.R;
import com.example.movies.RoomDbPackage.VideosModel;
import com.squareup.picasso.Picasso;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class FavouriteMovieAdapter extends RecyclerView.Adapter<FavouriteMovieAdapter.FavouriteViewHolder> {

        private Context context;
        private List<VideosModel> videosModelList;

        public FavouriteMovieAdapter(Context context, List<VideosModel> videosModelList) {
                this.context = context;
                this.videosModelList = videosModelList;
        }

        @NonNull
        @NotNull
        @Override
        public FavouriteViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.favourite_movies, parent, false);
                return new FavouriteViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull @NotNull FavouriteViewHolder holder, int position) {
                VideosModel vidModel = videosModelList.get(position);
                holder.favourite_movie_title.setText(vidModel.getTitle());
                Picasso.get().load(vidModel.getImage()).into(holder.favourite_movie_image);
        }

        public VideosModel getVideoPosition(int position) {
                return videosModelList.get(position);
        }

        public void setVideosModelList(List<VideosModel> videosModels) {
                videosModelList = videosModels;
                notifyDataSetChanged();
        }

        @Override
        public int getItemCount() {
                if (videosModelList != null) {
                        return videosModelList.size();
                } else {
                        return 0;
                }
        }

        public static class FavouriteViewHolder extends RecyclerView.ViewHolder {

                private TextView favourite_movie_title;
                private ImageView favourite_movie_image;

                public FavouriteViewHolder(@NonNull @NotNull View itemView) {
                        super(itemView);

                        favourite_movie_image = itemView.findViewById(R.id.fav_mov_image);
                        favourite_movie_title = itemView.findViewById(R.id.fav_mov_title);
                }
        }
}
