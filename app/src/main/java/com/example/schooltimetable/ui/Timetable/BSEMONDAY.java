package com.example.schooltimetable.ui.Timetable;

import android.os.Bundle;
import android.util.Log;
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

public class BSEMONDAY extends Fragment {

    private DatabaseReference databaseReference;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tablecardviewmondaybse, container, false);

        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference().child("Schedules").child("Monday").child("BIT");

        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    String time = snapshot.child("time").getValue(String.class);
                    String courseId = snapshot.child("courseId").getValue(String.class);
                    String lecture = snapshot.child("lecturer").getValue(String.class);
                    String venue = snapshot.child("venue").getValue(String.class);
                    String year = snapshot.child("year").getValue(String.class);

                    // Inflate your table row dynamically
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

                    // Add the dynamically created row to your existing TableLayout
                    TableLayout tableLayout = view.findViewById(R.id.tableLayout);
                    tableLayout.addView(tableRow);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                // Handle errors
                Log.e("FirebaseError", databaseError.getMessage());
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
