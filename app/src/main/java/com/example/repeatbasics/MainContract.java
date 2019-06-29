package com.example.repeatbasics;

public interface MainContract {
    enum FragmentType {
        TOP, BOTTOM
    }

    interface Listener {
        void updateFragments(FragmentType type);
    }
}
