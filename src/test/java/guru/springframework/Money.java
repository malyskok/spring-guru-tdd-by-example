package guru.springframework;

public class Money {
    protected int amount;

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        return this.amount == money.amount;
    }
}
