package com.example.schooltimetable.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.schooltimetable.R;
import com.example.schooltimetable.databinding.FragmentHomeBinding;

public class settingsFragment extends Fragment {
    private FragmentHomeBinding binding;
    private TextView textView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragmentsettings, container, false);
        // textView = root.findViewById(R.id.textHome);
        // You can set text or perform other operations on textView if needed
        return root;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
