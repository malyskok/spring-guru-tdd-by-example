package guru.springframework;

public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
    }

    @Override
    public Dollar times(int multiplier) {
        return new Dollar(this.amount * multiplier);
    }
}
