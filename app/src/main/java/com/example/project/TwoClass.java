package com.example.project;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class TwoClass extends AppCompatActivity {
    Button b1,b2,b3,b4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two_two_layout);


    }
    public void Change(View view){
        Fragment fragment=null;
        switch (view.getId()){
            case R.id.b1:
                fragment = new oneFragment();
                break;
            case R.id.b2:
                fragment = new twoFragment();
                break;
            case R.id.b3:

                break;
            case R.id.b4:
                break;

        }
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.f1, fragment);
        ft.commit();

    }

}
