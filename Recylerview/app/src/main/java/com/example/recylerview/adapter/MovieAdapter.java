package com.example.recylerview.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recylerview.R;
import com.example.recylerview.model.Movie;

import java.util.LinkedList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {
    private LayoutInflater mLayoutInflater;
    private LinkedList<Movie> moviesList;
    Context context;

    public MovieAdapter(Context context, LinkedList<Movie> moviesList) {
        mLayoutInflater = LayoutInflater.from(context);
        this.moviesList = moviesList;
        this.context = context;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.wordlist_view, parent, false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        Movie movie = moviesList.get(position);

//        String des = movie.getDes();
//        String title = movie.getTitle();
//        int image = movie.getImage();
//
//        holder.desTv.setText(des);
//        holder.titleTv.setText(title);
//        holder.imageView.setImageResource(image);
        holder.desTv.setText(movie.getDes());
        holder.titleTv.setText(movie.getTitle());
        holder.imageView.setImageResource(movie.getImage());
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        // Declaration
        ImageView imageView;
        TextView titleTv, desTv;
        Button btn;
        MovieAdapter adapter;


        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
            // initj
            imageView = itemView.findViewById(R.id.thumnailImg);
            imageView.setOnClickListener(this);

            titleTv = itemView.findViewById(R.id.titleTvId);

            desTv = itemView.findViewById(R.id.textView);

            btn = itemView.findViewById(R.id.button);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "Hello" + getAdapterPosition(), Toast.LENGTH_SHORT).show();
                }
            });
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, "Hello" + getAdapterPosition(), Toast.LENGTH_SHORT).show();
                }
            });

      }

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(context, com.example.recylerview.detail.class);
            intent.putExtra("KEY_TITLE", titleTv.getText().toString());
            context.startActivity(intent);
            Toast.makeText(context, "Hello" + getAdapterPosition(), Toast.LENGTH_SHORT).show();
        }
    }
}