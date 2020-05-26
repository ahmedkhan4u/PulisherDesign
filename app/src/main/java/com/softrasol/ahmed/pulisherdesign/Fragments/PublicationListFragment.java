package com.softrasol.ahmed.pulisherdesign.Fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.softrasol.ahmed.pulisherdesign.R;
import com.softrasol.ahmed.pulisherdesign.UploadPublicationActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class PublicationListFragment extends Fragment {

    private FloatingActionButton floatingActionButton;

    public PublicationListFragment() {
        // Required empty public constructor
    }

    private View mView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_publication_list, container, false);

        floatingActionButton = mView.findViewById(R.id.fab);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), UploadPublicationActivity.class));
            }
        });

        return mView;
    }

}
