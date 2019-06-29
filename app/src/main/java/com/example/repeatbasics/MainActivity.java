package com.example.repeatbasics;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements MainContract.Listener {
    public static FragmentController mFragmentController = new FragmentController(0, 0);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        doUpdateFragments(R.id.container_top, R.id.container_bottom, FirstFragment.newInstance(), SecondFragment.newInstance());

    }


    public void doUpdateFragments(int mainContainer, int anotherContainer, Fragment main, Fragment another) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(mainContainer, main)
                .replace(anotherContainer, another)
                .commit();
    }

    @Override
    public void updateFragments(MainContract.FragmentType type) {
        switch (type) {
            case TOP:
                doUpdateFragments(R.id.container_top, R.id.container_bottom, FirstFragment.newInstance(), SecondFragment.newInstance());
                break;
            case BOTTOM:
                doUpdateFragments(R.id.container_top, R.id.container_bottom, SecondFragment.newInstance(), FirstFragment.newInstance());
                break;
        }
    }
}
