package com.softrasol.ahmed.pulisherdesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;

import com.google.android.material.textfield.TextInputEditText;
import com.softrasol.ahmed.pulisherdesign.Adapters.CustomerReviewAdapter;

public class ReviewsActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Button btnAddReview;
    private RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reviews);

        recyclerView = findViewById(R.id.rv_reviews_activity);
        btnAddReview = findViewById(R.id.btn_review_reviews_activity);
        ratingBar = findViewById(R.id.rating_bar_my_reviews_activity);

        btnAddReview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialogBox();
            }
        });

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                showDialogBox();
            }
        });
        setRecyclerViewCustomerReview();
    }

    private void setRecyclerViewCustomerReview() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView.Adapter<CustomerReviewAdapter> customerReviewAdapter = new RecyclerView.Adapter<CustomerReviewAdapter>() {
            @Override
            public CustomerReviewAdapter onCreateViewHolder(ViewGroup viewGroup, int ViewType) {
                return new CustomerReviewAdapter(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.blueprint_customer_review, viewGroup, false));
            }

            @Override
            public void onBindViewHolder(CustomerReviewAdapter viewHolderCustomerReview, final int i) {
                viewHolderCustomerReview.textViewTitle.setText("User Name");
            }

            @Override
            public int getItemCount() {
                return 8;
            }
        };
        recyclerView.setAdapter(customerReviewAdapter);
    }

    public void showDialogBox() {

        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.post_review_dialog_box);

        final EditText tietTitle = dialog.findViewById(R.id.et_review_title_review_dialog_box);
        final EditText tietReview = dialog.findViewById(R.id.et_review_description_review_dialog_box);
        Button btnCancel = dialog.findViewById(R.id.btn_cancel_dialog_box);
        Button btnAddTag = dialog.findViewById(R.id.btn_send_review);

        btnAddTag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();

    }
}
