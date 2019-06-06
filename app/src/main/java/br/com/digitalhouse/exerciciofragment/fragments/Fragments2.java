package br.com.digitalhouse.exerciciofragment.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.digitalhouse.exerciciofragment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragments2 extends Fragment {


    public Fragments2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragments2, container, false);
    }

}
