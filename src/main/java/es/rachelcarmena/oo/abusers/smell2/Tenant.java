package es.rachelcarmena.oo.abusers.smell2;

abstract class Tenant {
    private final String name;
    protected final int deposit;

    public Tenant(String name, int deposit) {
        this.name = name;
        this.deposit = deposit;
    }

    abstract int calculateDepositAfterRenting();
}
