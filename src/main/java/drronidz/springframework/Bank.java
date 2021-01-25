package drronidz.springframework;/*
    CREATED BY : DRRONIDZ
    PROJECT NAME : {IntelliJ IDEA}
    CREATED ON : 1/25/2021 , 
    CREATED ON : 9:55 PM
*/

import java.util.HashMap;

public class Bank {
    private HashMap<Pair,Integer> rateMap = new HashMap<>();

    Money reduce(Expression source , String toCurrency){
       /*if(source instanceof Money) return (Money) source;
       Sum sum = (Sum) source;
       return sum.reduce(toCurrency);*/
        return source.reduce(this,toCurrency);
    }

    public void addRate(String from, String to, int rate) {
        rateMap.put(new Pair(from,to) , rate);
    }

    public int rate(String from, String to) {
        if(from.equals(to)){
            return 1;
        }
        Integer rate = rateMap.get(new Pair(from, to));
        return rate;
    }
}
