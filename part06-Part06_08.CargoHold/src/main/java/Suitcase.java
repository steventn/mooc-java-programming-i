
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
public class Suitcase {
    private int maximumWeight;
    private ArrayList<Item> items;
    
    public Suitcase (int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        this.items.add(item);

        if (this.totalWeight() > this.maximumWeight) {
            this.items.remove(item);
        }    
    }
    
    public void printItems () {
        for (int i = 0; i < this.items.size(); i++) {
            System.out.println(this.items.get(i));
        }
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (int i = 0; i < this.items.size(); i++) {
            totalWeight += this.items.get(i).getWeight();
        }
        return totalWeight;

    }
    
    public Item heaviestItem () {
        if (this.items.isEmpty()) {
            return null;
        }
        int heaviest = 0; 
        Item heaviestItem = null;
        for (Item itemList: this.items) {
            if (itemList.getWeight() > heaviest) {
                heaviest = itemList.getWeight();
                heaviestItem = itemList;
            }
        }
        return heaviestItem;
    }
    
    @Override
    public String toString() {
        String returnStatement = " (" + this.totalWeight() + " kg)";
        if (this.items.isEmpty()) {
            return "no items" + returnStatement;
        }
        if (this.items.size() == 1) {
            return this.items.size() + " item" + returnStatement;
        }
        return this.items.size() + " items" + returnStatement;
    }
}
