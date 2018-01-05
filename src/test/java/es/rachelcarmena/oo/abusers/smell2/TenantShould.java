package es.rachelcarmena.oo.abusers.smell2;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TenantShould {

    @Test
    public void zero_deposit_after_renting_when_bad_tenant() {
        Tenant tenant = new BadTenant("Not Me",1000);

        assertThat(tenant.calculateDepositAfterRenting(), is(0));
    }

    @Test
    public void same_deposit_after_renting_when_normal_tenant() {
        Tenant tenant = new NormalTenant("Not Me", 1000);

        assertThat(tenant.calculateDepositAfterRenting(), is(1000));
    }

    @Test
    public void double_deposit_after_renting_when_super_tenant() {
        Tenant tenant = new SuperTenant("Rachel", 1000);

        assertThat(tenant.calculateDepositAfterRenting(), is(2000));
    }
}
