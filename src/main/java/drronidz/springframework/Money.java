package drronidz.springframework;/*
    CREATED BY : DRRONIDZ
    PROJECT NAME : {IntelliJ IDEA}
    CREATED ON : 1/18/2021 , 
    CREATED ON : 10:39 PM
*/

public class Money {
    int amount;
    void multiplication(){}
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
                && this.getClass().equals(object.getClass());
    }
}
