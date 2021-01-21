package drronidz.springframework;/*
    CREATED BY : DRRONIDZ
    PROJECT NAME : {IntelliJ IDEA}
    CREATED ON : 1/18/2021 , 
    CREATED ON : 10:41 PM
*/

public class Dollar extends Money{

    public Dollar(int amount) {

        this.amount = amount;

    }

    Dollar times (int multiplier){
        return new Dollar(amount * multiplier);
    }
}
