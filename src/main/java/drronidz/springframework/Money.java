package drronidz.springframework;/*
    CREATED BY : DRRONIDZ
    PROJECT NAME : {IntelliJ IDEA}
    CREATED ON : 1/18/2021 , 
    CREATED ON : 10:39 PM
*/

public class Money implements Expression {

    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    void multiplication(){}

    public Money times (int multiplier){
        return new Money(amount * multiplier , this.currency);
    }

    public static Money dollar (int amount) {
        return new Money(amount,"USD");
    }
    public static Money franc (int amount) {
        return new Money(amount,"CHF");
    }

    protected String currency() {
        return currency;
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
                && this.currency.equals(money.currency);
    }
    @Override
    public Money reduce(Bank bank, String to) {
     /*   return this;*/
     /*   int rate = (currency.equals("CHF") && to.equals("USD")) ? 2:1;*/
        return new Money(amount / bank.rate(this.currency,to) ,to);
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }
    public Expression plus(Money addend) {
       // return new Money(amount + addend.amount ,currency);
        return new Sum(this,addend);
    }
}
