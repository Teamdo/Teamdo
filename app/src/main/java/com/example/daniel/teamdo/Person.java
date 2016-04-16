package com.example.daniel.teamdo;
import android.graphics.Picture;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Tobi on 16.04.2016.
 */
public class Person {
    //Daniel und Sandro <3

    private int id;
    private String vorname;
    private String nachname;
    private String beruf;
    private String organisation;
    private Picture bild;
    private ArrayList<String> skills;
    private int handynummer;
    private String beschreibung;
    private int myProjektID;
    private ArrayList<Project> likedProjekte;

    public Person() {
        ArrayList<String> skills = new ArrayList<String>();
        ArrayList<String> likedProjekte = new ArrayList<String>();
    }

    public void addSkill(String skill) {
        this.skills.add(skill);
    }

    public void addLikedProjekte(Project projekt) {
        this.likedProjekte.add(projekt);
    }

    public int getId() {
        return id;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public String getBeruf() {
        return beruf;
    }

    public String getOrganisation() {
        return organisation;
    }

    public Picture getBild() {
        return bild;
    }

    public int getHandynummer() {
        return handynummer;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public int getMyProjektID() {
        return myProjektID;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setBeruf(String beruf) {
        this.beruf = beruf;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public void setBild(Picture bild) {
        this.bild = bild;
    }


    public void setHandynummer(int handynummer) {
        this.handynummer = handynummer;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public void setMyProjektID(int myProjektID) {
        this.myProjektID = myProjektID;
    }

}
