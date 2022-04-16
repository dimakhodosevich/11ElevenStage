package by.itstep.khodosevich.elevenstageproject.task05;

import org.junit.Test;
import static org.junit.Assert.*;
import static by.itstep.khodosevich.elevenstageproject.task05.module.logic.PrimeNumber.*;
import static by.itstep.khodosevich.elevenstageproject.view.Printer.*;

public class PrimeNumberTest {

    @Test
    public void testIsPrimeNumberPositive(){
        int actual_number = 7;

        boolean actual = isPrimeNumber(actual_number);
        assertTrue(ERROR_MESSAGE, actual);
    }

    @Test
    public void testIsPrimeNumberNegative(){
        int actual_number = 9;

        boolean actual = isPrimeNumber(actual_number);
        assertFalse(ERROR_MESSAGE, actual);
    }

    @Test (expected =RuntimeException.class)
    public void testIsPrimeNumberWithZero(){
        int actual_number = 0;

        isPrimeNumber(actual_number);
    }

    @Test (expected =RuntimeException.class)
    public void testIsPrimeNumberWithONe(){
        int actual_number = 1;

        isPrimeNumber(actual_number);
    }




}
