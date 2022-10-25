package MyLibs;

public class Exercise {
    public enum Type { Time, Reps }
    
    private String name;
    private float time;
    private int reps;
    private int sets;
    private Type type;
    private float breakTime;
    
    // Constructors
    public Exercise (Exercise exer) {
        this.name = exer.name;
        this.time = exer.time;
        this.sets = exer.sets;
        this.breakTime = exer.breakTime;
        
        this.type = Type.Time;
    }
    
    public Exercise (String name, float time, float breakTime, int sets) {
        this.name = name;
        this.time = time;
        this.sets = sets;
        this.breakTime = breakTime;
        
        this.type = Type.Time;
    }
    
    public Exercise (String name, int reps, float breakTime, int sets) {
        this.name = name;
        this.reps = reps;
        this.sets = sets;
        this.breakTime = breakTime;
        
        this.type = Type.Reps;
    }
    
    // Getters
    public String getName() {
        return this.name;
    }
    
    public float getTime() {
        return this.time;
    }
    
    public int getReps() {
        return this.reps;
    }
    
    public int getSets() {
        return this.sets;
    }
    
    public Type getType() {
        return this.type;
    }
    
    public float getBreakTime() {
        return this.breakTime;
    }
    
    // Setters
    public void setName(String name) {
        this.name = name;
    }
    
    public void setTime(float time) {
        this.time = time;
    }
    
    public void setReps(int reps) {
        this.reps = reps;
    }
    
    public void setSets(int sets) {
        this.sets = sets;
    }
    
    public void setType(Type type) {
        this.type = type;
    }
    
    public void setBreakTime(float breakTime) {
        this.breakTime = breakTime;
    }
}
