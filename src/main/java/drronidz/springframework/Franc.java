package drronidz.springframework;/*
    CREATED BY : DRRONIDZ
    PROJECT NAME : {IntelliJ IDEA}
    CREATED ON : 1/21/2021 , 
    CREATED ON : 1:55 PM
*/

public class Franc  extends Money {

    public Franc(int amount) {

        this.amount = amount;

    }

    Franc times (int multiplier){
        return new Franc(amount * multiplier);
    }
}
