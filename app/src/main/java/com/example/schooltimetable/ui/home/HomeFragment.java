package com.example.schooltimetable.ui.home;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.schooltimetable.R;
import com.example.schooltimetable.ui.Class.AllClassFragment;
import com.example.schooltimetable.ui.Lecture.LectureFragment;

public class HomeFragment extends Fragment {

    private CardView cardHome;
    private CardView cardChat;
    private CardView cardProfile;
    private CardView cardClassNames;
    private CardView cardSettings;
    private CardView cardLogout;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        cardHome = root.findViewById(R.id.cardHome);
        cardChat = root.findViewById(R.id.cardChat);
        cardProfile = root.findViewById(R.id.cardProfile);
        cardClassNames = root.findViewById(R.id.cardClass);
        cardSettings = root.findViewById(R.id.cardSettings);
        cardLogout = root.findViewById(R.id.cardLogout);

        cardHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Home Clicked");
            }
        });

        View fragment1View = inflater.inflate(R.layout.lecturefragment1, container, false);
        CardView cardChatFragment1 = fragment1View.findViewById(R.id.cardChatFragment);
        cardChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    // Navigate to the lectures fragment (AllClassFragment)
                    LectureFragment lectures = new LectureFragment();
                    FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                    transaction.replace(R.id.cardChatFragment, lectures);
                    transaction.addToBackStack(null); // Optional: Adds the transaction to the back stack
                    transaction.commit();


               // showToast("Chat Clicked");
            }
        });
        cardProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Profile Clicked");
            }
        });


        cardClassNames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Replace the current fragment with AllClassFragment

            }
        });

        cardSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Settings Clicked");
            }
        });
        cardLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Logout Clicked");
            }
        });

        return root;
    }

    private void showToast(String message) {
        Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show();
    }
}
