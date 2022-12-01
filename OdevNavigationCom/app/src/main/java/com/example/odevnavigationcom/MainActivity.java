package com.example.odevnavigationcom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.odevnavigationcom.databinding.FragmentAnasayfaBinding;

public class MainActivity extends AppCompatActivity {
    private FragmentAnasayfaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}