package com.example.schooltimetable.ui.Admin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.schooltimetable.R;
import com.example.schooltimetable.databinding.ActivityAdminHomeBinding;

public class AdminLogin extends AppCompatActivity {
    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_login);

        usernameEditText = findViewById(R.id.login_username);
        passwordEditText = findViewById(R.id.login_password);
        loginButton = findViewById(R.id.login_button);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the entered username and password
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // Perform your login logic here, for example, validate the credentials
                // For demonstration, let's assume valid credentials for now
                if (isValidCredentials(username, password)) {
                    // Navigate to the next activity (replace NextActivity.class with the desired activity)
                    Intent intent = new Intent(AdminLogin.this, adminHome.class);
                    startActivity(intent);
                    // Finish the current activity to prevent going back to the login screen
                    finish();
                } else {
                    // Handle incorrect credentials (show error message, etc.)
                    // For example:
                    // Toast.makeText(LoginActivity.this, "Invalid username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    // Dummy function to validate credentials (replace it with your authentication logic)
    private boolean isValidCredentials(String username, String password) {
        // Hardcoded admin credentials for demonstration purposes
        String adminUsername = "admin";
        String adminPassword = "12345678";

        // Check if the entered username and password match the hardcoded admin credentials
        return username.equals(adminUsername) && password.equals(adminPassword);
    }
}
