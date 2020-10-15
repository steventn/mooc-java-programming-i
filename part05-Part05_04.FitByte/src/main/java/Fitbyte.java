/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
public class Fitbyte {
    private int age;
    private int heartRate; 
    
    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.heartRate = restingHeartRate;
    }
    
    public double targetHeartRate(double percentageOfMaximum) {
        double maximum = 206.3 - (.711 * this.age);
        return (maximum - this.heartRate) * (percentageOfMaximum) + this.heartRate;
    }
}
