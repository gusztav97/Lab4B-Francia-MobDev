package com.example.jsu.tablayoutdemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tab1Fragment extends Fragment implements View.OnClickListener{


    public Tab1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_tab1, container, false);

        Button b = (Button)v.findViewById(R.id.button); // Acquire button reference
        b.setOnClickListener(this);                     // Set event handler

        return v;

    }

    @Override
    public void onClick(View v){

        TextView t = (TextView) getView().findViewById(R.id.textView2); // Acquire button reference
        t.setText("Hello World");
    }
}
