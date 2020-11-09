
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */


public class BirdActions {
    
    private ArrayList<BirdDatabase> birdDatabase;
    
    public BirdActions() {
        this.birdDatabase = new ArrayList<>();
    }
    
    public void add(String name, String nameLatin) {
        BirdDatabase bird = new BirdDatabase(name, nameLatin);
        this.birdDatabase.add(bird);
    }
    
    public void addBirdObservation(String bird) {
        for (BirdDatabase birds : birdDatabase) {
            if (birds.getBirdName().equalsIgnoreCase(bird) || birds.getbirdLatinName().equalsIgnoreCase(bird)) {
                birds.increaseObservationCount();
                return;
            }
        } 
        System.out.println("Not a bird!");
    }
    
    public void printAllBirds() {
        for (BirdDatabase birds: birdDatabase) {
            System.out.println(birds);
        }
    }
    
    public void printOne(String bird) {
        for (BirdDatabase birds : birdDatabase) {
            if (birds.getBirdName().equalsIgnoreCase(bird)) {
                System.out.println(birds);
                return;
            }
        }
        System.out.println("Not a bird!");
    }
}
