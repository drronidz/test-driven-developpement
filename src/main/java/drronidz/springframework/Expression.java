package drronidz.springframework;/*
    CREATED BY : DRRONIDZ
    PROJECT NAME : {IntelliJ IDEA}
    CREATED ON : 1/25/2021 , 
    CREATED ON : 9:51 PM
*/

public interface Expression {
    Expression times(int multiplier);

    Money reduce(Bank bank, String to);
    Expression plus(Expression addend);
}
