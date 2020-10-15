import java.lang.*;

public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        int comparedArea = compared.squares;
        return this.squares > comparedArea;
    }
    
    public int priceDifference(Apartment compared) {
        int priceDifference = compared.pricePerSquare * compared.squares;
        return Math.abs(this.pricePerSquare * squares - priceDifference);
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        int moreExpensive = compared.pricePerSquare * compared.squares;
        return moreExpensive < this.pricePerSquare * squares;
    }

}
