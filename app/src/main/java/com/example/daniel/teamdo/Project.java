package com.example.daniel.teamdo;

import java.util.ArrayList;

/**
 * Created by Tobi on 16.04.2016.
 */
public class Project
{
    private int id;
    private String titel;
    private String beschreibung;
    private int freiePlätze;
    private ArrayList<String> skills;
    private Person pitcher;
    private ArrayList<Person> likedTeilnehmer;


    public Project()
    {
        skills = new ArrayList<String>();
        likedTeilnehmer = new ArrayList<Person>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public int getFreiePlätze() {
        return freiePlätze;
    }

    public void setFreiePlätze(int freiePlätze) {
        this.freiePlätze = freiePlätze;
    }


    public Person getPitcher() {
        return pitcher;
    }

    public void setPitcher(Person pitcher) {
        this.pitcher = pitcher;
    }

    public void addSkill(String s)
    {
        skills.add(s);
    }

    public void addLikedTeilnehmer(Person p)
    {
        likedTeilnehmer.add(p);
    }
}
