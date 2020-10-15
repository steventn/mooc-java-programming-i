/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
public class Cube {
    private int edgeLength;
     
    public Cube (int length) {
        this.edgeLength = length;
    }
    
    public int volume() {
        return edgeLength * edgeLength * edgeLength;
    }
    
    @Override
    public String toString() {
        return "The legnth of the edge is " + this.edgeLength + " and the volume " + volume();
    }
}
