package es.rachelcarmena.couplers.smell1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Currency;

public class Amount {
    final BigDecimal value;
    final Currency currency;

    public static Amount from(String value) {
        return new Amount(new BigDecimal(value), Currency.getInstance("EUR"));
    }

    private Amount(BigDecimal value, Currency currency) {
        this.value = value;
        this.currency = currency;
    }

    public BigDecimal getValue() {
        return value;
    }

    public Currency getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return value.setScale(2, RoundingMode.HALF_EVEN).toString();
    }
}
