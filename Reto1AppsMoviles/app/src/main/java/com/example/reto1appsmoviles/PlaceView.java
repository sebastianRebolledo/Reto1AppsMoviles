package com.example.reto1appsmoviles;

import android.util.proto.ProtoOutputStream;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class PlaceView extends RecyclerView.ViewHolder {

    private ConstraintLayout root;
    private TextView rankingPlace;
    private TextView namePlace;

    public PlaceView(ConstraintLayout root) {
        super(root);
        this.root= root;

    }


    public ConstraintLayout getRoot() {
        return root;
    }

    public TextView getRankingPlace() {
        return rankingPlace;
    }

    public TextView getNamePlace() {
        return namePlace;
    }

}
