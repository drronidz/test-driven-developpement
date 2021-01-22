package drronidz.springframework;/*
    CREATED BY : DRRONIDZ
    PROJECT NAME : {IntelliJ IDEA}
    CREATED ON : 1/18/2021 , 
    CREATED ON : 10:39 PM
*/

public abstract class Money {

    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    void multiplication(){}

    public abstract Money times(int multiplier);

    public static Money dollar (int amount) {
        return new Dollar(amount,"USD");
    }
    public static Money franc (int amount) {
        return new Franc(amount,"CHF");
    }

    protected String currency() {
        return currency;
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
                && this.getClass().equals(object.getClass());
    }
}
