package com.example.daniel.teamdo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * Created by Daniel on 17.04.2016.
 */
public class FragmentOne extends Fragment {

   // public static FragmentOne newInstance(){
     //   FragmentOne fragone = new FragmentOne();
       // return  fragone;
    //}

    public FragmentOne(){

    }

    TextView txt_fragView;

    static int counter = 0;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Server s = Server.getInstance();


        counter++;
        if(counter >= s.getPersonen().size()){
            counter = counter % s.getPersonen().size();
        }
        Person person =  s.getPersonen().get(counter);


        View rootView = inflater.inflate(R.layout.layout3, container, false);

        txt_fragView = (TextView) rootView.findViewById(R.id.lbl_03projekttitel);
        txt_fragView.setText(person.getName());

        return rootView;
        //return inflater.inflate(R.layout.layout3, container, false);
    }
}
