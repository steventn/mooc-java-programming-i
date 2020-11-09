/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
public class BirdDatabase {
    
    private String birdName;
    private String birdLatinName;
    private int observationCount;
    
    public BirdDatabase (String birdName, String birdLatinName) {
        this.birdName = birdName;
        this.birdLatinName = birdLatinName;
        this.observationCount = 0;
    }
    
    public void increaseObservationCount () {
        this.observationCount++;
    }
    
    public String getBirdName() {
        return this.birdName;
    }
    
    public String getbirdLatinName() {
        return this.birdLatinName;
    }
    
    public String getObservationCount() {
        return String.valueOf(this.observationCount);
    }
    
    public String toString() {
        return this.birdName + " (" + this.birdLatinName + "): " + this.observationCount + " observations";
    }
    
}
