package com.example.project;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


public class one_oneFragment extends Fragment {
    ImageButton ib1, ib2, ib3, ib4, ib5;
    ImageButton ib11, ib22, ib33, ib44, ib55;

   //фрагмент с картинками 1 типа

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one_one, container, false);

    }
}