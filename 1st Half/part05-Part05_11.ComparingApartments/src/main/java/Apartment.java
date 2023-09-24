
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
        return this.squares > compared.squares;
    }

    public int priceDifference(Apartment compared) {
        int priceHere = this.pricePerSquare * this.squares;
        int priceThere = compared.pricePerSquare * compared.squares;
        if (priceHere > priceThere) {
            return priceHere - priceThere;
        } else {
            return priceThere - priceHere;
        }
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int priceHere = this.pricePerSquare * this.squares;
        int priceThere = compared.pricePerSquare * compared.squares;
        return priceHere > priceThere;
    }
}
