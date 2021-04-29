package com.example.reto1appsmoviles;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ListSiteFragment extends Fragment {

    private RecyclerView placesViewList;
    LinearLayoutManager layoutManager;
    private PlacesAdapter adapter;



    public ListSiteFragment() {
        // Required empty public constructor
    }


    public static ListSiteFragment newInstance() {
        ListSiteFragment fragment = new ListSiteFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View root = inflater.inflate(R.layout.fragment_list_site, container, false);
        placesViewList = root.findViewById(R.id.placesViewList);
        placesViewList.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getContext());
        placesViewList.setLayoutManager(layoutManager);

        adapter =  new PlacesAdapter();
        placesViewList.setAdapter(adapter);

        return root;
    }
}