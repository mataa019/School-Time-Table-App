package com.example.schooltimetable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.schooltimetable.ui.Admin.AdminLogin;
import com.example.schooltimetable.ui.Admin.adminHome;

public class landingPage extends AppCompatActivity {

    private Button adminButton;
    private Button studentButton;
    private TextView statusTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);

        adminButton = findViewById(R.id.admin_button);
        studentButton = findViewById(R.id.student_button);
        statusTextView = findViewById(R.id.status_text_view);

        adminButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle admin login logic here
                // Start AdminActivity
                Intent adminIntent = new Intent(landingPage.this, AdminLogin.class);
                startActivity(adminIntent);

            }
        });

        studentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle student login logic here
                Intent adminIntent = new Intent(landingPage.this, LoginActivity.class);
                startActivity(adminIntent);

            }
        });
    }
}