package com.alexvasilkov.foldablelayout.sample.fragments;


import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.alexvasilkov.foldablelayout.sample.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContactsFragment extends Fragment {




    public ContactsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_contacts, container, false);



        // Inflate the layout for this fragment
        return rootView;
    }


    }


   /* @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Intent intentChat = new Intent(getActivity(), Chat.class);
        intentChat.putExtra(ParseConstants.EXTRA_DATA, mFriends.get(position).getUsername());
        startActivity(intentChat);


    }*/

