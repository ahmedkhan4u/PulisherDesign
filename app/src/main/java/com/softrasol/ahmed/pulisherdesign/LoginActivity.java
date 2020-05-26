package com.softrasol.ahmed.pulisherdesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.bumptech.glide.Glide;

public class LoginActivity extends AppCompatActivity {

    private Button btn_sign_up, btn_sign_in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        setBackGround();

        btn_sign_up = findViewById(R.id.btn_signup_login);
        btn_sign_in = findViewById(R.id.btn_signin_login);

        btn_sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, SignUpActivity.class));
            }
        });

        btn_sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, HomeActivity.class));
            }
        });
    }

    private void setBackGround() {
        ImageView imageView = findViewById(R.id.iv_background);
        Glide
                .with(this)
                .load(R.drawable.background)
                .into(imageView);
    }

}
