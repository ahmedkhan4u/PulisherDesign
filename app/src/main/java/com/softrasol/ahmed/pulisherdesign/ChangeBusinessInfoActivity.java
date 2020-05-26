package com.softrasol.ahmed.pulisherdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

public class ChangeBusinessInfoActivity extends AppCompatActivity {

    private Spinner mSpinnerContentType, mSpinnerFrequency, mSpinnerSubscriptionPrices;
    private String []
            typeOfContent = {"Newspapers", "Books", "Magazines"},
            frequency = { "daily", "biweekly", "weekly", "fortnightly",
                    "monthly", "quarterly", "annually" },
            subcriptionPrices = {"1month", "2months", "3months", "6months", "1year"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_business_info);

        typeOfContentSpinner();
        frequencySpinner();
        subscriptionPricesSpinner();


    }

    private void subscriptionPricesSpinner() {

        mSpinnerSubscriptionPrices = findViewById(R.id.spinner_subscription_prices);

        ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_spinner_dropdown_item, subcriptionPrices);
        mSpinnerSubscriptionPrices.setAdapter(adapter);
    }

    private void frequencySpinner() {

        mSpinnerFrequency = findViewById(R.id.spinner_frequency);

        ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_spinner_dropdown_item, frequency);
        mSpinnerFrequency.setAdapter(adapter);
    }

    private void typeOfContentSpinner() {

        mSpinnerContentType = findViewById(R.id.spinner_content_type);

        ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_spinner_dropdown_item, typeOfContent);
        mSpinnerContentType.setAdapter(adapter);

    }
}
