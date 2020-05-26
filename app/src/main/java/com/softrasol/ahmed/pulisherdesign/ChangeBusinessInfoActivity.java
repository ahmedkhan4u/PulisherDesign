package com.softrasol.ahmed.pulisherdesign;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

import com.google.android.material.textfield.TextInputEditText;

public class ChangeBusinessInfoActivity extends AppCompatActivity {

    private Spinner mSpinnerContentType, mSpinnerFrequency, mSpinnerSubscriptionPrices;
    private String []
            typeOfContent = {"Newspapers", "Books", "Magazines"},
            frequency = { "daily", "biweekly", "weekly", "fortnightly",
                    "monthly", "quarterly", "annually" },
            subcriptionPrices = {"Choose Price", "1month", "2months", "3months", "6months", "1year"};


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

        final ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_spinner_dropdown_item, subcriptionPrices);
        mSpinnerSubscriptionPrices.setAdapter(adapter);


        mSpinnerSubscriptionPrices.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, final int i, long l) {

                if (subcriptionPrices[i] .equalsIgnoreCase("Choose Price")){
                    return;
                }

                AlertDialog.Builder builder1 = new AlertDialog.Builder(ChangeBusinessInfoActivity.this);
                builder1.setMessage("Choose Price");
                builder1.setCancelable(true);
                View mView = LayoutInflater.from(ChangeBusinessInfoActivity.this)
                        .inflate(R.layout.prices_dialog, null ,false);
                builder1.setView(mView);

                final TextInputEditText textInputEditText = mView.findViewById(R.id.choose_price);

                builder1.setPositiveButton(
                        "Save",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                String price = subcriptionPrices[i];
                                subcriptionPrices[i] = price+" = "+textInputEditText.getText().toString().trim();
                                adapter.notifyDataSetChanged();
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

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

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
