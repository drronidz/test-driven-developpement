package drronidz.springframework;/*
    CREATED BY : DRRONIDZ
    PROJECT NAME : {IntelliJ IDEA}
    CREATED ON : 1/18/2021 , 
    CREATED ON : 10:41 PM
*/

public class Dollar {

    int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }
    void times (int multiplier){
        amount *= multiplier;
    }
}
