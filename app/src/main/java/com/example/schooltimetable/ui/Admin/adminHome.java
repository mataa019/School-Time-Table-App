package com.example.schooltimetable.ui.Admin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.schooltimetable.R;

public class adminHome extends AppCompatActivity {

    private CardView BSE,BIT,BICT,BCS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home);

        BSE = findViewById(R.id.cardBSE);
        BIT = findViewById(R.id.cardBIT);
        BICT = findViewById(R.id.cardBICT);
        BCS = findViewById(R.id.cardBCS);

        BSE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(adminHome.this, BSEADMIN_DATA.class);
                startActivity(intent);
            }
        });

        BIT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle click on Chat CardView
            }
        });

        BICT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle click on Profile CardView
            }
        });

        BCS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle click on Widget CardView
            }
        });
    }

}
