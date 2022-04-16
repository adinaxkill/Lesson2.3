package com.example.lesson23;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.FeatureGroupInfo;
import android.os.Bundle;

import com.example.lesson23.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.container,
                    new FirstFragment()).commit();
        }
    }
}