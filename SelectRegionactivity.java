package com.example.hs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SelectRegistrationActivity extends AppCompatActivity {
    private TextView back;
    private Button doctorReg,patientReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_registration);

        TextView back = findViewById(R.id.back);
        back.setOnClickListener(view -> {
            Intent intent = new Intent(SelectRegistrationActivity.this,loginActivity.class);
            startActivity(intent);
        });
        patientReg =findViewById(R.id.patientReg);
        doctorReg =findViewById(R.id.doctorReg);
        patientReg.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(createPackageContext(SelectRegistrationActivity.this,PatientRegistrationActivity.this));
                startActivity(intent);
            }
        });
        doctorReg.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(createPackageContext(SelectRegistrationActivity.this,DoctorRegistrationActivity.this));
                startActivity(intent);
            }
        });
    }
}
