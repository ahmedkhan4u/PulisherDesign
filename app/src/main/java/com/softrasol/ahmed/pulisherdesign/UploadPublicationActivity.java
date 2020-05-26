package com.softrasol.ahmed.pulisherdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.lang.reflect.Array;

public class UploadPublicationActivity extends AppCompatActivity {

    private Spinner mSpinner;
    private String [] priceList = {"$10", "$20", "$30", "$40"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_publication);

        //implementSpinner();

    }

    private void implementSpinner() {

       // mSpinner = findViewById(R.id.spinner_price);

        ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_spinner_dropdown_item, priceList);

        mSpinner.setAdapter(adapter);

    }
}
