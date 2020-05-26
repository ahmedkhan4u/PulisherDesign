package com.softrasol.ahmed.pulisherdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class OtpActivity extends AppCompatActivity {
    private EditText et1, et2, et3, et4;
    private Button btnConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        setBackGround();

        et1 = findViewById(R.id.et1_otp);
        et2 = findViewById(R.id.et2_otp);
        et3 = findViewById(R.id.et3_otp);
        et4 = findViewById(R.id.et4_otp);
        btnConfirm = findViewById(R.id.btn_confirm_otp);

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OtpActivity.this, HomeActivity.class));
            }
        });
        et1.addTextChangedListener(new GenericTextWatcher(et1));
        et2.addTextChangedListener(new GenericTextWatcher(et2));
        et3.addTextChangedListener(new GenericTextWatcher(et3));
        et4.addTextChangedListener(new GenericTextWatcher(et4));
    }

    public class GenericTextWatcher implements TextWatcher {
        private View view;

        private GenericTextWatcher(View view) {
            this.view = view;
        }

        @Override
        public void afterTextChanged(Editable editable) {
            // TODO Auto-generated method stub
            String text = editable.toString();
            switch (view.getId()) {

                case R.id.et1_otp:
                    if (text.length() == 1)
                        et2.requestFocus();
                    break;
                case R.id.et2_otp:
                    if (text.length() == 1)
                        et3.requestFocus();
                    else if (text.length() == 0)
                        et1.requestFocus();
                    break;
                case R.id.et3_otp:
                    if (text.length() == 1)
                        et4.requestFocus();
                    else if (text.length() == 0)
                        et2.requestFocus();
                    break;
                case R.id.et4_otp:
                    if (text.length() == 0)
                        et3.requestFocus();
                    break;
            }
        }

        @Override
        public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
            // TODO Auto-generated method stub
        }

        @Override
        public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
            // TODO Auto-generated method stub
        }
    }

    private void setBackGround() {
        ImageView imageView = findViewById(R.id.iv_background);
        Glide
                .with(this)
                .load(R.drawable.background)
                .into(imageView);
    }
}
