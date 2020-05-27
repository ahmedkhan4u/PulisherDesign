package com.softrasol.ahmed.pulisherdesign.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.softrasol.ahmed.pulisherdesign.Adapters.EarningsAdapter;
import com.softrasol.ahmed.pulisherdesign.Models.EarningsModel;
import com.softrasol.ahmed.pulisherdesign.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class EarningsPayoutFragment extends Fragment {


    public EarningsPayoutFragment() {
        // Required empty public constructor
    }

    private String []
            monthList = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep"
    , "Oct", "Nov", "Dec"},

            yearList = {"2020", "2021", "2022", "2023"};

    private View mView;
    private Spinner mSpinnerMonth, mSpinnerYear;

    private RecyclerView mRecyclerViewEarnings;
    private List<EarningsModel> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_earnings_payout, container, false);

        spinnerMonths();
        spinnerYears();
        recyclerViewImplementation();


        return mView;
    }

    private void recyclerViewImplementation() {

        list = new ArrayList<>();

        list.add(new EarningsModel("Tuesday 26th May, 2020","10:30 AM","The CNN News"
                ,"Edition No. 0345","1 Year Subscription",
                "60$","50$","10$","60$","75$"));

        list.add(new EarningsModel("Tuesday 26th May, 2020","10:30 AM","The CNN News"
                ,"Edition No. 0345","1 Year Subscription",
                "60$","50$","10$","60$","75$"));

        list.add(new EarningsModel("Tuesday 26th May, 2020","10:30 AM","The CNN News"
                ,"Edition No. 0345","1 Year Subscription",
                "60$","50$","10$","60$","75$"));

        list.add(new EarningsModel("Tuesday 26th May, 2020","10:30 AM","The CNN News"
                ,"Edition No. 0345","1 Year Subscription",
                "60$","50$","10$","60$","75$"));

        mRecyclerViewEarnings = mView.findViewById(R.id.recycler_view_earnings);
        mRecyclerViewEarnings.setLayoutManager(new LinearLayoutManager(getContext()));

        EarningsAdapter adapter = new EarningsAdapter(getContext(), list);

        mRecyclerViewEarnings.setAdapter(adapter);
    }

    private void spinnerYears() {
        mSpinnerYear = mView.findViewById(R.id.spinner_year);
        ArrayAdapter adapter = new ArrayAdapter(getContext(),
                android.R.layout.simple_spinner_dropdown_item, yearList);
        mSpinnerYear.setAdapter(adapter);
    }

    private void spinnerMonths() {
        mSpinnerMonth = mView.findViewById(R.id.spinner_month);
        ArrayAdapter adapter = new ArrayAdapter(getContext(),
                android.R.layout.simple_spinner_dropdown_item, monthList);
        mSpinnerMonth.setAdapter(adapter);
    }

}
