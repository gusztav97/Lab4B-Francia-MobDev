package com.example.jsu.tablayoutdemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.*;
import android.widget.*;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;


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
        View v = inflater.inflate(R.layout.content_distance, container, false);

        Button b = (Button)v.findViewById(R.id.button4); // Acquire button reference
        b.setOnClickListener(this);                     // Set event handler

        return v;

    }

    @Override
    public void onClick(View v){
        String miles = ((EditText) getView().findViewById(R.id.inputMiles)).getText().toString();
        String kms = ((EditText) getView().findViewById(R.id.inputKilometers)).getText().toString();
        if (miles.isEmpty()){

            if (!kms.isEmpty() ) {


                double editKilometers = Double.parseDouble(kms);
                double editMiles = editKilometers * 0.621371;

                ((EditText) getView().findViewById(R.id.inputMiles)).setText( Double.toString(editMiles) );

            }

        }

        else {

            double editMiles = Double.parseDouble(miles);
            double editKilometers = editMiles * 1.60934;

            ((EditText) getView().findViewById(R.id.inputKilometers)).setText( Double.toString(editKilometers) );

        }

    }
}
