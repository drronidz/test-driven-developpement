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
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10),five.times(2));
        assertEquals(Money.dollar(15),five.times(3));

    }

    @Test
    void equalityDollarTest() {
        assertEquals(Money.dollar(5),Money.dollar(5));
        assertNotEquals(Money.dollar(5),Money.dollar(8));
        assertNotEquals(Money.franc(5),Money.dollar(5));
    }
    @Test
    void multiplicationFrancTest() {
        Money five = Money.franc(5);
        assertEquals(Money.franc(10),five.times(2));
        assertEquals(Money.franc(15),five.times(3));

    }

    @Test
    void equalityFrancTest() {
        assertEquals(Money.franc(5),Money.franc(5));
        assertNotEquals(Money.franc(5),Money.franc(8));
    }

    @Test
    void currencyTest() {
        assertEquals("USD",Money.dollar(1).currency());
        assertEquals("CHF",Money.franc(1).currency());
    }
}