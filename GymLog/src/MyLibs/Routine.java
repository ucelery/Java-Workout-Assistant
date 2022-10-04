package MyLibs;

import java.util.ArrayList;

public class Routine {
    private String name;
    private ArrayList<Exercise> exercises;
    
    public Routine(String name) {
        this.name = name;
    }
    
    public Routine(String name, ArrayList<Exercise> exercises) {
        this.name = name;
        this.exercises = exercises;
    }
    
    public String getName() {
        return this.name;
    }
    
    public ArrayList<Exercise> getExercises() {
        return this.exercises;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setExercises(ArrayList<Exercise> exercises) {
        this.exercises = exercises;
    }
}
