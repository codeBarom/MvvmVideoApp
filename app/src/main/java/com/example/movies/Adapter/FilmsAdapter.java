package com.example.movies.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.movies.Activities.FilmDetails;
import com.example.movies.Model.Films;
import com.example.movies.Model.Video;
import com.example.movies.R;
import com.squareup.picasso.Picasso;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class FilmsAdapter extends RecyclerView.Adapter<FilmsAdapter.FilmViewHolder> {

        private static final String POSITION = "position";
        private final Films filmsObject;
        private final List<Video> filmsList;
        private final Context context;

        public FilmsAdapter(Films filmsObject, Context context) {
                this.filmsObject = filmsObject;
                this.filmsList = filmsObject.getResource().getVideos();
                this.context = context;
        }

        @NonNull
        @NotNull
        @Override
        public FilmViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movies_list, parent, false);
                return new FilmViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull @NotNull FilmViewHolder holder, int position) {
                Video films = filmsList.get(position);
                if (films.getImage() != null)
                        Picasso.get().load(films.getImage().getUrl()).into(holder.movie_image);
                holder.movie_title.setText(films.getTitle());
                holder.filmLayout.setOnClickListener(v -> {
                        Intent intent = new Intent(context.getApplicationContext(), FilmDetails.class);
                        intent.putExtra(POSITION, position);
                        intent.putExtra("films", films);
                        context.startActivity(intent);
                });
        }

        @Override
        public int getItemCount() {
                if (filmsList != null) {
                        return filmsList.size();
                } else {
                        return 0;
                }
        }

        public static class FilmViewHolder extends RecyclerView.ViewHolder {
                private final ImageView movie_image;
                private final TextView movie_title;
                private final LinearLayout filmLayout;

                public FilmViewHolder(@NonNull @NotNull View itemView) {
                        super(itemView);

                        movie_image = itemView.findViewById(R.id.mov_image);
                        movie_title = itemView.findViewById(R.id.mov_title);
                        filmLayout = itemView.findViewById(R.id.film_layout);
                }
        }
}
