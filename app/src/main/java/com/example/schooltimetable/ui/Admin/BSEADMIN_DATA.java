package com.example.schooltimetable.ui.Admin;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.schooltimetable.R;
import com.example.schooltimetable.ScheduleClass;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class BSEADMIN_DATA extends AppCompatActivity {

    private EditText classNameEditText;
    private EditText timeEditText;
    private EditText venueEditText;
    private EditText lecturerEditText;
    private EditText courseIdEditText;
    private EditText yearEditText;
    private CheckBox checkboxMonday;
    private CheckBox checkboxTuesday;
    private CheckBox checkboxWednesday;
    private CheckBox checkboxThursday;
    private CheckBox checkboxFriday;
    private Button addScheduleButton;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admininputdatabse);

        classNameEditText = findViewById(R.id.class_name);
        timeEditText = findViewById(R.id.time);
        venueEditText = findViewById(R.id.venue);
        lecturerEditText = findViewById(R.id.lecturer);
        courseIdEditText = findViewById(R.id.course_id);
        yearEditText = findViewById(R.id.year);
        checkboxMonday = findViewById(R.id.checkbox_monday);
        checkboxTuesday = findViewById(R.id.checkbox_tuesday);
        checkboxWednesday = findViewById(R.id.checkbox_wednesday);
        checkboxThursday = findViewById(R.id.checkbox_thursday);
        checkboxFriday = findViewById(R.id.checkbox_friday);
        addScheduleButton = findViewById(R.id.add_schedule);

        addScheduleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the entered schedule details
                String className = classNameEditText.getText().toString();
                String time = timeEditText.getText().toString();
                String venue = venueEditText.getText().toString();
                String lecturer = lecturerEditText.getText().toString();
                String courseId = courseIdEditText.getText().toString();
                String year = yearEditText.getText().toString();

                // Validate classNameEditText to ensure it is not empty
                if(className.isEmpty()) {
                    classNameEditText.setError("Class Name is required!");
                    classNameEditText.requestFocus();
                    return;
                }

                // Initialize Firebase Database reference with the user input as the child reference
                databaseReference = FirebaseDatabase.getInstance().getReference("Schedules");

                // Get the selected days
                if (checkboxMonday.isChecked()) {
                    databaseReference.child("Monday").child(className).setValue(new ScheduleClass(className, time, venue, lecturer, courseId, year));
                }
                if (checkboxTuesday.isChecked()) {
                    databaseReference.child("Tuesday").child(className).setValue(new ScheduleClass(className, time, venue, lecturer, courseId, year));
                }
                if (checkboxWednesday.isChecked()) {
                    databaseReference.child("Wednesday").child(className).setValue(new ScheduleClass(className, time, venue, lecturer, courseId, year));
                }
                if (checkboxThursday.isChecked()) {
                    databaseReference.child("Thursday").child(className).setValue(new ScheduleClass(className, time, venue, lecturer, courseId, year));
                }
                if (checkboxFriday.isChecked()) {
                    databaseReference.child("Friday").child(className).setValue(new ScheduleClass(className, time, venue, lecturer, courseId, year));
                }

                // Inform the user that the schedule has been added (you can implement this part as needed)
                // For example: Toast.makeText(BSEADMIN_DATA.this, "Schedule added successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
