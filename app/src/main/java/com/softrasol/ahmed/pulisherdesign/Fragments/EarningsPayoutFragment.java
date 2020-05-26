package com.softrasol.ahmed.pulisherdesign.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.softrasol.ahmed.pulisherdesign.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class EarningsPayoutFragment extends Fragment {


    public EarningsPayoutFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_earnings_payout, container, false);
    }

}
