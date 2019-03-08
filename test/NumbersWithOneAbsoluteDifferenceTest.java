package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumbersWithOneAbsoluteDifferenceTest {
    NumbersWithOneAbsoluteDifference obj;
    @Before
    public void setUp() throws Exception {
        obj = new NumbersWithOneAbsoluteDifference();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }


    @Test
    public void displaySteppingNumbers() {
        assertEquals(22,obj.displaySteppingNumbers(0,21));
    }

}
