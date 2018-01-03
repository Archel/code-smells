package es.rachelcarmena.oo.abusers.smell2;

public class SuperTenant extends Tenant {

    public SuperTenant(String name, int deposit) {
        super(name, deposit);
    }

    @Override
    public int calculateDepositAfterRenting() {
        return this.deposit * 2;
    }
}
