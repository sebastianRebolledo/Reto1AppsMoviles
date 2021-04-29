package com.example.reto1appsmoviles;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;

import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;


public class NewSiteFragment extends Fragment implements View.OnClickListener {

    private ImageButton imagenesBtn;
    private EditText namePlaceET;
    private ImageButton searchPlaceBtn;
    private TextView direccionPlaceTV;
    private Button registrarBtn;
    private ImageView imageViewCharger;
    private File file;

    public NewSiteFragment() {
        // Required empty public constructor
    }

    public static NewSiteFragment newInstance() {
        NewSiteFragment fragment = new NewSiteFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View root =inflater.inflate(R.layout.fragment_new_site, container, false);
        imagenesBtn= root.findViewById(R.id.imagenesBtn);
        namePlaceET= root.findViewById(R.id.namePlaceET);
        searchPlaceBtn = root.findViewById(R.id.searchPlaceBtn);
        direccionPlaceTV= root.findViewById(R.id.direccionPlaceTV);
        imageViewCharger= root.findViewById(R.id.imageViewCharger);
        imagenesBtn.setOnClickListener(this);
        searchPlaceBtn.setOnClickListener(this);


        imagenesBtn.setOnClickListener(
                (v) ->{
                    Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                    startActivity(i);
                    Toast.makeText(getContext(),"Boton para abrir galeria",Toast.LENGTH_LONG).show();
                }

        );
        return root;
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.imagenesBtn:
                Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                file = new File( getContext().getExternalFilesDir(null) + "/photo.png");
                Log.e(">>>", ""+file);
                Uri uri = FileProvider.getUriForFile(getActivity(),getContext().getPackageName(),file);
                i.putExtra(MediaStore.EXTRA_OUTPUT,uri);
                startActivity(i);
                Toast.makeText(getContext(),"Boton para abrir galeria",Toast.LENGTH_LONG).show();
                break;
            case R.id.searchPlaceBtn:
                Toast.makeText(getContext(),"Boton para ir al mapa",Toast.LENGTH_LONG).show();
                break;

        }
    }
}