package drronidz.springframework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
    CREATED BY : DRRONIDZ
    PROJECT NAME : {IntelliJ IDEA}
    CREATED ON : 1/18/2021 , 
    CREATED ON : 10:39 PM
*/class MoneyTest {

    @Test
    void multiplicationDollarTest() {

        Money fiveDollar = Money.dollar(5);
        assertEquals(Money.dollar(10),fiveDollar.times(2));
        assertEquals(Money.dollar(15),fiveDollar.times(3));

        Money fiveFranc = Money.franc(5);
        assertEquals(Money.franc(10),fiveFranc.times(2));
        assertEquals(Money.franc(15),fiveFranc.times(3));
    }

    @Test
    void equalityTest() {

        assertEquals(Money.dollar(5),Money.dollar(5));
        assertNotEquals(Money.dollar(5),Money.dollar(8));

        assertNotEquals(Money.franc(5),Money.dollar(5));

        assertEquals(Money.franc(5),Money.franc(5));
        assertNotEquals(Money.franc(5),Money.franc(8));
    }

    @Test
    void currencyTest() {
        assertEquals("USD",Money.dollar(1).currency());
        assertEquals("CHF",Money.franc(1).currency());
    }

    @Test
    void simpleAdditionTest() {
        Money five = Money.dollar(5);
        Expression sum = five.plus(five);
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum , "USD");
        assertEquals(Money.dollar(10),reduced);
    }

    @Test
    void plusReturnsSumTest() {
        Money five = Money.dollar(5);
        Expression result = five.plus(five);
        Sum sum = (Sum) result;
        assertEquals(five,sum.augmend);
        assertEquals(five,sum.addmend);
    }

    @Test
    void reduceSumTest() {
        Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
        Bank bank = new Bank();
        Money result = bank.reduce(sum , "USD");
        assertEquals(Money.dollar(7),result);
    }

    @Test
    void reduceMoneyTest() {
        Bank bank = new Bank();
        Money result = bank.reduce(Money.dollar(1), "USD");
        assertEquals(Money.dollar(1), result);
    }
}