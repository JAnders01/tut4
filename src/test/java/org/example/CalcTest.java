package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest {
  Calc c = new Calc();

    @Test
    void testAddition() {
        System.out.println(c.add(2,2));
    }

    @Test
    void testSubtraction() {
        System.out.println(c.subtract(4, 2));
    }
}
