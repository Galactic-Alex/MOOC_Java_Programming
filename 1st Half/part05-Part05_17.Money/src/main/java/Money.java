
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        return new Money(this.euros + addition.euros, this.cents + addition.cents);
    }

    public boolean lessThan(Money compared) {
        if (this.euros > compared.euros) {
            return false;
        }
        return this.euros != compared.euros || this.cents < compared.cents;
    }

    public Money minus(Money decreaser) {
        if (decreaser.lessThan(this)) {
            return new Money(this.euros - decreaser.euros - 1, this.cents + (100 - decreaser.cents));

        }
        return new Money(0, 0);
    }
}
