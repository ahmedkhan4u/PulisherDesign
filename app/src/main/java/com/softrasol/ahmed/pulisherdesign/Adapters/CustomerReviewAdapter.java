package com.softrasol.ahmed.pulisherdesign.Adapters;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.softrasol.ahmed.pulisherdesign.R;

public class CustomerReviewAdapter extends RecyclerView.ViewHolder {
    public TextView textViewTitle, tvReview, tvMetaDat;
    public RatingBar ratingBar;
    public LinearLayout btnExpandCustomerReview;

    public CustomerReviewAdapter(View itemView) {
        super(itemView);
        textViewTitle = itemView.findViewById(R.id.tv_title_customer_review_blueprint);
        tvReview = itemView.findViewById(R.id.tv_text_customer_review_blueprint);
        tvMetaDat = itemView.findViewById(R.id.tv_meta_data_customer_review_blueprint);
        ratingBar = itemView.findViewById(R.id.rating_bar_customer_review_blueprint);
        btnExpandCustomerReview = itemView.findViewById(R.id.ly_customer_review);
    }
}