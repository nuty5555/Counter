package com.example.bwt1433.counter.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.bwt1433.counter.MainActivity;
import com.example.bwt1433.counter.R;

/**
 * Created by bwt1433 on 28/10/2560.
 */

public class RegisterFragment extends Fragment {
    //Explicit
    private String nameString , userString, passwordString ;

    @Override
public void onActivityCreated(@Nullable Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);

    //Create Toolbar
        createToolbar();
        saveController();
    }


//        Save Controller
        private void saveController (){
        ImageView imageView = (ImageView) getView().findViewById(R.id.imvsave);
        imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
        });



    }

    private void createToolbar() {
        Toolbar toolbar = (Toolbar) getView().findViewById(R.id.toolbarRegister);
        ((MainActivity)getActivity()).setSupportActionBar(toolbar);
        ((MainActivity)getActivity()).setTitle(getResources().getString(R.string.new_register));
        ((MainActivity)getActivity()).getSupportActionBar().setHomeButtonEnabled(true);
        ((MainActivity)getActivity()).getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_new_register,
                container,false);
        return view;
    }
}//Main Class
