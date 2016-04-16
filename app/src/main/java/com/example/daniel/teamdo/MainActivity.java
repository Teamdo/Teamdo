package com.example.daniel.teamdo;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Resources res;
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
                startActivity(getProfilScreenIntent) ;
                break;
            case "btn_00project":
                getProfilScreenIntent = new Intent(this, Screen2.class);
                startActivity(getProfilScreenIntent) ;
                break;
            case "btn_00join":
                getProfilScreenIntent = new Intent(this, Screen3.class);
                startActivity(getProfilScreenIntent) ;
                break;
        }
    }
}
