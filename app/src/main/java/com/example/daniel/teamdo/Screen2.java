package com.example.daniel.teamdo;


import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Tobi on 16.04.2016.
 */
public class Screen2 extends Activity
{

    Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);
        res = getResources();
    }

    public void onClick(View view)
    {
        if ((res.getResourceEntryName(view.getId())).equals("btn_02ok"))
        {
            Server.getInstance().addProject(packAllesInEinObject());

        }

    }

    private Project packAllesInEinObject() {
        String varTitel;
        String varBeschreibung;
        String varSkills;
        int varPlatz;
        Project project = new Project();

        TextView projektTitel = (TextView) findViewById(R.id.txt_02projekttitel);
        varTitel = projektTitel.getText().toString();

        TextView projektBeschreibung = (TextView) findViewById(R.id.lbl_02projektbeschreibung2);
        varBeschreibung = projektBeschreibung.getText().toString();

        TextView skills = (TextView) findViewById(R.id.txt_02skills);
        varSkills = skills.getText().toString();

        TextView platz = (TextView) findViewById(R.id.txt_02freieplaetze);
        varPlatz = Integer.parseInt(platz.getText().toString());

        project.setBeschreibung(varBeschreibung);
        project.setTitel(varTitel);
        project.addSkill(varSkills);
        project.setFreiePlätze(varPlatz);
        project.setPitcher(MainActivity.me);


        return project;

    }
}
