package com.example.daniel.teamdo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Sophia on 17.04.2016.
 */
public class Screen4 extends Activity{

    Person person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout4);
        Server s = Server.getInstance();
        person = s.getPersonen().get(FragmentOne.counter);
        refillValues();
    }

    private void refillValues()
    {

        TextView nameview = (TextView) findViewById(R.id.txt_04name);
        nameview.setText(person.getName());

        TextView jobview = (TextView) findViewById(R.id.txt_04job);
        jobview.setText(person.getBeruf());

        TextView organisation = (TextView) findViewById(R.id.txt_04organization);
        organisation.setText(person.getOrganisation());

        TextView skillview = (TextView) findViewById(R.id.txt_04skills);
        skillview.setText(person.getSkills());

        TextView beschreibungview = (TextView) findViewById(R.id.txt_04description);
        beschreibungview.setText(person.getBeschreibung());

        TextView numberview = (TextView) findViewById(R.id.txt_04number);
        numberview.setText("" + person.getHandynummer());


    }
    
}
