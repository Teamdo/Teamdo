package com.example.daniel.teamdo;

import android.content.Intent;
import android.content.res.Resources;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Resources res;
    Person me;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        res = getResources();
    }

    public void onClick(View view)
    {
        Intent getProfilScreenIntent;

        switch (res.getResourceEntryName(view.getId()))
        {
            case "btn_00profil":
                getProfilScreenIntent = new Intent(this, Screen1.class);
                startActivityForResult(getProfilScreenIntent, 1);
                break;
            case "btn_00project":
                if(me != null) {
                    getProfilScreenIntent = new Intent(this, Screen2.class);
                    startActivity(getProfilScreenIntent);
                }else
                {
                    Toast.makeText(getBaseContext(),"Create profile first",
                            Toast.LENGTH_SHORT).show();
                }
                break;
            case "btn_00join":
                getProfilScreenIntent = new Intent(this, Screen3.class);
                startActivity(getProfilScreenIntent) ;
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // Check which request we're responding to
        if (requestCode == 1) {
            // Make sure the request was successful
            if (resultCode == RESULT_OK) {
                Person p = new Person();
                p.setName(data.getStringExtra("Name"));
                p.setOrganisation(data.getStringExtra("Orga"));
                p.setBeruf(data.getStringExtra("Beruf"));

                p.setSkills(data.getStringExtra("Skill"));
                p.setHandynummer(data.getIntExtra("Handy", 0));
                p.setBeschreibung(data.getStringExtra("Besch"));
                me = p;

            }
        }
    }
}
