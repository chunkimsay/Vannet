package com.example.fragment.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragment.R;

public class FrageMant_tt extends Fragment {

    public static FrageMant_tt newInstance() {
        return new FrageMant_tt();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_new_color,container, false);
        return view;
        //return inflater.inflate(R.layout.fragment_tt,container, false);
    }
}
