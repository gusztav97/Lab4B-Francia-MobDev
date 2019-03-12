package com.example.jsu.tablayoutdemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tab2Fragment extends Fragment implements View.OnClickListener{


    public Tab2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.content_tip, container, false);

        Button b = (Button)v.findViewById(R.id.button2); // Acquire button reference
        b.setOnClickListener(this);                     // Set event handler

        return v;
    }

    public void onClick(View v){
        String totalBill = ((EditText) getView().findViewById(R.id.totalBill)).getText().toString();
        String tipPercentage = ((EditText) getView().findViewById(R.id.tipPercentage)).getText().toString();
        String numberOfPeople = ((EditText) getView().findViewById(R.id.numOfPeople)).getText().toString();
        DecimalFormat df = new DecimalFormat("#.##");

        double totalBillEdit = Double.parseDouble(totalBill);
        double tipPercentageEdit = Double.parseDouble(tipPercentage);
        double numOfPeopleEdit = Double.parseDouble(numberOfPeople);

        double ActualAmountPerPerson = totalBillEdit / numOfPeopleEdit;
        double ActualTipPerPerson = (totalBillEdit * (tipPercentageEdit/100)) / numOfPeopleEdit;
        double totalPerPerson = ActualAmountPerPerson + ActualTipPerPerson;

        ((EditText) getView().findViewById(R.id.totalPerPerson)).setText( df.format(totalPerPerson) );



    }
}
