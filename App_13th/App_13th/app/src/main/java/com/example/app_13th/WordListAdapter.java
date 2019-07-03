package com.example.app_13th;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder> {
    LayoutInflater mInflater;
    LinkedList<String> mWordList;

    public WordListAdapter (Context context, LinkedList<String> wordList) {
        mInflater = LayoutInflater.from(context);
        this.mWordList = wordList;
    }

    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Create view from layout
        View mItemView = mInflater.inflate(R.layout.text_view, parent, false);
        return new WordViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {
        String str = mWordList.get(position);
        holder.wordItemView.setText(str);
    }

    @Override
    public int getItemCount() {
        return mWordList.size();
    }

    public class WordViewHolder extends RecyclerView.ViewHolder  {
        TextView wordItemView;
        RecyclerView.Adapter mAdapter;

        public WordViewHolder(View itemView, WordListAdapter adapter) {
            super(itemView);
            // Get the layout
            wordItemView = itemView.findViewById(R.id.textView12);
            // Associate with this adapter
            this.mAdapter = adapter;
            // Add click listener, if desired
            // itemView.setOnClickListener(this);
        }

    }

}
