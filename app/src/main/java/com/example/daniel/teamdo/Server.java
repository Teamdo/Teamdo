package com.example.daniel.teamdo;

import java.util.ArrayList;

/**
 * Created by Tobi on 17.04.2016.
 */
public class Server {

    private static Server instance = null;

    ArrayList<Person> personen;
    ArrayList<Project> projects;

    protected Server() {
        personen = new ArrayList<Person>();
        projects = new ArrayList<Project>();

        addPerson(new Person("Tobias Müller", "Student", "Oth Regensburg", 011222222));
        addPerson(new Person("Stefan Rauchbauer", "Student", "Oth Regensburg", 011222222));
        addPerson(new Person("Sophia Geserer", "Student", "Oth Regensburg", 011222222));
        addPerson(new Person("Daniel Olafson", "Student", "Oth Regensburg", 011222222));
        addPerson(new Person("Sandro Volpicella", "Student", "Oth Regensburg", 011222222));

        for(Person p : personen)
            p.likedProjekte = new ArrayList<Project>();



    }
    public static Server getInstance() {
        if(instance == null) {
            instance = new Server();
        }
        return instance;
    }

    public void addPerson(Person p)
    {
        personen.add(p);
    }

    public void addProject(Project p)
    {
        projects.add(p);
    }

    public ArrayList<Person> getPersonen()
    {
        return personen;
    }
}
