package com.example.hs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

public class DoctorRegistrationActivity extends AppCompatActivity {
    private textview regPageQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_registration);
        regPageQuestion = findViewById(R.id.regPageQuestion);
        regPageQuestion(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = onNewIntent(createPackageContext(DoctorRegistrationActivity.this,loginActivity.class));
                startActivity( intent);
            }
        });
    }
}
