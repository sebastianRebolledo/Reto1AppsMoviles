package com.example.reto1appsmoviles;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.Manifest;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.io.File;

public class Home extends AppCompatActivity {

    private ListSiteFragment listSiteFragment;
    private MapFragment mapFragment;
    private NewSiteFragment newSiteFragment;
    private BottomNavigationView navigator;

    public static final int PERMISSIONS_CALLBACK=11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        navigator = findViewById(R.id.navigator);
        listSiteFragment = ListSiteFragment.newInstance();
        mapFragment = MapFragment.newInstance();
        newSiteFragment = NewSiteFragment.newInstance();

        ActivityCompat.requestPermissions(this,new String[]{
                Manifest.permission.CAMERA,
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.READ_EXTERNAL_STORAGE

        },PERMISSIONS_CALLBACK);


        showFragment(newSiteFragment);


        navigator.setOnNavigationItemSelectedListener(
                (menuItem)-> {

                    switch (menuItem.getItemId()){
                        case R.id.newPlace:
                            showFragment(newSiteFragment);
                           // File fie = new File(getExte);
                            break;
                        case R.id.mapaItem:
                            showFragment(mapFragment);
                            break;
                        case R.id.listPlaces:
                            showFragment(listSiteFragment);
                            break;
                    }
                    return true;
                }

        );

    }

    public void showFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.fragmentContainer,fragment);
        transaction.commit();
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if(requestCode==PERMISSIONS_CALLBACK){

        }
    }
}