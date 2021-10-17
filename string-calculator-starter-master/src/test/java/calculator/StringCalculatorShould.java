package calculator;

import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;

class StringCalculatorShould {

    @Test
    void empty_string_should_return_0() throws Exception {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() throws Exception {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }
    @Test
    void string_with_two_number_should_return_Sum() throws Exception {
    	StringCalculator stringCalculator = new StringCalculator();
    	assertEquals(3, stringCalculator.add("1,2"));
    }
    
    @Test
    void string_with_number_with_delemiter_return_Sum() throws Exception {
    	StringCalculator stringCalculator = new StringCalculator();
    	assertEquals(6, stringCalculator.add("1\n2,3"));
    }
    
 
    @Test
    void negativeInputException() throws Exception {
    	StringCalculator stringCalculator = new StringCalculator();
    	stringCalculator.add("-1");
    }
    
    @Test
    void ignores_numbers_greater_than_1000() throws Exception {
    	StringCalculator stringCalculator = new StringCalculator();
    	assertEquals(20, stringCalculator.add("10,10,1001"));
    }
}
