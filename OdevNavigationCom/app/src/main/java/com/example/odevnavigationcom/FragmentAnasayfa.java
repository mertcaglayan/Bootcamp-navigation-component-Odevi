package com.example.odevnavigationcom;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.odevnavigationcom.databinding.FragmentAnasayfaBinding;


public class FragmentAnasayfa extends Fragment {
    private FragmentAnasayfaBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sayfa_a, container, false);

    }


}