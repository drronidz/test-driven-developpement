package drronidz.springframework;/*
    CREATED BY : DRRONIDZ
    PROJECT NAME : {IntelliJ IDEA}
    CREATED ON : 1/18/2021 , 
    CREATED ON : 10:41 PM
*/

public class Dollar {

    private int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times (int multiplier){
        return new Dollar(amount * multiplier);
    }
    public boolean equals(Object object) {

        Dollar dollar = (Dollar) object;

        return amount == dollar.amount;
    }
}
