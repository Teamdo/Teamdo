package com.example.daniel.teamdo;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Tobi on 16.04.2016.
 */
public class Screen1 extends Activity{

    Resources res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout1);
        res = getResources();
    }

    public void onClick(View view)
    {
        if ((res.getResourceEntryName(view.getId())).equals("btn_01speichern"))
        {
            Person p = packAllesInEinObject();
            Intent returnIntent = new Intent();
            returnIntent.putExtra("Name", p.getName());
            returnIntent.putExtra("Beruf", p.getBeruf());
            returnIntent.putExtra("Orga", p.getOrganisation());
            setResult(Activity.RESULT_OK,returnIntent);
            finish();
        }

    }

    private Person packAllesInEinObject() {
        String name;
        String beruf;
        String orga;
        int varPlatz;
        Person person = new Person();

        TextView projektTitel = (TextView) findViewById(R.id.txt_01name);
        name = projektTitel.getText().toString();

        TextView jobview = (TextView) findViewById(R.id.txt_01job);
        beruf = jobview.getText().toString();

        TextView organisation = (TextView) findViewById(R.id.txt_01organization);
        orga = organisation.getText().toString();

        person.setName(name);
        person.setBeruf(beruf);
        person.setOrganisation(orga);
        //TODO: project.setPitcher();


        return person;

    }
}
