package drronidz.springframework;/*
    CREATED BY : DRRONIDZ
    PROJECT NAME : {IntelliJ IDEA}
    CREATED ON : 1/25/2021 , 
    CREATED ON : 9:55 PM
*/

public class Bank {
    Money reduce(Expression source , String toCurrency){
       /*if(source instanceof Money) return (Money) source;
       Sum sum = (Sum) source;
       return sum.reduce(toCurrency);*/
        return source.reduce(toCurrency);
    }
}
