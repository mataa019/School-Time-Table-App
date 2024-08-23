package com.example.schooltimetable.ui.Class;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.schooltimetable.R;

public class Lecture2Chat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lecturefragment2);

        // Initialize the Button for chat
        Button chatButton = findViewById(R.id.chatButton2);

        // Set OnClickListener to the chat button
        chatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Replace "lecturer_phone_number" with the actual phone number of the lecturer
                String phoneNumber = "+260972167165";

                // Create a Uri with the phone number in the format "tel:phoneNumber"
                Uri uri = Uri.parse("tel:" + phoneNumber);

                // Create an Intent with action Intent.ACTION_VIEW
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);

                // Set the package to "com.whatsapp" to open WhatsApp
                intent.setPackage("com.whatsapp");

                // Start the intent
                startActivity(intent);
            }
        });
    }
}
