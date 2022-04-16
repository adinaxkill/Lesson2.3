package com.example.lesson23;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lesson23.databinding.FragmentSecondBinding;


public class FourthFragment extends Fragment {

    private FragmentSecondBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment\
        binding = FragmentSecondBinding.inflate(LayoutInflater.from(requireContext()),
                container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (getArguments() != null) {
            String text = getArguments().getString("key.three");
            binding.textView.setText(text);
        }
        binding.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Bundle bundle = new Bundle();
                        bundle.putString("key.four", binding.textView.getText().toString());
                        FourthFragment fragment = new FourthFragment();
                        fragment.setArguments(bundle);
                        requireActivity().getSupportFragmentManager().beginTransaction().
                                replace(R.id.container, fragment);
                    }
                });
            }
        });
    }
}


