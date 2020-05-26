package com.softrasol.ahmed.pulisherdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.google.android.material.textfield.TextInputEditText;

public class ProfileUpdateActivity extends AppCompatActivity {
    private TextInputEditText tietFirstName, tietLastName, tietEmail, tietPhoneNumber;
    private Button btnSave, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_update);


        setButtonListeners();
    }

    private void setButtonListeners() {
        tietFirstName = findViewById(R.id.tiet_firstName_profile_update);
        tietFirstName = findViewById(R.id.tiet_lastName_profile_update);
        tietFirstName = findViewById(R.id.tiet_email_profile_update);
        tietFirstName = findViewById(R.id.tiet_phone_number_profile_update);
        btnSave = findViewById(R.id.btn_save_profile_update);
        btnBack = findViewById(R.id.btn_back_profile_update);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }
}
