package com.example.schooltimetable.ui.Class;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import com.example.schooltimetable.R;
import com.example.schooltimetable.ui.Timetable.TimetableBCSFragment;
import com.example.schooltimetable.ui.Timetable.TimetableBICTFragment;
import com.example.schooltimetable.ui.Timetable.TimetableBITFragment;
import com.example.schooltimetable.ui.Timetable.TimetableBSEFragment;

public class AllClassFragment extends Fragment {

    private CardView cardBSE;
    private CardView cardBIT;
    private CardView cardBCS;
    private CardView cardBICT;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_allclass, container, false);
        cardBSE= root.findViewById(R.id.cardbse);
        cardBIT = root.findViewById(R.id.cardbit);
        cardBCS = root.findViewById(R.id.cardbcs);
        cardBICT = root.findViewById(R.id.cardbict);

        cardBSE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToTimetable("BSE");

            }
        });

        cardBIT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToTimetable("BIT");
            }
        });

        cardBCS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToTimetable("BCS");
            }
        });

        cardBICT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToTimetable("BICT");
            }
        });

        return root;
    }

    private void showToast(String message) {
        Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show();
    }

    private void navigateToTimetable(String className) {
        Fragment timetableFragment = null;

        // Determine which class timetable fragment to navigate based on className
        if ("BSE".equals(className)) {
            timetableFragment = new TimetableBSEFragment();
        } else if ("BIT".equals(className)) {
            timetableFragment = new TimetableBITFragment(); // Replace with your BIT fragment class
        } else if ("BCS".equals(className)) {
            timetableFragment = new TimetableBCSFragment(); // Replace with your BCS fragment class
        } else if ("BICT".equals(className)) {
            timetableFragment = new TimetableBICTFragment(); // Replace with your BICT fragment class
        }

        // Replace the current fragment with the selected timetable fragment
        if (timetableFragment != null) {
            requireActivity().getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentContainerAll, timetableFragment)
                    .addToBackStack(null) // This allows the user to navigate back to the previous fragment
                    .commit();
        } else {
            showToast("Timetable not available for " + className);
        }

    }


}
