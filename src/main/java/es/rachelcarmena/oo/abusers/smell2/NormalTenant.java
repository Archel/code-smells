package es.rachelcarmena.oo.abusers.smell2;

public class NormalTenant extends Tenant {
    public NormalTenant(String name, int deposit) {
        super(name, deposit);
    }

    @Override
    int calculateDepositAfterRenting() {
        return deposit;
    }


}
