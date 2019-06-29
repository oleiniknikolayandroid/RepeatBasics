package com.example.repeatbasics;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;


import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.repeatbasics.databinding.FragmentFirstBinding;

import static com.example.repeatbasics.MainActivity.mFragmentController;


public class FirstFragment extends Fragment {
    public FirstFragment() {
        // Required empty public constructor
    }

    private MainContract.Listener mListener;
    private FragmentFirstBinding mBinding;



    public static FirstFragment newInstance() {
        return new FirstFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_first, container, false);
        mBinding.setFragmentcontroller(mFragmentController);
        mBinding.setHandler(this);
        return mBinding.getRoot();
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof MainContract.Listener) {
            mListener = (MainContract.Listener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    public void updateUI() {
        int count = mFragmentController.getFirstFragCounter();
        count++;
        mFragmentController.setFirstFragCounter(count);
        mBinding.setFragmentcontroller(mFragmentController);
        mListener.updateFragments(MainContract.FragmentType.TOP);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }
}