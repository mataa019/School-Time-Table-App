package com.example.schooltimetable.ui.Class;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

import com.example.schooltimetable.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class Lecture1Chat extends AppCompatActivity {
    private EditText editTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_lecturefragment);

        editTextMessage = findViewById(R.id.messageEditText);
        FloatingActionButton sendButton = findViewById(R.id.sendButton);

        editTextMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Enable focus and show keyboard
                editTextMessage.setFocusableInTouchMode(true);
                editTextMessage.requestFocus();
                InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                imm.showSoftInput(editTextMessage, InputMethodManager.SHOW_IMPLICIT);
            }
        });

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = editTextMessage.getText().toString().trim();

                if (!message.isEmpty()) {
                    String phoneNumber = "0972167165"; // Replace this with the actual phone number you want to send the SMS to
                    sendSMS(phoneNumber, message);
                    // Clear the message input field after sending
                    editTextMessage.getText().clear();
                } else {
                    // Handle empty message, show a Snackbar or Toast
                    Snackbar.make(view, "Please enter a message", Snackbar.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void sendSMS(String phoneNumber, String message) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("smsto:" + Uri.encode(phoneNumber)));
        intent.putExtra("sms_body", message);

        // Check if there's an SMS app available to handle this intent
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            // Handle the case where no SMS app is available
            Snackbar.make(editTextMessage, "No SMS app available", Snackbar.LENGTH_SHORT).show();
        }
    }
}
