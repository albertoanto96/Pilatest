package proyecto;

import org.junit.Assert;

import static org.junit.Assert.*;

public class StackImplTest {
    Stack<Integer> st1;
    @org.junit.Before
    public void setUp() throws Exception {
        st1 =new proyecto.StackImpl<Integer>(3);
        st1.push(1);
        st1.push(2);


    }

    @org.junit.After
    public void tearDown() throws Exception {
    this.st1=null;
    }

    @org.junit.Test
    public void size() throws Exception {
        assertEquals(2, st1.size());
    }

    @org.junit.Test (expected=PilaLlena.class)
    public void push() throws Exception {
        st1.push(3);
        st1.push(4);

    }

    @org.junit.Test (expected = PilaVacia.class)
    public void pop() throws Exception {
        st1.pop();
        st1.pop();
        st1.pop();
    }

}