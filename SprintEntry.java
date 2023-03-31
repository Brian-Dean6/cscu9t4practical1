package com.stir.cscu9t4practical1;

public class SprintEntry extends Entry {
    private int reptitions;
    private int recoveryTime;
    
    public SprintEntry(String name, int day, int month, int year, int hour, int min, int sec, float distance, int rounds, int recoveryTime){
            super(name, day, month, year, hour, min, sec, distance);
            this.reptitions = rounds;
            this.recoveryTime = recoveryTime;
    }
    
    public int getRepetitions(){
        return reptitions;
    }
    public int getRecovery(){
        return recoveryTime;
    }
    
    @Override
    public String getEntry(){
        String result = getName() +"did" + getRepetitions() + "rounds of sprints"
                +getRecovery() + "Minutes, covering a distance of" +getDistance() + " km in "
                +getHour()+":"+getMin()+":"+ getSec() + " on "
                +getDay()+"/"+getMonth()+"/"+getYear()+"\n";
        return result;
    }
}
