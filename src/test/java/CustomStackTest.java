import org.junit.jupiter.api.Test;


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

    @Test
    void testAddChangeSize(){
        this.testStack.push(5);
        assertEquals(2, testStack.getLeftSpace());
    }

    @Test
    void testAdd(){
        this.testStack.push(1);
        this.testStack.push(2);
        this.testStack.push(3);
        assertEquals("[1, 2, 3]", this.testStack.toString());
    }

    @Test
    void testAddToManyElements(){
        assertThrows(NullPointerException.class,
                () ->{ for(int i = 0; i <= 5; i++) {
                    this.testStack.push(i);
                }
        });
    }

    @Test
    void testThrowExceptionCallPopOnEmptyStack(){
        assertThrows(NullPointerException.class,
                () ->{ this.testStack.pop(0);
                });

    }

    @Test
    void testPeek(){
        this.testStack.push(2);
        this.testStack.push(5);
        assertEquals(5, this.testStack.peak());
    }

}