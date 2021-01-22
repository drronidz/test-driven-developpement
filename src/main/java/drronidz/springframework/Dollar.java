package drronidz.springframework;/*
    CREATED BY : DRRONIDZ
    PROJECT NAME : {IntelliJ IDEA}
    CREATED ON : 1/18/2021 , 
    CREATED ON : 10:41 PM
*/

public class Dollar extends Money{

    public Dollar(int amount , String currency) {
       super(amount,currency);
    }

    @Override
    public Money times (int multiplier){
        return Money.dollar(amount * multiplier);
    }
}
