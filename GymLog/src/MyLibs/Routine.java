package MyLibs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Routine {
    private String name;
    private String id;
    private ArrayList<Exercise> exercises = new ArrayList();
    
    public Routine(String id) {
        this.id = id;
    }
    
    public Routine(String id, String name) {
        this.name = name;
        this.id = id;
    }
    
    public Routine(String id, String name, ArrayList<Exercise> exercises) {
        this.name = name;
        this.exercises = exercises;
        this.id = id;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getId() {
        return this.id;
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
    
    public void updateExercisesFromFile() {
        // Get exercises data
        try {
            File myObj = new File(System.getProperty("user.dir") + "\\src\\Data\\Exercises.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] values = data.split(",");
              
                String _id = values[0];
                String _exerciseName = values[1];
                String _type = values[2];
                float _breakTime = Float.parseFloat(values[3]);
                float _executionTime = Float.parseFloat(values[4]);
                int _reps = Integer.parseInt(values[5]);
                int _sets = Integer.parseInt(values[6]);
                
                // Check if exercise has the same ID as this routine
                // if so add it to the routine's ArrayList of exercises
                if (_id.equals(this.id)) {
                    // System.out.print("id: " + _id + 
                    //        " name: " + _exerciseName + 
                    //        " type: " + _type + 
                    //        " break time: " + _breakTime + 
                    //        " exec time: " + _executionTime + 
                    //        " reps: " + _reps + 
                    //        " sets: " + _sets);
                    Exercise ex;
                    if (_type.equals("time"))
                        ex = new Exercise(_exerciseName, _executionTime, _breakTime, _sets);
                    else
                        ex = new Exercise(_exerciseName, _reps, _breakTime, _sets);
                        
                    exercises.add(ex);
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
