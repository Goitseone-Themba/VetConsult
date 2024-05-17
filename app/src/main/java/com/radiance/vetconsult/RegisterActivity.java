package com.radiance.vetconsult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    EditText edtFirstName, edtLastName, edtMobileNumber, edtLocation;
    Button btnComplete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        edtFirstName = findViewById(R.id.edtFirstName);
        edtLastName = findViewById(R.id.edtLastName);
        edtMobileNumber = findViewById(R.id.edtMobileNumber);
        edtLocation = findViewById(R.id.edtLocation);
        btnComplete = findViewById(R.id.btnComplete);

        btnComplete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);

            }
        });


    }
}