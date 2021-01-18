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
    void multiplicationTest() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10,product.amount);
        product = five.times(3);
        assertEquals(15,product.amount);
    }
}