package com.example.project;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;


public class one_oneFragment extends Fragment {
    ImageButton ib1, ib2, ib3, ib4, ib5, ib6, ib7,ib8, ib9, ib10, ib11, ib12, ib13, ib14,ib15,ib16,ib17,ib18,ib19,ib20,ib21,ib22,ib23,ib24,ib25,ib26,ib27,ib28;

   //фрагмент с картинками 1 типа

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one_one, container, false);

    }
    public void forButton(ImageView image){



        Intent intent = new Intent(one_oneFragment.this, TwoClass.class);
        intent.putExtra("image", image);
        startActivity(intent);


    }
}