package com.softrasol.ahmed.pulisherdesign.Fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.softrasol.ahmed.pulisherdesign.AboutActivity;
import com.softrasol.ahmed.pulisherdesign.ChangeBusinessInfoActivity;
import com.softrasol.ahmed.pulisherdesign.FaqActivity;
import com.softrasol.ahmed.pulisherdesign.PayoutMethodActivity;
import com.softrasol.ahmed.pulisherdesign.R;
import com.softrasol.ahmed.pulisherdesign.TermsAndConditionActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {


    public ProfileFragment() {
        // Required empty public constructor
    }

    private View mView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        mView =  inflater.inflate(R.layout.fragment_profile, container, false);

        profileButtonClickListeners();

        return mView;
    }

    private void profileButtonClickListeners() {

        mView.findViewById(R.id.btn_change_business_info).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), ChangeBusinessInfoActivity.class));
            }
        });

        mView.findViewById(R.id.btn_profile_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().finish();
            }
        });

        mView.findViewById(R.id.btn_payout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), PayoutMethodActivity.class));
            }
        });

        mView.findViewById(R.id.btn_about).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), AboutActivity.class));
            }
        });

        mView.findViewById(R.id.btn_faq).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), FaqActivity.class));
            }
        });

        mView.findViewById(R.id.btn_terms).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), TermsAndConditionActivity.class));
            }
        });


    }

}
