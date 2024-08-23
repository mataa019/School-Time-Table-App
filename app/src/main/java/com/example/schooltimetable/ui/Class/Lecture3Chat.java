package com.example.schooltimetable.ui.Class;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.content.pm.PackageManager;

import com.example.schooltimetable.R;

public class Lecture3Chat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lecturefragment3);

        // Initialize the Button for chat
        Button chatButton3 = findViewById(R.id.chatButton3);

        // Set OnClickListener to the chat button
        chatButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Replace "lecturer_phone_number" with the actual phone number of the lecturer
                String phoneNumber = "+260972167165";

                // Check if WhatsApp is installed on the device
                if (isWhatsAppInstalled()) {
                    // WhatsApp is installed, create and start the intent
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send?phone=" + phoneNumber));
                    startActivity(intent);
                } else {
                    // WhatsApp is not installed, provide a fallback mechanism (e.g., open SMS app)
                    Intent smsIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:" + phoneNumber));
                    startActivity(smsIntent);
                }
            }
        });
    }

    // Method to check if WhatsApp is installed on the device
    private boolean isWhatsAppInstalled() {
        PackageManager packageManager = getPackageManager();
        try {
            packageManager.getPackageInfo("com.whatsapp", PackageManager.GET_ACTIVITIES);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }
}
