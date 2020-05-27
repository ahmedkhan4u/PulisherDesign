package com.softrasol.ahmed.pulisherdesign.Fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.softrasol.ahmed.pulisherdesign.Adapters.PublicationsAdapter;
import com.softrasol.ahmed.pulisherdesign.Models.PublicationsModel;
import com.softrasol.ahmed.pulisherdesign.R;
import com.softrasol.ahmed.pulisherdesign.UploadPublicationActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class PublicationListFragment extends Fragment {

    private FloatingActionButton floatingActionButton;



    private RecyclerView mRecyclerViewPublications;

    private List<PublicationsModel>list;

    public PublicationListFragment() {
        // Required empty public constructor
    }

    private View mView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_publication_list, container, false);


        recyclerViewPublicationsImplementation();

        floatingActionButton = mView.findViewById(R.id.fab);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), UploadPublicationActivity.class));
            }
        });

        return mView;
    }

    private void recyclerViewPublicationsImplementation() {

        list = new ArrayList<>();

        list.add(new PublicationsModel(R.drawable.book_cover));
        list.add(new PublicationsModel(R.drawable.cover));
        list.add(new PublicationsModel(R.drawable.book_cover));
        list.add(new PublicationsModel(R.drawable.cover));
        list.add(new PublicationsModel(R.drawable.book_cover));
        list.add(new PublicationsModel(R.drawable.cover));

        mRecyclerViewPublications = mView.findViewById(R.id.recycler_view_publications);

        mRecyclerViewPublications.setLayoutManager(new GridLayoutManager(getContext(), 2));

        PublicationsAdapter adapter = new PublicationsAdapter(getContext(), list);

        mRecyclerViewPublications.setAdapter(adapter);
    }


}
