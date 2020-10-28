/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
public class Container {
    private int container;
    
    public Container() {
        
    }
    public int contains() {
        return this.container;
    }
    
    public void add(int amount) {
        if (amount > 0) {
            this.container += amount;
            if (amount > 100 || this.container > 100) {
                this.container = 100;
            }
        }   
    }
    
    public void remove(int amount) {
        if (amount > 0) {
            if (amount > this.container || this.container < 0) {
                this.container = 0;
            } else {
                this.container -= amount; 
            }
        }
    }
    
    public String toString() {
        return this.container + "/100";
    }
            
}
