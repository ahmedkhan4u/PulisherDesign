package com.softrasol.ahmed.pulisherdesign;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.textfield.TextInputEditText;
import com.softrasol.ahmed.pulisherdesign.Adapters.CustomerReviewAdapter;

public class SingleSelectionPubliserActivity extends AppCompatActivity {

    private RecyclerView recyclerViewCustomerReview;
    private RecyclerView.Adapter<CustomerReviewAdapter> trendAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_selection_publiser);

        recyclerViewCustomerReview = findViewById(R.id.rv_customer_reviews_single_selection);
        setRecyclerViewCustomerReview();

    }

    public void EditDetailsClick(View view) {


        AlertDialog.Builder builder1 = new AlertDialog.Builder(SingleSelectionPubliserActivity.this);
        builder1.setTitle("Edit Details");
        builder1.setCancelable(true);
        View mView = LayoutInflater.from(SingleSelectionPubliserActivity.this)
                .inflate(R.layout.publishler_edit_details_dialog, null ,false);
        builder1.setView(mView);


        builder1.setPositiveButton(
                "Save",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        builder1.setNegativeButton(
                "Cancel",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        AlertDialog alert11 = builder1.create();
        alert11.show();

    }

    public void BackClick(View view) {
        onBackPressed();
    }

    private void setRecyclerViewCustomerReview() {



        recyclerViewCustomerReview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        trendAdapter = new RecyclerView.Adapter<CustomerReviewAdapter>() {
            @Override
            public CustomerReviewAdapter onCreateViewHolder(ViewGroup viewGroup, int ViewType) {
                return new CustomerReviewAdapter(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.blueprint_customer_review, viewGroup, false));
            }

            @Override
            public void onBindViewHolder(CustomerReviewAdapter viewHolderCustomerReview, final int i) {
                // viewHolderCustomerReview.textViewTitle.setText("title");
                viewHolderCustomerReview.btnExpandCustomerReview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(SingleSelectionPubliserActivity.this, ReviewsActivity.class));
                    }
                });
            }

            @Override
            public int getItemCount() {
                return 4;
            }
        };
        recyclerViewCustomerReview.setAdapter(trendAdapter);
    }
}
