package com.softrasol.ahmed.pulisherdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

    }

    public void EditButtonClick(View view) {
        startActivity(new Intent(getApplicationContext(), ProfileUpdateActivity.class));
    }

    public void BackButtonClick(View view) {
        onBackPressed();
    }

    public void FaqClick(View view) {
        startActivity(new Intent(getApplicationContext(), FaqActivity.class));
    }

    public void AboutUsClick(View view) {
        startActivity(new Intent(getApplicationContext(),AboutActivity.class));
    }

    public void TermsAndConsClick(View view) {
        startActivity(new Intent(getApplicationContext(), TermsAndConditionActivity.class));
    }

    public void ChangeBusinessInfoClick(View view) {
        startActivity(new Intent(getApplicationContext(), ChangeBusinessInfoActivity.class));
    }

    public void PaymentMethodClick(View view) {
        startActivity(new Intent(getApplicationContext(), PayoutMethodActivity.class));
    }

    public void UploadPublishClick(View view) {
        startActivity(new Intent(getApplicationContext(), UploadPublicationActivity.class));
    }
}
