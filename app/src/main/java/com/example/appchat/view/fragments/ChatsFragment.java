package com.example.appchat.view.fragments;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.appchat.databinding.FragmentChatsBinding;


public class ChatsFragment extends Fragment {
    private FragmentChatsBinding binding;


    public ChatsFragment() {
    }

    public static ChatsFragment newInstance() {
        return new ChatsFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentChatsBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //barra de herramientas
        ((AppCompatActivity) requireActivity()).setSupportActionBar(binding.tools);



    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
