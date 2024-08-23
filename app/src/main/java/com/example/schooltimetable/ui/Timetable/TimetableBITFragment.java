package com.example.schooltimetable.ui.Timetable;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public class TimetableBITFragment extends Fragment {

    private DatabaseReference databaseReference;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.timetablebitfragment, container, false);
        // Set timetable data for Monday
        //  setTimetableDataMonday(mondayView, R.id.timeSlotTextView, R.id.courseIdTextView, R.id.lectureTextView, R.id.venueTextView, R.id.dayNameTextView,
        //        "8:00 AM - 9:00 AM", "CS101", "John", "Room 101", "Monday");


        return view;
    }

    private void setTimetableDataMonday(View view, int timeSlotId, int courseIdId, int lectureId, int venueId, int dayNameId,
                                        String time, String courseId, String lecture, String venue, String dayName) {
        TextView timeSlotTextView = view.findViewById(timeSlotId);
        TextView courseIdTextView = view.findViewById(courseIdId);
        TextView lectureTextView = view.findViewById(lectureId);
        TextView venueTextView = view.findViewById(venueId);
        TextView dayNameTextView = view.findViewById(dayNameId);

        timeSlotTextView.setText(time);
        courseIdTextView.setText(courseId);
        lectureTextView.setText(lecture);
        venueTextView.setText(venue);
        dayNameTextView.setText(dayName);
    }
    private void setTimetableDataTuesday(View view, int timeSlotId, int courseIdId, int lectureId, int venueId, int dayNameId,
                                         String time, String courseId, String lecture, String venue, String dayName) {
        TextView timeSlotTextView = view.findViewById(timeSlotId);
        TextView courseIdTextView = view.findViewById(courseIdId);
        TextView lectureTextView = view.findViewById(lectureId);
        TextView venueTextView = view.findViewById(venueId);
        TextView dayNameTextView = view.findViewById(dayNameId);

        timeSlotTextView.setText(time);
        courseIdTextView.setText(courseId);
        lectureTextView.setText(lecture);
        venueTextView.setText(venue);
        dayNameTextView.setText(dayName);
    }
    private void setTimetableDatawensday(View view, int timeSlotId, int courseIdId, int lectureId, int venueId, int dayNameId,
                                         String time, String courseId, String lecture, String venue, String dayName) {
        TextView timeSlotTextView = view.findViewById(timeSlotId);
        TextView courseIdTextView = view.findViewById(courseIdId);
        TextView lectureTextView = view.findViewById(lectureId);
        TextView venueTextView = view.findViewById(venueId);
        TextView dayNameTextView = view.findViewById(dayNameId);

        timeSlotTextView.setText(time);
        courseIdTextView.setText(courseId);
        lectureTextView.setText(lecture);
        venueTextView.setText(venue);
        dayNameTextView.setText(dayName);
    }
    private void setTimetableDatathursday(View view, int timeSlotId, int courseIdId, int lectureId, int venueId, int dayNameId,
                                          String time, String courseId, String lecture, String venue, String dayName) {
        TextView timeSlotTextView = view.findViewById(timeSlotId);
        TextView courseIdTextView = view.findViewById(courseIdId);
        TextView lectureTextView = view.findViewById(lectureId);
        TextView venueTextView = view.findViewById(venueId);
        TextView dayNameTextView = view.findViewById(dayNameId);

        timeSlotTextView.setText(time);
        courseIdTextView.setText(courseId);
        lectureTextView.setText(lecture);
        venueTextView.setText(venue);
        dayNameTextView.setText(dayName);
    }
    private void setTimetableDatafriday(View view, int timeSlotId, int courseIdId, int lectureId, int venueId, int dayNameId,
                                        String time, String courseId, String lecture, String venue, String dayName) {
        TextView timeSlotTextView = view.findViewById(timeSlotId);
        TextView courseIdTextView = view.findViewById(courseIdId);
        TextView lectureTextView = view.findViewById(lectureId);
        TextView venueTextView = view.findViewById(venueId);
        TextView dayNameTextView = view.findViewById(dayNameId);

        timeSlotTextView.setText(time);
        courseIdTextView.setText(courseId);
        lectureTextView.setText(lecture);
        venueTextView.setText(venue);
        dayNameTextView.setText(dayName);
    }
}
