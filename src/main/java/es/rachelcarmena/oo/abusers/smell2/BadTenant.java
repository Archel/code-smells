package es.rachelcarmena.oo.abusers.smell2;

public class BadTenant extends Tenant {
    public BadTenant(String name, int deposit) {
        super(name, deposit);
    }

    @Override
    public int calculateDepositAfterRenting() {
        return 0;
    }
}
