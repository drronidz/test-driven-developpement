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
        Dollar five = new Dollar(5);

        Dollar product = five.times(2);

        assertEquals( new Dollar(10),product);

        product = five.times(3);

        assertEquals(new Dollar(15),product);

    }

    @Test
    void equalityDollarTest() {
        assertEquals(new Dollar(5),new Dollar(5));
        assertNotEquals(new Dollar(5),new Dollar(8));
    }
    @Test
    void multiplicationFrancTest() {
        Franc five = new Franc(5);

        Franc product = five.times(2);

        assertEquals( new Franc(10),product);

        product = five.times(3);

        assertEquals(new Franc(15),product);

    }

    @Test
    void equalityFrancTest() {
        assertEquals(new Franc(5),new Franc(5));
        assertNotEquals(new Franc(5),new Franc(8));
    }
}