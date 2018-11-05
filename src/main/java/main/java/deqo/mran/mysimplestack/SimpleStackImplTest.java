package main.java.deqo.mran.mysimplestack;


import deqo.mran.mysimplestack.Item;
import deqo.mran.mysimplestack.SimpleStack;
import deqo.mran.mysimplestack.SimpleStackImpl;
import org.junit.Assert;

public class SimpleStackImplTest {

    private SimpleStack simpleStack;

    @org.junit.Before
    public void setUp() {
        simpleStack = new SimpleStackImpl();
        System.out.println("Je suis exécuté avant chaque test");
    }

    @org.junit.Test
    public void isEmpty() {
        Assert.assertTrue(simpleStack.isEmpty());
        String element1 = "toto";
        simpleStack.push(new Item(element1));
        Assert.assertFalse(simpleStack.isEmpty());

    }

    @org.junit.Test
    public void getSize() {
        Assert.assertEquals(0, simpleStack.getSize());
        String element = "toto";
        simpleStack.push(new Item(element));
        simpleStack.push(new Item(element + "2"));
        Assert.assertEquals(2, simpleStack.getSize());
    }

    @org.junit.Test
    public void push() {
        Item ita = new Item(8);
        Assert.assertEquals(0, simpleStack.getSize());
        simpleStack.push(ita);
        Assert.assertEquals(1, simpleStack.getSize());
    }

    /**
     * Commentaire correspondant à l'exigence #1
     * */
    @org.junit.Test
    public void peek() {
        Item item = new Item(new Integer(8));
        Assert.assertEquals(0, simpleStack.getSize());
        simpleStack.push(item);
        Assert.assertEquals(1, simpleStack.getSize());
        Item o = simpleStack.peek();
        // ne doit pas retirer l'objet de la pile
        Assert.assertEquals(1, simpleStack.getSize());
        // on doit retrouver l'ojet initial
        Assert.assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer)o.getValue();
        Assert.assertEquals(8, integer.intValue());
        Assert.assertEquals(item.getValue(), integer);
    }

    /**
     * Commentaire correspondant à l'exigence #1
     * */
    @org.junit.Test
    public void pop() {
        Item item = new Item(new Integer(8));
        Assert.assertEquals(0, simpleStack.getSize());
        simpleStack.push(item);
        Assert.assertEquals(1, simpleStack.getSize());
        Item o = simpleStack.pop();
        // on doit retirer l'objet de la pile
        Assert.assertEquals(0, simpleStack.getSize());
        // on doit retrouver l'objet initial
        Assert.assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer)o.getValue();
        Assert.assertEquals(8, integer.intValue());
        Assert.assertEquals(item.getValue(), integer);
    }
}