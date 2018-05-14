import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class CustomStackTest {

    private CustomStack <Integer> testStack = new CustomStack<>(3);

    @Test
    void testGeneric(){
        CustomStack <String> stringStack = new CustomStack<>(0);
        CustomStack <Double> doubleStack = new CustomStack<>(0);
    }

    @Test
    void testNegativeMaxSize(){
        assertThrows(NegativeArraySizeException.class,
                ()->{ new CustomStack<>(-9); });
    }

}