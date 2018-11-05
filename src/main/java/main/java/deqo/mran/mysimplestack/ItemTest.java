package main.java.deqo.mran.mysimplestack;

import deqo.mran.mysimplestack.Item;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ItemTest {

    private Item item;

    @Before
    public void setUp() {
        // code executé avant chaque test
        item = new Item(new Object());
    }

    @Test
    public void getValue() {
        item.setValue(null);
        Assert.assertNull(item.getValue());
    }

    @org.junit.Test
    public void setValue() {
        Object o = new Object();
        item.setValue(o);
        Assert.assertEquals(item.getValue(), o);
    }
}