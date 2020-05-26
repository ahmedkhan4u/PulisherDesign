package com.softrasol.ahmed.pulisherdesign.Fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.softrasol.ahmed.pulisherdesign.R;
import com.softrasol.ahmed.pulisherdesign.UploadPublicationActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class PublicationListFragment extends Fragment {

    private FloatingActionButton floatingActionButton;
    private String []
            uploads = {"Uploads"},
            stats = {"Stats"},
            payouts = {"Payouts"};

    private Spinner mSpinnerUploads, mSpinnerStats, mSpinnerPayouts;

    public PublicationListFragment() {
        // Required empty public constructor
    }

    private View mView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_publication_list, container, false);


        uploadsSpinner();
        statsSpinner();
        payoutsSpinner();


        floatingActionButton = mView.findViewById(R.id.fab);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), UploadPublicationActivity.class));
            }
        });

        return mView;
    }

    private void payoutsSpinner() {

        mSpinnerPayouts = mView.findViewById(R.id.spinner_payout);

        ArrayAdapter adapter = new ArrayAdapter(getContext(),
                android.R.layout.simple_spinner_dropdown_item, payouts);

        mSpinnerPayouts.setAdapter(adapter);

    }

    private void statsSpinner() {
        mSpinnerStats = mView.findViewById(R.id.spinner_stats);

        ArrayAdapter adapter = new ArrayAdapter(getContext(),
                android.R.layout.simple_spinner_dropdown_item, stats);

        mSpinnerStats.setAdapter(adapter);
    }

    private void uploadsSpinner() {

        mSpinnerUploads = mView.findViewById(R.id.spinner_uploads);

        ArrayAdapter adapter = new ArrayAdapter(getContext(),
                android.R.layout.simple_spinner_dropdown_item, uploads);

        mSpinnerUploads.setAdapter(adapter);

    }

}
