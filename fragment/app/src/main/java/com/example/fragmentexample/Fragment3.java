package com.example.fragmentexample;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment3 extends Fragment {
    MainActivity activity;

    @Override
    public void onAttach(@NonNull Context context) {
        activity = (MainActivity)getActivity();
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         ViewGroup viewGroup = (ViewGroup)inflater.inflate(R.layout.fragment3, container,false);
         activity.btn3.setText("fr 3 왔다감");
         return viewGroup;
    }
}
