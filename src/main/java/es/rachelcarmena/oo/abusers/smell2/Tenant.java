package es.rachelcarmena.oo.abusers.smell2;

public class Tenant {
    private final String name;
    protected final int deposit;

    public Tenant(String name, int deposit) {
        this.name = name;
        this.deposit = deposit;
    }

    public int calculateDepositAfterRenting() {
        return deposit;
    }
}
