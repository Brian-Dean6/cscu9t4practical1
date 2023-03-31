package com.stir.cscu9t4practical1;
class CycleEntry extends Entry {
    private String Terrain;
    private String Tempo;
    
    public CycleEntry(String n, int d, int m, int y, int h, int min, int s, float dist, String ter, String temp){
        super(n, d, m, y, h, min, s, dist);
        this.Terrain = ter;
        this.Tempo = temp;
    }
    
    public String getTerrain() {
        if(Terrain.equals("asphalt"))
            return "In a" + Terrain;
        else
        return Terrain;
    }
    
    public String getTempo(){
        if(Tempo.equals("moderate"))
            return "In a" + Tempo;
        else
        return Terrain;
    }
    @Override
     public String getEntry(){
        String result = getName() +"cycled " + getTerrain() + "at the tempo of "
                +getTempo() + "Minutes, covering a distance of " +getDistance() + " km in "
                +getHour()+":"+getMin()+":"+ getSec() + " on "
                +getDay()+"/"+getMonth()+"/"+getYear()+"\n";
        return result;
    }
}
