package com.example.jsu.tablayoutdemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tab3Fragment extends Fragment implements View.OnClickListener{


    public Tab3Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.content_temperature, container, false);

        Button b = (Button)v.findViewById(R.id.button); // Acquire button reference
        b.setOnClickListener(this);                     // Set event handler

        return v;
    }

    public void onClick(View v){
        String f = ((EditText) getView().findViewById(R.id.inputF)).getText().toString();
        String c = ((EditText) getView().findViewById(R.id.inputC)).getText().toString();
        if (f.isEmpty()){

            if (!c.isEmpty() ) {

                double celsius = Double.parseDouble(c);
                double fahrenheit = ((celsius * 9 / 5) + 32);

                ((EditText) getView().findViewById(R.id.inputF)).setText( Double.toString(fahrenheit) );

            }

        }

        else {

            double fahrenheit = Double.parseDouble(f);
            double celsius = ((fahrenheit - 32) * 5 / 9);

            ((EditText) getView().findViewById(R.id.inputC)).setText( Double.toString(celsius) );

        }

    }

}
