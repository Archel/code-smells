package es.rachelcarmena.bloaters.smell1;

import java.util.Objects;

public class Amount {
    private double amount;

    public Amount(double amount) {

        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amount amount1 = (Amount) o;
        return Double.compare(amount1.amount, amount) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(amount);
    }
}
