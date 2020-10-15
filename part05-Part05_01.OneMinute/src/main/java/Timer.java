/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
public class Timer {
    private int hundredths; 
    private int seconds; 
    
    public Timer() {
        int hundredths = this.hundredths;
        int seconds = this.seconds;
    }
    
    public void advance() {
        this.hundredths++; 
        if (hundredths >= 100) {
            hundredths = 0;
            seconds++;
        }
        
        if (seconds >= 60) {
            seconds = 0;
        }
    }
    
    public String toString() {
        if (hundredths < 10) {
            return "0" + seconds + ":" + "0" + hundredths;
        }
        
        if (seconds < 10) {
            return "0" + seconds + ":" + hundredths;
        }
        return seconds + ":" + hundredths;
    }
}
