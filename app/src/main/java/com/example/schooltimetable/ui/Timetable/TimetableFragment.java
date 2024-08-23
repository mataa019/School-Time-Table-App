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

public class TimetableFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.timetablefragment, container, false);
        // Set timetable data for Monday
      //  setTimetableDataMonday(mondayView, R.id.timeSlotTextView, R.id.courseIdTextView, R.id.lectureTextView, R.id.venueTextView, R.id.dayNameTextView,
        //        "8:00 AM - 9:00 AM", "CS101", "John", "Room 101", "Monday");

        // Set timetable data for Monday
        setTimetableDataMonday(view,R.id.timeSlotmonday, R.id.courseIdmonday, R.id.lecturemonday, R.id.venuemonday, R.id.dayNamemonday,
                "8:00 AM - 9:00 AM", "CS101", "John", "Room 101", "Monday");

        // Set timetable data for Tuesday
        setTimetableDataTuesday(view, R.id.timeSlotuesday, R.id.courseIdTuesday, R.id.lectureTuesay, R.id.venueTuesday, R.id.dayNameTuesday,
                "9:00 AM - 10:00 AM", "CS102", "Alice", "Room 102", "Tuesday");

        // Set timetable data for Wednesday
        setTimetableDatawensday(view, R.id.timeSlotwens, R.id.courseIdwens, R.id.lecturewens, R.id.venuewens, R.id.dayNamewens,
               "10:00 AM - 11:00 AM", "CS103", "Bob", "Room 103", "Wednesday");

        // Set timetable data for Thursday
        setTimetableDatathursday(view, R.id.timeSlotthurs, R.id.courseIdthurs, R.id.lecturethurs, R.id.venuethurs, R.id.dayNamethurs,
                "11:00 AM - 12:00 PM", "CS104", "Eva", "Room 104", "Thursday");

        // Set timetable data for Friday
        setTimetableDatafriday(view, R.id.timeSlotTextView, R.id.courseIdTextView, R.id.lectureTextView, R.id.venueTextView, R.id.dayNameTextView,
               "1:00 PM - 2:00 PM", "CS105", "David", "Room 105", "Friday");

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
