package com.example.repeatbasics;

public class FragmentController {

     public int firstFragCounter;
     public int secondFragCounter;

    public FragmentController() {
    }


    public FragmentController(int firstFragCounter, int secondFragCounter) {
        this.firstFragCounter = firstFragCounter;
        this.secondFragCounter = secondFragCounter;
    }

    public int getFirstFragCounter() {
        return firstFragCounter;
    }

    public void setFirstFragCounter(int firstFragCounter) {
        this.firstFragCounter = firstFragCounter;
    }

    public int getSecondFragCounter() {
        return secondFragCounter;
    }

    public void setSecondFragCounter(int secondFragCounter) {
        this.secondFragCounter = secondFragCounter;
    }

    @Override
    public String toString() {
        return "FragmentController{" +
                "firstFragCounter=" + firstFragCounter +
                ", secondFragCounter=" + secondFragCounter +
                '}';
    }
}
