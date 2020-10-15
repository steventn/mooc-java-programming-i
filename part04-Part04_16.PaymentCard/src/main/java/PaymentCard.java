/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
public class PaymentCard {
    private double openingBalance;
    
    public PaymentCard(double openingBalance) {
        this.openingBalance = openingBalance;
    }
    
    public String toString() {
        return "The card has a balance of " + this.openingBalance + " euros"; 
    }
    
    public void eatAffordably() {
        if (openingBalance - 2.60 < 0) {
            openingBalance -= 0;
        } else {
            this.openingBalance -= 2.60;
        }
        
    }
    
    public void eatHeartily() {
        if (openingBalance - 4.60 < 0) {
            openingBalance -= 0;
        } else {
           this.openingBalance -= 4.60; 
        }
        
    }
    
    public void addMoney(double amount) {
        if (this.openingBalance + amount > 150) {
            this.openingBalance = 150;
        }
        else if (amount < 0) {
            this.openingBalance += 0;
        } else {
            this.openingBalance += amount; 
        }
        
        
    }
}
