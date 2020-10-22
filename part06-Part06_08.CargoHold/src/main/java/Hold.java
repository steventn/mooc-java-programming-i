
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
public class Hold {
    private ArrayList<Suitcase> items;
    private int maximumWeight;
    private int totalWeightSuitcase;
    
    public Hold(int maximumWeight) {
        this.items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        this.items.add(suitcase);
        totalWeightSuitcase += suitcase.totalWeight();

        if (totalWeightSuitcase > this.maximumWeight) {
            this.items.remove(suitcase);
            totalWeightSuitcase -= suitcase.totalWeight();
        }   
    }
    
    public void printItems() {
        for (Suitcase item : this.items) {
            item.printItems();
        }
    }
    
    @Override
    public String toString() {
        String returnStatement = " (" + totalWeightSuitcase + " kg)";
        if (this.items.isEmpty()) {
            return "no suitcases" + returnStatement;
        }
        if (this.items.size() == 1) {
            return this.items.size() + " suitcase" + returnStatement;
        }
        return this.items.size() + " suitcases" + returnStatement;

    }
}
