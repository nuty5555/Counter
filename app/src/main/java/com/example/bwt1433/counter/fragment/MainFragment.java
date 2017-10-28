package com.example.bwt1433.counter.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.bwt1433.counter.R;

/**
 * Created by bwt1433 on 28/10/2560.
 */

public class MainFragment extends Fragment{
    //Create Main Method

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //Controller
        controller();
    }

    private void controller() {
        TextView textView = (TextView) getView().findViewById(R.id.txtNewRegister);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Move to register
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.ContentofFragmentMain,new RegisterFragment())
                        .addToBackStack(null).commit();


            }
        });
    }

    // Create View Group
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main,container,false);
        return view;
    }
} //Main Class
