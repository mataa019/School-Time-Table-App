package com.example.schooltimetable.ui.Timetable;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.schooltimetable.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class TimetableBITMonday extends Fragment {

    private DatabaseReference databaseReference;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tablecardviewbitmonday, container, false);

       // databaseReference = FirebaseDatabase.getInstance().getReference().child("Schedules").child("Friday").child("BIT");
        databaseReference = FirebaseDatabase.getInstance().getReference().child("Schedules").child("Monday").child("BIT");
        //databaseReference = FirebaseDatabase.getInstance().getReference().child("Schedules").child("Tuesday").child("BIT");
        //databaseReference = FirebaseDatabase.getInstance().getReference().child("Schedules").child("Wednesday").child("BIT");
        //databaseReference = FirebaseDatabase.getInstance().getReference().child("Schedules").child("Thursday").child("BIT");


        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    String time = snapshot.child("time").getValue(String.class);
                    String courseId = snapshot.child("courseId").getValue(String.class);
                    String lecture = snapshot.child("lecturer").getValue(String.class);
                    String venue = snapshot.child("venue").getValue(String.class);
                    String year = snapshot.child("year").getValue(String.class);

                    TableRow tableRow = new TableRow(getContext());

                    TextView timeTextView = createTextView(time);
                    tableRow.addView(timeTextView);

                    TextView courseIdTextView = createTextView(courseId);
                    tableRow.addView(courseIdTextView);

                    TextView lectureTextView = createTextView(lecture);
                    tableRow.addView(lectureTextView);

                    TextView venueTextView = createTextView(venue);
                    tableRow.addView(venueTextView);

                    TextView yearTextView = createTextView(year);
                    tableRow.addView(yearTextView);

                    TableLayout tableLayout = view.findViewById(R.id.tableLayout);
                    tableLayout.addView(tableRow);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                // Handle errors
            }
        });

        return view;
    }

    private TextView createTextView(String text) {
        TextView textView = new TextView(getContext());
        textView.setLayoutParams(new TableRow.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1));
        textView.setText(text != null ? text : "N/A");
        textView.setGravity(Gravity.CENTER);
        return textView;
    }
}
