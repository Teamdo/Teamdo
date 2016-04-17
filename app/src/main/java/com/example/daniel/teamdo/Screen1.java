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

        if ((res.getResourceEntryName(view.getId())).equals("btn_01save"))
        {

            Person p = packAllesInEinObject();

            Intent returnIntent = new Intent();
            returnIntent.putExtra("Name", p.getName());
            returnIntent.putExtra("Beruf", p.getBeruf());
            returnIntent.putExtra("Orga", p.getOrganisation());
            returnIntent.putExtra("Skill", p.getSkills());
            returnIntent.putExtra("Handy", p.getHandynummer());
            returnIntent.putExtra("Besch", p.getBeschreibung());
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

        TextView nameview = (TextView) findViewById(R.id.txt_01name);
        name = nameview.getText().toString();


        TextView jobview = (TextView) findViewById(R.id.txt_01job);
        beruf = jobview.getText().toString();

        TextView organisation = (TextView) findViewById(R.id.txt_01organization);
        orga = organisation.getText().toString();

        TextView skillview = (TextView) findViewById(R.id.txt_01skills);
        person.setSkills( skillview.getText().toString());

        TextView numberview = (TextView) findViewById(R.id.txt_01number);
        person.setHandynummer( Integer.parseInt(numberview.getText().toString()));

        TextView beschreibungview = (TextView) findViewById(R.id.txt_01description);
        person.setBeschreibung( beschreibungview.getText().toString());

        person.setName(name);
        person.setBeruf(beruf);
        person.setOrganisation(orga);
        //TODO: project.setPitcher();



        return person;

    }
}
