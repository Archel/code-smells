package es.rachelcarmena.bloaters.smell1;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class WithdrawShould {

    public static final double AN_AMOUNT = 560d;

    @Test
    public void keep_the_amount() {
        Amount amount = new Amount(AN_AMOUNT);
        Withdraw withdraw = new Withdraw(amount);

        assertThat(withdraw.getAmount(), is(amount));
    }
}
