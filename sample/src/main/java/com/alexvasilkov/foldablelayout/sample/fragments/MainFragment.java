package com.alexvasilkov.foldablelayout.sample.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alexvasilkov.foldablelayout.FoldableListLayout;
import com.alexvasilkov.foldablelayout.sample.R;
import com.alexvasilkov.foldablelayout.sample.items.PaintingsAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        //FoldableListLayout foldableListLayout = Views.find(getActivity(), R.id.foldable_list);
        //foldableListLayout.setAdapter(new PaintingsAdapter(getActivity()));
        FoldableListLayout layout = (FoldableListLayout) rootView.findViewById(R.id.foldable_list);
        layout.setAdapter(new PaintingsAdapter(getActivity()));

        return rootView;

    }


}





