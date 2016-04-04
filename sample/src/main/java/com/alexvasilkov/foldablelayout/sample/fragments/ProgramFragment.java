package com.alexvasilkov.foldablelayout.sample.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.alexvasilkov.foldablelayout.sample.R;


/**
 * A simple {@link } subclass.
 */
public class ProgramFragment extends ListFragment {


    public ProgramFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_program, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
      //  ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(), R.array.Programs, android.R.layout.simple_list_item_1);
      //  setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        //Intent intentYearbook = new Intent(getActivity(), YearBookActivity.class);
        //startActivity(intentYearbook);
    }
}