package com.example.flicks.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.flicks.R;
import com.example.flicks.models.Movie;

import java.util.List;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.ViewHolder> {

    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    public class ViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        TextView tvTitle;
        TextView tvOverview;
        ImageView ivPoster;

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);

            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvOverview = itemView.findViewById(R.id.tvOverview);
            ivPoster = itemView.findViewById(R.id.ivPoster);
        }
    }

    // Store a member variable for the contacts
    private List<Movie> mMovie;

    // Pass in the contact array into the constructor
    public MoviesAdapter(List<Movie> movies) {
        mMovie = movies;
    }


    // Usually involves inflating a layout from XML and returning the holder
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout*
        View View = LayoutInflater.from(context).inflate(R.layout.item_movie, parent, false);

        // Return a new holder instance*
        ViewHolder viewHolder = new ViewHolder(View);
        return viewHolder;
    }

    // Involves populating data into the item through holder
    @Override
    public void onBindViewHolder(MoviesAdapter.ViewHolder viewHolder, int position) {
        // Get the data model based on position
        Movie movie = mMovie.get(position);

        // Set item views based on your views and data model
        TextView tvTitle = viewHolder.tvTitle;
        tvTitle.setText(movie.getTitle());
        TextView tvOverview = viewHolder.tvOverview;
        tvOverview.setText(movie.getOverview());
    }

    // Returns the total count of items in the list
    @Override
    public int getItemCount() {
        return mMovie.size();
    }
}




/*
 class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvTitle;
        TextView tvOverview;
        ImageView ivposter;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvOverview = itemView.findViewById(R.id.tvOverview);
            ivposter = itemView.findViewById(R.id.ivPoster);
        }

        public void bind(Movie movie) {
            tvTitle.setText(movie.getTitle());
            tvOverview.setText(movie.getOverview());
            Glide.with(context).load(movie.getPosterpath()).into(ivposter);
        }
    }
    */