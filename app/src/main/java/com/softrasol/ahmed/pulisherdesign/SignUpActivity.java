package com.softrasol.ahmed.pulisherdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class SignUpActivity extends AppCompatActivity {
    private Button btn_sign_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        btn_sign_up = findViewById(R.id.btn_signup_signup);
        btn_sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignUpActivity.this, OtpActivity.class));
            }
        });
        setBackGround();
    }

    private void setBackGround() {
        ImageView imageView = findViewById(R.id.iv_background);
        Glide
                .with(this)
                .load(R.drawable.background)
                .into(imageView);
    }
}
