package com.example.reto1appsmoviles;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PlacesAdapter extends RecyclerView.Adapter<PlaceView> {

    private ArrayList<Place> places;

public PlacesAdapter(){
places = new ArrayList<>();
}



    public void addPlace(Place place){
    places.add(place);
    }

    @NonNull
    @Override
    public PlaceView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View row= inflater.inflate(R.layout.placerow,null);
        ConstraintLayout rowroot = (ConstraintLayout) row;
        PlaceView  placeViewView = new PlaceView(rowroot);
        return placeViewView;
    }

    @Override
    public void onBindViewHolder(@NonNull PlaceView holder, int position) {
    holder.getNamePlace().setText(places.get(position).getNamePlace());
    holder.getRankingPlace().setText(places.get(position).getRanking());
    }

    @Override
    public int getItemCount() {
        return places.size();
    }



}
